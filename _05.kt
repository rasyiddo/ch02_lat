val name: String? = getUserName()

// 1. Safe call - tidak crash, hasilnya null kalau name null 
val length = name?.length

// 2. Elvis operator - fallback kalau null 
val length = name?.length ?: 0 

// 3. Non-null assertion - crash kalau null (hindari kalau bisa)
val length = name!!.length

// 4. smart cast setelah null check
if (name!= null) {
    println(name.length) // di sini name sudah otomatis String, bukan String?
}