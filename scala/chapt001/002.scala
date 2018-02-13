scala> for (i <- Array(1,2,3)) yield i * 2
res1: Array[Int] = Array(2, 4, 6)

scala> Array(1,2,3).map(_ * 2)
res2: Array[Int] = Array(2, 4, 6)
