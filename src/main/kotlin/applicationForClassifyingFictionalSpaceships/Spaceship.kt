package main.kotlin.applicationForClassifyingFictionalSpaceships

open class Spaceship(
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {
    fun switchToWarpMode() {
        println("$name: Переход в варп-режим")
    }

    open fun runSystemDiagnostic() {
        println("${name}: Запущена диагностика системы корабля")
    }
}