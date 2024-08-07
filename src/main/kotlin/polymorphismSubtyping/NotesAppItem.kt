package main.kotlin.polymorphismSubtyping

import java.util.Date

open class NotesAppItem {

    open fun getItemData() = ""
}

class MessageItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: String,
) : NotesAppItem() {

    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\n" +
                "Type: $type\n" +
                "Data: $data"

    }
}

class PhoneItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: Long,
) : NotesAppItem() {

    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\n" +
                "Type: $type\n" +
                "Data: $data"

    }
}

class ListItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: List<String>,
) : NotesAppItem() {

    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\n" +
                "Type: $type\n" +
                "Data: $data"
    }
}