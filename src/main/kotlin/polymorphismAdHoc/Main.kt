package main.kotlin.polymorphismAdHoc

import java.util.Date

fun main() {

    val creationDate = Date()
    val note = NotesAppItem()

    note.addItemToCell(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate"
    )
    println()

    note.addItemToCell(
        "sister's number",
        creationDate,
        "phone",
        89914424242,
    )
    println()

    note.addItemToCell(
        "todolist",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "buy new shoes"),
    )
}