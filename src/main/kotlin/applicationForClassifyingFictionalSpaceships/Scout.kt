package main.kotlin.applicationForClassifyingFictionalSpaceships

class Scout(
    name: String,
    speed: Int,
    val radarRange: Int,
    val afterburnerSpeed: Int,
) : Spaceship(name, speed) {

    fun handleDataFromRadar() {
        println("$name: обработать данные радара")
    }

    fun runAfterburner() {
        println("$name: форсаж запущен")
    }
}