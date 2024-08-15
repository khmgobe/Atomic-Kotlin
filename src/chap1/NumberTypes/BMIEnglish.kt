package chap1.NumberTypes

fun bmiEnglish (
    weight: Int,
    height: Int,
): String {
    // Double 값을 앞부분에 두면 강제 캐스팅
    val bmi = weight / (height * 803.07)
    return if (bmi < 18.5) "Underweight"
    else   if (bmi < 25) "Normal weight"
    else "OverWeight"
}

fun main() {
    val weight = 160
    val height = 68
    val status = bmiEnglish(weight, height)
    println(status)
}