scala> def isEven (i: Int) = if (i % 2 == 0) true else false
isEven: (i: Int)Boolean

scala> isEven(4)
res0: Boolean = true

scala> isEven(5)
res1: Boolean = false

scala> val list = List.range(1, 10)
list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> val events = list.filter(_ % 2 == 0)
events: List[Int] = List(2, 4, 6, 8)

scala> for {
     | e <- list
     | if e % 2 == 0
     | } yield e
res2: List[Int] = List(2, 4, 6, 8)
