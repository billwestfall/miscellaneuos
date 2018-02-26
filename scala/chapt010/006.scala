scala> val fruits = Traversable("apple", "banana", "orange")
fruits: Traversable[String] = List(apple, banana, orange)

scala> for (f <- fruits) println(f)
apple
banana
orange

scala> for (f <- fruits) println(f.toUpperCase)
APPLE
BANANA
ORANGE

scala> val fruits = Array("apple", "banana", "orange")
fruits: Array[String] = Array(apple, banana, orange)

scala> for (i <- 0 until fruits.size) println(s"element $i is ${fruits(i)}")
element 0 is apple
element 1 is banana
element 2 is orange

scala> for (i <- 1 to 3) println(i)
1
2
3

scala> 1 to 3
res4: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3)

scala> val fruits = Array("apple", "banana", "orange")
fruits: Array[String] = Array(apple, banana, orange)

scala> val newArray = for (e <- fruits) yield e.toUpperCase
newArray: Array[String] = Array(APPLE, BANANA, ORANGE)

scala> val newArray = for (fruit <- fruits) yield upperReverse(fruit)
<console>:11: error: not found: value upperReverse
       val newArray = for (fruit <- fruits) yield upperReverse(fruit)
                                                  ^

scala> def upperReverse(s: String) = {s.toUpperCase.reverse}
upperReverse: (s: String)String

scala> val newArray = for (fruit <- fruits) yield upperReverse(fruit)
newArray: Array[String] = Array(ELPPA, ANANAB, EGNARO)

scala> val names = Map("fname" -> "Ed", "lname" -> "Chigliak")
names: scala.collection.immutable.Map[String,String] = Map(fname -> Ed, lname -> Chigliak)

scala> for ((k,v) <- names) println(s"key: $k, value: $v")
key: fname, value: Ed
key: lname, value: Chigliak
