package chap2.ObjectsEverywhere

fun main() {
    RangeSum()
    Strings()
    Conversion()
    frac()
}

fun RangeSum() {
    val r = IntRange(0, 10)
    println(r.sum())
}

fun Strings() {
    val s = "AbcD"
    println(s.reversed())
    println(s.toLowerCase())
}

fun Conversion() {
    val s = "123"
    println(s.toInt())
    val i = 123
    println(i.toString())
}

fun fraction(numerator: Long, denom: Long) = numerator.toDouble() / denom

fun frac() {
    val num = 1
    val den = 2
    val f = fraction(num.toLong(), den.toLong())
    println(f)
}