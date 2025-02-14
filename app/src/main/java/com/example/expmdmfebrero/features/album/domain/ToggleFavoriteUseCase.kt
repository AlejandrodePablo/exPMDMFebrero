package com.example.expmdmfebrero.features.album.domain

class ToggleFavoriteUseCase(private val repository: AlbumRepository) {
    suspend operator fun invoke(albumId: Int): Album = repository.toggleFavorite(albumId)
}