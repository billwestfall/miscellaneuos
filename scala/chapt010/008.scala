scala> val it = Iterator(1,2,3)
it: Iterator[Int] = non-empty iterator

scala> it.foreach(println)
1
2
3

scala> it.foreach(println)

scala> val it = Iterator(1,2,3)
it: Iterator[Int] = non-empty iterator

scala> it.toArray
res2: Array[Int] = Array(1, 2, 3)

scala> it.to
to         toIndexedSeq   toList   toSet      toTraversable   
toArray    toIterable     toMap    toStream   toVector        
toBuffer   toIterator     toSeq    toString                   

scala> it.toval a = Array(1, 2, 3, 4, 5)
<console>:13: error: value toval is not a member of Iterator[Int]
val $ires1 = it.toval.a
                ^
<console>:11: error: value toval is not a member of Iterator[Int]
       it.toval a = Array(1, 2, 3, 4, 5)
          ^

scala> val a = Array(1, 2, 3, 4, 5)
a: Array[Int] = Array(1, 2, 3, 4, 5)

scala> for (e <- a) yield e
res3: Array[Int] = Array(1, 2, 3, 4, 5)

scala> for (e <- a) yield e * 2
res4: Array[Int] = Array(2, 4, 6, 8, 10)

scala> for (e <- a) yield e % 2
res5: Array[Int] = Array(1, 0, 1, 0, 1)

scala> val fruits = Vector("apple", "banana", "lime", "orange")
fruits: scala.collection.immutable.Vector[String] = Vector(apple, banana, lime, orange)

scala> val ucFruits = for (e <- fruits) yield e.toUpperCase
ucFruits: scala.collection.immutable.Vector[String] = Vector(APPLE, BANANA, LIME, ORANGE)

scala> for (i <- 0 until fruits.length) yield (i, fruits(i))
res6: scala.collection.immutable.IndexedSeq[(Int, String)] = Vector((0,apple), (1,banana), (2,lime), (3,orange))

scala> for (f <- fruits) yield (f, f.length)
res7: scala.collection.immutable.Vector[(String, Int)] = Vector((apple,5), (banana,6), (lime,4), (orange,6))

scala> case class Person (name: String)
defined class Person

scala> val friends = Vector("Mark", "Regina", "Matt")
friends: scala.collection.immutable.Vector[String] = Vector(Mark, Regina, Matt)

scala> for (f <- friends) yield Person(f)
res8: scala.collection.immutable.Vector[Person] = Vector(Person(Mark), Person(Regina), Person(Matt))

scala> val x = for (e <- fruits if e.length < 6) yield e.toUpperCase
x: scala.collection.immutable.Vector[String] = Vector(APPLE, LIME)

scala> val fruits = scala.collection.mutable.ArrayBuffer("apple", "banana")
fruits: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(apple, banana)

scala> val x = for (e <- fruits) yield e.toUpperCase
x: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer(APPLE, BANANA)

scala> val fruits = "apple" :: "banana" :: "orange" :: Nil
fruits: List[String] = List(apple, banana, orange)

scala> val x = for (e <- fruits) yield e.toUpperCase
x: List[String] = List(APPLE, BANANA, ORANGE)

scala> val cars = Vector("Mercedes", "Porsche", "Tesla")
cars: scala.collection.immutable.Vector[String] = Vector(Mercedes, Porsche, Tesla)

scala> for {
     |  c <- cars
     |  if c.startsWith("M")
     |  } yield c
res9: scala.collection.immutable.Vector[String] = Vector(Mercedes)

scala> 
