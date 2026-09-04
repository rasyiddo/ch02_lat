// Menambahkan fungsi ke String 
fun String.titleCase(): String = 
    split(" ").joinToString(" ") { word ->
    word.replaceFirstChar { it.uppercase() }
}

" hello world".titleCase()  // "hello world"

// Menambahkan fungsi ke Int 
fun Int.toRupiah(): String = "Rp ${"%,d".format(this)}"

50000.toRupiah() // "Rp.50.000"

// Extension di Android sangat umum 
fun View.show() { visibility = View.VISIBLE } 
fun View.hide() { visibility = View.GONE }
fun Context.toast (message: String) =
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()