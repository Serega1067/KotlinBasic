package main.kotlin.applicationWithRecipes

class Ingredient(var name: String, val weight: Int, val count: Int) {
//    var name = _name
//    var weight = _weight
//    var count = _count

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        _isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {

        isNeedToPrepare = _isNeedToPrepare
    }

    init {
        println("Ингредиент $name создан")
    }

    // вторичный конструктор
    // первичный конструктор
    // блок init
    // тело вторичного конструктора
}