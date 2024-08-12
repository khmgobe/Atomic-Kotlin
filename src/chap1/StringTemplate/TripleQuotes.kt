package chap1.StringTemplate

fun main() {
    val s = "value"

    // 큰따옴표 등의 특수 문자를 넣어야 하는 경우 역슬래시를 사용해 이스케이프 하거나 String 리터럴 사용.
    println("s = \$s\".")
    println("""s = "$s".""")
}