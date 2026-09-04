// SALAH: ini memblokir UI thread, aplikasi jadi freeze
fun loadData() {
    val data = networkCall()  // ini bisa butuh waktu 3 detik
    updateUI(data)            // selama 3 detik, UI tidak responsif
}

// SALAH (cara lama): callback hell
fun loadData() {
    networkCall(
        onSuccess = { data ->
            parseData(data,
                onSuccess = { parsed ->
                    saveToDb(parsed,
                        onSuccess = { updateUI(it) },
                        onError = { handleError(it) }
                    )
                }
            )
        },
        onError = { handleError(it) }
    )
}

// BENAR dengan Coroutines: sequential, mudah dibaca
suspend fun loadData() {
    val data = networkCall()  // suspend, tidak memblokir
    val parsed = parseData(data)
    saveToDb(parsed)
    updateUI(parsed)
}