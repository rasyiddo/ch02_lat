// let - transformasi atau null check
val result = user?.let {
    "${it.name} (${it.age}) tahun"
}

// apply - konfigurasi object, mengembalikan object itu sendiri
val textView = TextView(context).apply {
    text = "Hello"
    textSize = 16f
    setTextColor(Color.BLACK)
}

// run - seperti apply tapi mengembalikan nilai terakhir
val greeting = user.run {
    "Selamat datang, $name!"
}

// also - seperti let tapi mengembalikan object asli (untuk side effect)
val user = createUser().also {
    Log.d("TAG", "User created: ${it.name}")
}

// with - mirip run, tapi receiver di-pass sebagai argumen
val message = with(user) {
    "Nama: $name, Email: $email"
}