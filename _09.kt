for (i in 1..5) println(i)          // 1,2,3,4,5
for (i in 1 until 5) println(i)     // 1,2,3,4
for (i in 5 downTo 1) println(i)    // 5,4,3,2,1
for (i in 0..10 step 2) println(i)  //0,2,4,6,8,10

val names = listOf("Ali", "Budi", "Cici")
for (name in names) println(name)
names.forEachIndexed { index, name -> println("$index: $name") }

while (condition) {...}
do {...} while (condition)