package main.kotlin.circleClass

class Circle(val radius: Double) {

    fun calculateArea(): Double {
        val area: Double = Math.PI * Math.pow(this.radius, 2.0)
        return area
    }
}