package chap1.Booleans

fun isClosed(hour : Int) {
    val open = 0
    val closed = 20
    println("Operating hours: $open - $closed")
    val status = hour < open || hour > closed
    println("Closed: $status")
}

fun main() = isClosed(0)