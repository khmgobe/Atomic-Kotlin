package chap2.Constructors

class AlienSpecies (
    val name: String,
    val eyes: Int,
    val hands: Int,
    val legs: Int
) {
    fun descripbe() =
        "$name with $eyes eyes, " +
                "$hands hand and legs"
}

fun main() {
    val kevin =
        AlienSpecies("Zigerion", 2,2,2)
    val mortyJr =
        AlienSpecies("Gazorpian", 2,6,2)
    println(kevin.descripbe())
    println(mortyJr.descripbe())
}