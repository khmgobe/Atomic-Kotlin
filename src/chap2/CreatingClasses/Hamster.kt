package chap2.CreatingClasses

class Hamster {
    fun spek() = "Squak!"
    fun exercise() =
        this.spek() +
                spek() +
                "Runnint on wheel"
}

fun main() {
    val hamster = Hamster()
    println(hamster.exercise())
}