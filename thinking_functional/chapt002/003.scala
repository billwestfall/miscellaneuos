scala> def perfect(n: Int) = 
     |   (for (x <- 2 to n/2 if n % x == 0) yield x).sum + 1 == n
perfect: (n: Int)Boolean

scala> perfect(6)
res0: Boolean = true

scala> perfect(7)
res1: Boolean = false

scala> perfect(28)
res2: Boolean = true

scala> perfect(29)
res3: Boolean = false

