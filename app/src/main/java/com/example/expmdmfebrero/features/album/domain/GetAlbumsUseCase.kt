package com.example.expmdmfebrero.features.album.domain

import org.koin.core.annotation.Single

@Single
class GetAlbumsUseCase(private val repository: AlbumRepository) {
    suspend operator fun invoke(): List<Album> = repository.getAlbums()
}