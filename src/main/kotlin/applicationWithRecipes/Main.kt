package main.kotlin.applicationWithRecipes

fun main() {
    val dish1: Dish = Dish(
        id = 1,
        name = "Яичница",
        category = "Завтраки",
        ingredients = listOf("яйцо", "помидор", "соль", "перец"),
    )

    val dish2: Dish = Dish(
        id = 2,
        name = "Суп лапша",
        category = "Обеды",
        ingredients = listOf("вода", "курица", "вермишель", "соль", "перец"),
    )

    println(dish1.name)
    println(dish1.ingredients)
    println(dish1.inFavorites)
    println()
    println(dish2.name)
    println(dish2.ingredients)
    println(dish2.inFavorites)

    dish1.category = "Блюда из яиц"
    dish2.inFavorites = true
    println(dish1.category)
    println(dish2.inFavorites)

    println("Действие для блюда Яичница")
    dish1.addToFavorites()
    println(dish1.inFavorites)
    dish1.startCooking()

    println()

    println("Действие для блюда Суп лапша")
    dish2.addToFavorites()
    println(dish2.inFavorites)
    val ingredientsForSoup = dish2.downloadIngredients()
    println(ingredientsForSoup)
    dish2.removeFromFavorites()
    println(dish2.inFavorites)
    println()

    val ingredient1 = Ingredient("картошка", 100, 1)
    println(ingredient1.name)
    ingredient1.name = "репчатый лук"
    println(ingredient1.name)
    println()

    val ingredient2 = Ingredient("Морковь", 50, 1, true)
    println(ingredient2.name)
}