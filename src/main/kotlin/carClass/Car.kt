package main.kotlin.carClass

class Car(private val brand: String, private val year: Int) {
    fun printDetails() {
        println("Brand: ${this.brand}, Year: ${this.year}")
    }
}