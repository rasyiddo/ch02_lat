// Singleton - hanya ada satu instance
object AppConfig {
        const val BASE_URL = "https://api.example.com" 
        const val TIMEOUT = 30L
}

// Companion object - seperti static method di Java 
class UserRepository { 
    companion object {
        fun create(): UserRepository = UserRepository()
    }
}
val repo = UserRepository.create()