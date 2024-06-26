package main.kotlin.abstractClassAndSpaceShuttleInterface

fun main() {
    println("Start")

    val upsilonShuttle = Upsilon(50)

    upsilonShuttle.runDiagnostic()
    upsilonShuttle.prepareForTakeoff()
    upsilonShuttle.prepareForLanding()
    upsilonShuttle.startShooting()
    upsilonShuttle.reloadGuns()
}