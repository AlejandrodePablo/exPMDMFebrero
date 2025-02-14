package com.example.expmdmfebrero.features.album.presentation

import androidx.recyclerview.widget.RecyclerView
import com.example.expmdmfebrero.databinding.ItemAlbumBinding
import com.example.expmdmfebrero.features.album.domain.Album

class AlbumViewHolder(private val binding: ItemAlbumBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind() {
        binding.albumCard
    }
}
