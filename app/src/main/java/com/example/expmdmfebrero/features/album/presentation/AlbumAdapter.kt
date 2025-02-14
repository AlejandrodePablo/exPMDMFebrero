package com.example.expmdmfebrero.features.album.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.expmdmfebrero.databinding.ItemAlbumBinding
import com.example.expmdmfebrero.features.album.domain.Album

class AlbumAdapter(private val albums: List<Album>) : RecyclerView.Adapter<AlbumViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val binding = ItemAlbumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AlbumViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album = albums[position]
        holder.bind()
    }

    override fun getItemCount(): Int = albums.size
}