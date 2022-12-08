import scala.collection.mutable.ArrayBuffer
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
