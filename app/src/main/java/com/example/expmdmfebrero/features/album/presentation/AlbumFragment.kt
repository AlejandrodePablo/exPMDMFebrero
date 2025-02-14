package com.example.expmdmfebrero.features.album.presentation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.expmdmfebrero.databinding.FragmentAlbumBinding


class AlbumFragment : Fragment() {

    private val albumViewModel: AlbumViewModel by viewModels()

    private var _binding: FragmentAlbumBinding? = null
    private val binding get() = _binding!!

    private lateinit var albumAdapter: AlbumAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAlbumBinding.inflate(inflater, container, false)

        albumAdapter = AlbumAdapter(emptyList())
        binding.albumRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.albumRecyclerView.adapter = albumAdapter

        observeAlbumUiState()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun observeAlbumUiState() {
        albumViewModel.uiState.observe(viewLifecycleOwner) { uiState ->
            if (uiState.album != null) {
                albumViewModel.fetchAlbum()
            } else {

                if (uiState.isLoading) {
                    Log.d("@dev", "Cargando...")
                } else if (uiState.error != null) {
                    Log.d("@dev", "Error al cargar los álbumes")
                } else {
                    Log.d("@dev", "Cargado")
                }
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
