import scala.collection.mutable.ArrayBuffer

case class StockPrice(ticker : String, price : Double) {
  def print =
    println("Top stock is " + ticker + " at price $" + price)
}

def getPrice(ticker : String) = {
  val url = s"http://download.finance.yahoo.com/d/quotes.csv?s=${ticker}&f=snbaopl1"
  val data = io.Source.fromURL(url).mkString
  val price = data.split(",")(4).toDouble
  StockPrice(ticker, price)
  
  val stockPrices = new ArrayBuffer[StockPrice]
for(ticker <- tickers) {
  stockPrices += getPrice(ticker)
}
val stockPricesLessThan500 = new ArrayBuffer[StockPrice]
for(stockPrice <- stockPrices) {
  if(isNotOver500(stockPrice)) stockPricesLessThan500 += stockPrice
}
var highestPricedStock = StockPrice("", 0.0)
for(stockPrice <- stockPricesLessThan500) {
  highestPricedStock =
    pickHighPriced(highestPricedStock, stockPrice)
}
}
