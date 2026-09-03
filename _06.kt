// Fungsi biasa
fun greet(name: String): String {
    return "Hello, $name!"
}

// Single-expression function 
fun greet(name: String): String= "Hello, $name!"

// Default parameter
fun greet(name: String = "Dunia"): String = "Hello, $name!"

// Named argument
greet(name= "Budi")

// Unit = void dalam kotlin 
fun logMessage(message: String): Unit {
    println(message)
}
// Unit bisa dihilangkan 
fun logMessage(message: String) {
    println(message)
}