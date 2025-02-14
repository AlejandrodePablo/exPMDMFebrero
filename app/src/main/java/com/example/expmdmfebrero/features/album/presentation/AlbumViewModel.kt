package com.example.expmdmfebrero.features.album.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.expmdmfebrero.features.album.domain.Album
import com.example.expmdmfebrero.features.album.domain.GetAlbumsUseCase
import kotlinx.coroutines.launch
import org.koin.android.annotation.KoinViewModel

@KoinViewModel
class AlbumViewModel(private val getAlbumsUseCase: GetAlbumsUseCase) : ViewModel() {

    private val _uiState = MutableLiveData(UiState())
    val uiState: LiveData<UiState> = _uiState

    fun fetchAlbum() {
        _uiState.value = UiState(isLoading = true)
        viewModelScope.launch {
            val album = getAlbumsUseCase.invoke()
            _uiState.value = UiState(album = album)
        }
    }

    data class UiState(
        val isLoading: Boolean = false,
        val album: List<Album>? = null,
        val error: String? = null
    )
}