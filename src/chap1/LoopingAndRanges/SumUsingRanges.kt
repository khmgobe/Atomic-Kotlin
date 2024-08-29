package chap1.LoopingAndRanges

fun main() {
    var sum = 0
    for (n in 10.. 100) {
        sum += n
    }
    println("sum = $sum")
}