package com.example.expmdmfebrero.features.album.domain

data class Album(
    val id: Int,
    val name: String,
    val creationDate: String,
    val description: String,
    val imageUrl: String,
    var isFavorite: Boolean = false
)