
data class User(
    val id: Int,
    val name: String,
    val email: String
)

val user1 = User(1, "Budi", "budi@email.com")
val user2 = user1.copy(name = "Ali") // copy dengan perubahan  

println(user1 == user2)         // false ( perbandingan berdasarkan isi)
val (id, name, email) = user1   // User(id=1, name=Budi, email=budi@email.com)

// Destructuring
val (id, name, email) = user1