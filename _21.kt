// Membuat Flow
fun getUserUpdates(): Flow<User> = flow {
    while (true) {
        val user = api.getLatestUser()
        emit(user)              // kirim nilai ke collector
        delay(5000)             // tunggu 5 detik
    }
}

// Mengkonsumsi Flow
viewModelScope.launch {
    getUserUpdates()
        .filter { it.isActive }
        .map { it.toDisplayModel() }
        .collect { user ->
            _uiState.value = user
        }
}