// launch - fire and forget, tidak mengembalikan nilai
viewModelScope.launch {
    val users = repository.getUsers()  // suspend
    _uiState.value = users
}

// async/await - mengembalikan nilai, bisa dijalankan paralel
viewModelScope.launch {
    val usersDeferred = async { repository.getUsers() }
    val postsDeferred = async { repository.getPosts() }

    val users = usersDeferred.await()  // tunggu keduanya
    val posts = postsDeferred.await()

    updateUI(users, posts)
}

// withContext - switch dispatcher di tengah coroutine
suspend fun fetchAndSave() {
    val data = withContext(Dispatchers.IO) {
        api.fetchData()  // jalankan di IO thread
    }

    // kembali ke dispatcher asal
    updateUI(data)  // di Main thread (jika dipanggil dari viewModelScope)
}