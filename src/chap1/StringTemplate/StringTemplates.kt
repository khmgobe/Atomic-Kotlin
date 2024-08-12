package chap1.StringTemplate

fun main() {
    val answer = 42

    // 식별자 이름 앞에 $를 붙이면 문자열 템플릿이 식별자의 내용을 String에 넣어준다.
    println("Found $answer!")
    println("printing a $1")
}