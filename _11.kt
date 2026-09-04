val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// filter - ambil yang memenuhi kondisi
val evens = numbers.filter {it % 2 == 0 } // [2, 4, 6, 8, 10]

// map transformasi setiap elemen
val doubled = numbers.map {it 2 } // [2, 4, 6, 8, 10, ...

// find - elemen pertama yang cocok
val firstEven = numbers. find { it % 2 == 0 } // 2

// any /all / none 
val hasNegative = numbers.any { it < 0 } // false
val allPositive = numbers.all { it > 0 } // true


// groupBy
val students = listof(
    Student("Ali", "A"),
    Student("Budi", "B"),
    Student("Cici", "A")
)

val byGrade students.groupBy {it.grade} 
// {"A": [Ali, Cici], "B": [Budi]}

// sortedBy
val sorted students.sortedBy {it.name}

// Chaining
val result = numbers
    .filter {it % 2 == 0 }
    .map { it * it}
    .sortedDescending()
    .take(3)