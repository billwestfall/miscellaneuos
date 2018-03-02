scala> val x = (1 to 10).toArray
x: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> val y = x.drop(3)
y: Array[Int] = Array(4, 5, 6, 7, 8, 9, 10)

scala> val y = x.dropWhile(_ < 6)
y: Array[Int] = Array(6, 7, 8, 9, 10)

scala> val y = x.dropRight(4)
y: Array[Int] = Array(1, 2, 3, 4, 5, 6)

scala> val y = x.take(3)
y: Array[Int] = Array(1, 2, 3)

scala> val y = x.takeWhile(_ < 5)
y: Array[Int] = Array(1, 2, 3, 4)

scala> val y = x.takeRight(3)
y: Array[Int] = Array(8, 9, 10)

scala> val y
     | 
     | 
You typed two blank lines.  Starting a new command.

scala> print(y)
[I@5432c277
scala> print(x)
[I@7e1f584d
scala> y
res2: Array[Int] = Array(8, 9, 10)

scala> val peeps = List("John", "Mary", "Jane", "Fred")
peeps: List[String] = List(John, Mary, Jane, Fred)

scala> peeps.slice(1,3)
res3: List[String] = List(Mary, Jane)

scala> val nums = (1 to 5).toArray
nums: Array[Int] = Array(1, 2, 3, 4, 5)

scala> nums.head
res4: Int = 1

scala> nums.headOption
res5: Option[Int] = Some(1)

scala> nums.init
res6: Array[Int] = Array(1, 2, 3, 4)

scala> nums.last
res7: Int = 5

scala> nums.lastOption
res8: Option[Int] = Some(5)

scala> nums.tail
res9: Array[Int] = Array(2, 3, 4, 5)

scala> 
