package main.kotlin.circleClass

fun main() {

    val r: Double = readLine()?.toDoubleOrNull() ?: 0.0

    val circle: Circle = Circle(r)

    println(
        "Radius: ${circle.radius}\n" +
        "Area: ${circle.calculateArea()}"
    )
}
