package main.kotlin.polymorphismAdHoc

import java.util.Date

class NotesAppItem {

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: String,
    ) {

        println("Item \"$title\" added to cell - $creationDate\n" +
                "Type: $type\n" +
                "Data: $data"
        )

    }

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: Long,
    ) {

        println("Item \"$title\" added to cell - $creationDate\n" +
                "Type: $type\n" +
                "Data: $data"
        )

    }

    fun addItemToCell(
        title: String,
        creationDate: Date,
        type: String,
        data: List<String>,
    ) {

        println("Item \"$title\" added to cell - $creationDate\n" +
                "Type: $type\n" +
                "Data: $data"
        )

    }
}