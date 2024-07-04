package main.kotlin.polymorphismSubtyping

import java.util.Date

fun main() {

    val creationDate: Date = Date()

    // It's not really polymorphism
//    val messageItem: MessageItem = MessageItem(
//        "call sister",
//        creationDate,
//        "message",
//        "call sister to congratulate"
//    )
//
//    val phoneItem: PhoneItem = PhoneItem(
//        "sister's number",
//        creationDate,
//        "phone",
//        89914424242,
//    )
//
//    val listItem: ListItem = ListItem(
//        "todolist",
//        creationDate,
//        "list",
//        listOf("wash dog", "do the cleaning", "buy new shoes"),
//    )

//    println(messageItem.getItemData())
//    println()
//    println(phoneItem.getItemData())
//    println()
//    println(listItem.getItemData())

    // This is polymorphism
    val messageItem: NotesAppItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate"
    )

    val phoneItem: NotesAppItem = PhoneItem(
        "sister's number",
        creationDate,
        "phone",
        89914424242,
    )

    val listItem: NotesAppItem = ListItem(
        "todolist",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "buy new shoes"),
    )

    val arrayOfNotes = arrayOf<NotesAppItem>(
        messageItem,
        phoneItem,
        listItem
    )

    showAllNotes(arrayOfNotes)

}

fun showAllNotes(notes: Array<NotesAppItem>) {
    notes.forEach {
        println(it.getItemData())
    }
}
