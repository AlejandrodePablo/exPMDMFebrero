package com.example.expmdmfebrero.features.album.data.local

import com.example.expmdmfebrero.features.album.domain.Album
import org.koin.core.annotation.Single

@Single
class AlbumMockLocalDataSource {
    private val albums = mutableListOf(
        Album(
            1,
            "Mystic Mushrooms",
            "2023-01-01",
            "A collection of mystic mushrooms.",
            "https://example.com/mystic.jpg"
        ),
        Album(
            2,
            "Forest Forays",
            "2023-01-05",
            "Exploring the deep forest mushrooms.",
            "https://example.com/forest.jpg"
        ),
        Album(
            3,
            "Urban Fungi",
            "2023-01-10",
            "Discovering urban mushrooms.",
            "https://example.com/urban.jpg"
        ),
        Album(
            4,
            "Spring Sprouts",
            "2023-02-01",
            "Fresh mushrooms in spring.",
            "https://example.com/spring.jpg"
        ),
        Album(
            5,
            "Autumn Harvest",
            "2023-03-01",
            "Rich autumn mushroom collection.",
            "https://example.com/autumn.jpg"
        ),
        Album(
            6,
            "Winter Wonders",
            "2023-03-15",
            "Rare winter mushrooms.",
            "https://example.com/winter.jpg"
        ),
        Album(
            7,
            "Exotic Edibles",
            "2023-04-01",
            "Exotic mushrooms from around the world.",
            "https://example.com/exotic.jpg"
        ),
        Album(
            8,
            "Garden Gems",
            "2023-04-10",
            "Mushrooms found in urban gardens.",
            "https://example.com/garden.jpg"
        ),
        Album(
            9,
            "Mystery Mix",
            "2023-05-01",
            "A mix of mysterious mushrooms.",
            "https://example.com/mystery.jpg"
        ),
        Album(
            10,
            "Vintage Varieties",
            "2023-05-10",
            "Classic mushrooms from previous decades.",
            "https://example.com/vintage.jpg"
        )
    )

    suspend fun getAlbums(): List<Album> {
        return albums
    }
}