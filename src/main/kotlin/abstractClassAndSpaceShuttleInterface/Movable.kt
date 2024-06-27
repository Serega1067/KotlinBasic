package main.kotlin.abstractClassAndSpaceShuttleInterface

interface Movable {

    fun startEngine() {
        println("Двигатель запущен")
    }

    fun prepareForTakeoff()
    fun prepareForLanding()
}