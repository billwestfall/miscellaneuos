scala> val helpers = Vector("adam", "kim", "melissa")
helpers: scala.collection.immutable.Vector[String] = Vector(adam, kim, melissa)

scala> val caps = helpers.map(e => e.capitalize)
caps: scala.collection.immutable.Vector[String] = Vector(Adam, Kim, Melissa)

scala> val caps = helpers.map(_.capitalize)
caps: scala.collection.immutable.Vector[String] = Vector(Adam, Kim, Melissa)

scala> val names = Array("Fred", "Joe", "Jonathan")
names: Array[String] = Array(Fred, Joe, Jonathan)

scala> val lengths = names.map(_.length)
lengths: Array[Int] = Array(4, 3, 8)

scala> val nieces = List("Aleka", "Christina", "Molly")
nieces: List[String] = List(Aleka, Christina, Molly)

scala> val elems = nieces.map(niece => <li>{niece}</li>)
elems: List[scala.xml.Elem] = List(<li>Aleka</li>, <li>Christina</li>, <li>Molly</li>)

scala> val ul = <ul>{nieces.map(i => <li>{i}</li>)}</ul>
ul: scala.xml.Elem = <ul><li>Aleka</li><li>Christina</li><li>Molly</li></ul>

scala> def plusOne(c: Char): Char = (c.toByte+1).toChar
plusOne: (c: Char)Char

scala> "HAL".map(plusOne)
res0: String = IBM

scala> def minusOne(c: Char): Char = (c.toByte-1).toChar
minusOne: (c: Char)Char

scala> "HAL".map(minusOne)
res1: String = G@K

scala> "IBM".map(minusOne)
res2: String = HAL

scala> "Chthulu".map(plusOne)
res3: String = Diuivmv

scala> "Chthulu".map(minusOne)
res4: String = Bgsgtkt

scala> val s = " eggs, milk, butter, Coco Puffs "
s: String = " eggs, milk, butter, Coco Puffs "

scala> val items = s.split(",").map(_.trim)
items: Array[String] = Array(eggs, milk, butter, Coco Puffs)

scala> val people = List("adam", "kim", "melissa")
people: List[String] = List(adam, kim, melissa)

scala> val caps1 = people.map(_.capitalize)
caps1: List[String] = List(Adam, Kim, Melissa)

scala> val caps2 = for (f <- people) yield f.capitalize
caps2: List[String] = List(Adam, Kim, Melissa)

scala> val fruits = List("apple", "banana", "lime", "orange", "raspberry")
fruits: List[String] = List(apple, banana, lime, orange, raspberry)

scala> val newFruits = fruits.map( f => if (f.length < 6) f.toUpperCase )
newFruits: List[Any] = List(APPLE, (), LIME, (), ())

scala> val newFruits = fruits.map( f => if (f.length < 12) f.toUpperCase )
newFruits: List[Any] = List(APPLE, BANANA, LIME, ORANGE, RASPBERRY)

scala> val newFruits = fruits.map( f => if (f.length < 6) f.toUpperCase )
newFruits: List[Any] = List(APPLE, (), LIME, (), ())

scala> newFruits.filter(_ != ())
warning: there was one deprecation warning; re-run with -deprecation for details
res5: List[Any] = List(APPLE, LIME)

scala> val fruits = List("apple", "banana", "lime", "orange", "raspberry")
fruits: List[String] = List(apple, banana, lime, orange, raspberry)

scala> fruits.filter(_.length < 6).map(_.toUpperCase)
res6: List[String] = List(APPLE, LIME)

scala> def plusTwentyseven(c: Char): Char = (c.toByte+27).toChar
plusTwentyseven: (c: Char)Char

scala> "HAL".map(plusTwentyseven)
res7: String = c\g

scala> def plusFivehun(c: Char): Char = (c.toByte+500).toChar
plusFivehun: (c: Char)Char

scala> "HAL".map(plusFivehun)
res8: String = ȼȵɀ
