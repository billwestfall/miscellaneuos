scala> val a = Array(12, 6, 15, 2, 20, 9)
a: Array[Int] = Array(12, 6, 15, 2, 20, 9)

scala> a
res0: Array[Int] = Array(12, 6, 15, 2, 20, 9)

scala> a.reduceLeft(_ + _)
res1: Int = 64

scala> a
res2: Array[Int] = Array(12, 6, 15, 2, 20, 9)

scala> a.reduceLeft(_ * _)
res3: Int = 388800

scala> a.reduceLeft(_ min _)
res4: Int = 2

scala> a.reduceLeft(_ max _)
res5: Int = 20

scala> val findMax = (x: Int, y: Int) => {
     | val winner = x max y
     | println(s"compared $x to $y, $winner was larger") winner
     | }
<console>:12: error: value winner is not a member of Unit
       println(s"compared $x to $y, $winner was larger") winner
                                                         ^

scala> val peeps = Vector("al", "hannah", "emily", "christina", "aleka")
peeps: scala.collection.immutable.Vector[String] = Vector(al, hannah, emily, christina, aleka)

scala> peeps.reduceLeft((x,y) => if (x.length > y.length) x else y)
res6: String = christina

scala> peeps.reduceLeft((x,y) => if (x.length < y.length) x else y)
res7: String = al

scala> val a = Array(1, 2, 3)
a: Array[Int] = Array(1, 2, 3)

scala> a
res8: Array[Int] = Array(1, 2, 3)

scala> a.reduceLeft(_ + _)
res9: Int = 6

scala> a.foldLeft(20)(_ + _)
res10: Int = 26

scala> a.foldLeft(100)(_ + _)
res11: Int = 106

scala> val divide = (x: Double, y: Double) => {
     | val result = x / y
     | println(s"divided $x by $y to yield $result") result
     | }
<console>:12: error: value result is not a member of Unit
       println(s"divided $x by $y to yield $result") result
                                                     ^

scala> 
