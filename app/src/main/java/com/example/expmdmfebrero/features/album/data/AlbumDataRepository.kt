package com.example.expmdmfebrero.features.album.data

import com.example.expmdmfebrero.features.album.data.local.AlbumMockLocalDataSource
import com.example.expmdmfebrero.features.album.domain.Album
import com.example.expmdmfebrero.features.album.domain.AlbumRepository
import com.example.expmdmfebrero.features.album.domain.Mushroom
import org.koin.core.annotation.Single

@Single
class AlbumDataRepository(
    private val localDataSource: AlbumMockLocalDataSource
) : AlbumRepository {

    override suspend fun getAlbums(): List<Album> {
        return localDataSource.getAlbums()
    }

    override suspend fun getMushroomForAlbum(albumId: Int): List<Mushroom> {
        TODO("Not yet implemented")
    }

    override suspend fun toggleFavorite(albumId: Int): Album {
        TODO("Not yet implemented")
    }
}