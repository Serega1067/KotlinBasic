package main.kotlin.triangleClass

fun main(){

    val numberOfTriangle: Int = readLine()?.toInt() ?: 0
    var count = 0

    val listOfCoordinates: List<List<Double>> = List(numberOfTriangle) {
        readln().split(" ").map {it.toDouble()}
    }

    val listOfTriangle = List(numberOfTriangle) {
        Triangle(
            listOfCoordinates[count][0],
            listOfCoordinates[count][1],
            listOfCoordinates[count++][2]
        )
    }

    listOfTriangle.forEach {
        if (it.isEquilateral()) {
            println("Equilateral")
        } else {
            println("Not Equilateral")
        }
    }
}