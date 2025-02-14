package com.example.expmdmfebrero.features.album.domain

interface AlbumRepository {
    suspend fun getAlbums(): List<Album>
    suspend fun getMushroomForAlbum(albumId: Int): List<Mushroom>
    suspend fun toggleFavorite(albumId: Int): Album
}