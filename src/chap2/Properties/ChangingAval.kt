package chap2.Properties

class House {
    var sofa: String = ""
}

fun main() {
    val house = House()
    house.sofa = "Simple slepper sofa: $89.00"
    println(house.sofa)
    house.sofa = "New leather sofa: $3,099.00"
    println(house.sofa)
}