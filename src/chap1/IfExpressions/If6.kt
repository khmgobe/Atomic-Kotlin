package chap1.IfExpressions

fun main() {
    val num = 10
    // if문장 전체가 식이므로 이렇게 적용도 가능하다.
    val result = if (num > 100) 4 else 42
        println(result)
}