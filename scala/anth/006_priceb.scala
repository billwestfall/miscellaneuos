object Priceb {
    def main(args: Array[String]) = {
        val prices = List(10, 20, 15, 30, 45, 25, 82)
        prices.foreach { price => println(price) }
        println("The first price is " + prices(0))
        println("The fifth element is " + prices(4))
        println("First price > 40 is " + prices.find { price => price > 40 })
        println("All prices > 40 are " + prices.filter { price => price > 40 })
        println("Any > 90: " + prices.exists { price => price > 90})
        println("All < 90: " + prices.forall { price => price < 90 })
    }
}
