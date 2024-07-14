package main.kotlin.triangleClass

class Triangle(
    val side1: Double,
    val side2: Double,
    val side3: Double
) {

    fun isEquilateral(): Boolean {
        return if (
            this.side1 == this.side2 &&
            this.side2 == this.side3
        ) {
            true
        } else {
            false
        }
    }
}