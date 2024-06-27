package main.kotlin.abstractClassAndSpaceShuttleInterface

abstract class SpaceShuttle : Movable, Shootable {

    abstract val tankSize: Int
    abstract fun runDiagnostic()
}

class Upsilon(override val tankSize: Int) : SpaceShuttle() {

    override fun runDiagnostic() {
        println("Диагностика запущена")
    }

    override fun prepareForTakeoff() {
        println("Развурнуть крылья")
    }

    override fun prepareForLanding() {
        println("Свернуть крылья")
    }

    override fun startShooting() {
        println("Начать стрельбу")
    }

    override fun reloadGuns() {
        println("Перезарядить орудия N")
    }
}