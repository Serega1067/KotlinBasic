package main.kotlin.singletonLogger

fun main() {

    val numberOfLog: Int = readLine()?.toInt() ?: 0

    val listLog: List<String> = List<String>(numberOfLog) {
        readln()
    }

    listLog.forEach {Logger.log(it)}
}

object Logger {
    fun log(message: String) {
        println("Log: $message")
    }
}