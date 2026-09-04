// Fungsi yang menerima lambda
fun doOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int { 
    return operation(a, b)
}

val sum = doOperation (5, 3) { x, y -> x + y } // 8
val product = doOperation (5, 3) { x, y -> x * y } // 15

// Lambda tersimpan di variabel 
val multiply: (Int, Int) -> Int { x, y -> x * y }
val greet: (String) -> String = { name  -> "Hello, $name!" }
val double: (Int) -> Int { it * 2 } // 'it' untuk parameter tunggal 