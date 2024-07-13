package main.kotlin.studentClass

fun main() {

    val numberOfStudents: Int = readln().toInt()
    val listData = List<String>(numberOfStudents) {
        readln()
    }
    var count: Int = 0

    val listStudent: List<Student> = List<Student>(numberOfStudents) {
        val (name, age) = listData[count++].split(" ")
        Student(name, age.toInt())
    }

    listStudent.forEach { println("Name: ${it.name}, Age: ${it.age}") }
}