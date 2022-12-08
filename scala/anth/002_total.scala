object Total {
    def main(args: Array[String]) = {
        val prices = List(211.10, 310.12, 510.45, 645.60, 832.33)
        var total = 0.0
          for(price <- prices) {
            total += price
          }
        println("Total is " + total)
    }
}
