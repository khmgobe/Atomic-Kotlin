package chap2.CreatingClasses

class Cat {
    fun meow() = "mrrrow"
}

fun main() {
    val cat = Cat()
    val m1 = cat.meow()
    println(m1)
}