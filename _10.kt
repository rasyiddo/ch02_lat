// Immutable (read-only)
val fruits = listOf("Apple", "Banana", "Cherry")
val uniqueIds = setOf(1,2,3,2)  // {1,2,3}

// Mutable 
val mutableFruits = mutableListOf("Apple", "Banana")
mutableFruits.add("Cherry")
mutableFruits.removeAt(0)

val mutableScores = mutableMapOf ("Ali" to 90)
mutableScores["Budi"] = 85