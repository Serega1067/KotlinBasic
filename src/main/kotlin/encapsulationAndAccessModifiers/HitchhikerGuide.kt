package main.kotlin.encapsulationAndAccessModifiers

private val supportInfo = "Support Info"

class HitchhikerGuide {

//    private var title = ""
//
//    private fun chooseArticle() {
//        println("Open catalog")
//    }

    var title = ""
    private var numberOfPages = 999

    fun chooseArticle() {
        println("Open catalog")
    }

    fun getNumberOfPages() = numberOfPages
    fun setNumberOfPages(number: Int) {
        numberOfPages = number
    }
}

class Support {
    fun printInfo() {
        println(HitchhikerGuide::class.simpleName)
        println(HitchhikerGuide().title)
        println(supportInfo)
    }
}