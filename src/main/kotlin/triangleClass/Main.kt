package main.kotlin.triangleClass

fun main(){

    val numberOfTriangle: Int = readLine()?.toInt() ?: 0

    val listOfCoordinates: List<List<Int>> = List(numberOfTriangle) {
        readln().split(" ").map {it.toInt()}
    }
}