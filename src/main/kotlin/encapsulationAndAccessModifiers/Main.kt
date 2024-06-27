package main.kotlin.encapsulationAndAccessModifiers

fun main() {

    val guide = HitchhikerGuide()
    guide.title = "Don't panic"
    guide.chooseArticle()

    println(guide.getNumberOfPages())

    guide.setNumberOfPages(42_000)
    println(guide.getNumberOfPages())

    Support().printInfo()
}