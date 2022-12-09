def isPrime(number : Int) = {
  val sqrtOfNumber = math.sqrt(number).toInt
  val hasFactorsOtherThan1AndItself =
    (2 to sqrtOfNumber).exists { i => number % i == 0 }
  number > 1 && !hasFactorsOtherThan1AndItself
