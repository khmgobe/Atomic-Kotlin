package chap1.IfExpressions

fun main() {
    val n: Int = -11
    if( n > 0) {
        println("It 's positive")
    } else if(n == 0) {
        println("It 's Zero")
    } else {
        println("It 's negative")
    }
}