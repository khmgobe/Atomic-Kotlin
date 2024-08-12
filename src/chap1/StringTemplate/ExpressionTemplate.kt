package chap1.StringTemplate

fun main() {
    val condition = true
    println("${if (condition) "true" else "false"}")
    val x = 11
    println("$x + 4 = ${x + 4}")
}