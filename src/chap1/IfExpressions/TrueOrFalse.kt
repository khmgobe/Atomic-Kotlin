package chap1.IfExpressions

// 반환 타입을 바로 대입받도록 변경하면 return을 쓰지 않아도 된다.
fun trueOrFalse(exp: Boolean): String =
    if (exp)
         "true"
     else
        "false"

fun main() {
    val b = 1
    println(trueOrFalse(b < 3))
    println(trueOrFalse(b >=3 ))
}