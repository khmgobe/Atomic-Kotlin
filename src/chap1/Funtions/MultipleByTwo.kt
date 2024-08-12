package chap1.Funtions

// 파라미터가 하나인 함수를 만들어 Int의 계산  결과 반환한다.
fun multiplyByTwo(x: Int): Int {
    println("Inside multiplyByTwo")
    return x * 2;
}

fun main() {
    val r = multiplyByTwo(5)
    println(r)
}