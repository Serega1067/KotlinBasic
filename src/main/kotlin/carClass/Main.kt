package main.kotlin.carClass

fun main() {

    val numberOfCars: Int = readlnOrNull()?.toInt() ?: 0

    fun readData(data: String): List<String> {

        val (brand, year) = data.split(" ")
        return listOf(brand, year)
    }

    val listCars: MutableList<Car> = mutableListOf()

    for (i in 0 until numberOfCars) {
        val (brand, year) = readData(readln())
        listCars.add(Car(brand, year.toInt()))
    }

    listCars.forEach { it.printDetails() }
}