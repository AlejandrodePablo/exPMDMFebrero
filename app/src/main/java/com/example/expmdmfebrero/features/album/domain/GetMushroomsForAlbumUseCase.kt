package com.example.expmdmfebrero.features.album.domain

class GetMushroomsForAlbumUseCase(private val repository: AlbumRepository) {
    suspend operator fun invoke(albumId: Int): List<Mushroom> =
        repository.getMushroomForAlbum(albumId)
}