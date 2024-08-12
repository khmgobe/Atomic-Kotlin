package chap1.DataTypes

fun main() {

    // 코틀린이 타입 추론을 하지않게 내버려두고 명시적 선언
    val whole: Int = 11
    val fractional: Double = 1.4
    val trueOrFalse: Boolean = true
    val character: Char = 'z'

    // 큰 따옴표 세개로 문자열을 감싸는 것을 raw String 이라 한다.
    val lines: String = """Triple quotes let you have many lines in your string"""

    println(whole)
    println(fractional)
    println(trueOrFalse)
    println(character)
    println(lines)
}