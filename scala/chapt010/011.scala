scala> val bag = List("1", "2", "three", "4", "one hundred seventy five")
bag: List[String] = List(1, 2, three, 4, one hundred seventy five)

scala> def toInt(in: String): Option[Int] = { try {
     | Some(Integer.parseInt(in.trim)) } catch {
     | case e: Exception => None }
     | }
toInt: (in: String)Option[Int]

scala> bag.flatMap(toInt).sum
res0: Int = 7

scala> bag.map(toInt)
res1: List[Option[Int]] = List(Some(1), Some(2), None, Some(4), None)

scala> bag.map(toInt).flatten
res2: List[Int] = List(1, 2, 4)

scala> bag.map(toInt).flatten.sum
res3: Int = 7

scala> bag.flatMap(toInt).sum
res4: Int = 7

scala> bag.flatMap(toInt).filter(_ > 1)
res5: List[Int] = List(2, 4)

scala> bag.flatMap(toInt).takeWhile(_ < 4)
res6: List[Int] = List(1, 2)

scala> bag.flatMap(toInt).partition(_ > 3)
res7: (List[Int], List[Int]) = (List(4),List(1, 2))

scala> subWords("then")
<console>:11: error: not found: value subWords
       subWords("then")
       ^

scala> val words = List("band", "start", "then")
words: List[String] = List(band, start, then)

scala> words.map(subWords)
<console>:12: error: not found: value subWords
       words.map(subWords)
                 ^

scala> val x = List.range(1, 10)
x: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> val evens = x.filter(_ % 2 == 0)
evens: List[Int] = List(2, 4, 6, 8)

scala> val evens = x.filter(_ % 2 != 0)
evens: List[Int] = List(1, 3, 5, 7, 9)

scala> val fruits = Set("orange", "peach", "apple", "banana")
fruits: scala.collection.immutable.Set[String] = Set(orange, peach, apple, banana)

scala> val x = fruits.filter(_.startsWith("a"))
x: scala.collection.immutable.Set[String] = Set(apple)

scala> val y = fruits.filter(_.length > 5)
y: scala.collection.immutable.Set[String] = Set(orange, banana)

scala> val list = "apple" :: "banana" :: 1 :: 2 :: Nil
list: List[Any] = List(apple, banana, 1, 2)

scala> val strings = list.filter {  case s: String => true
     |  case _ => false
     | }
strings: List[Any] = List(apple, banana)

scala> def onlyStrings(a: Any) = a match { case s: String => true
     | case _ => false
     | }
onlyStrings: (a: Any)Boolean

scala> val strings = list.filter(onlyStrings)
strings: List[Any] = List(apple, banana)

scala> def getFileContentsWithoutBlanksComments(canonicalFilename: String): List[String] = {
     | io.Source.fromFile(canonicalFilename) .getLines
     | .toList
     | .filter(_.trim != "") .filter(_.charAt(0) != '#') }
getFileContentsWithoutBlanksComments: (canonicalFilename: String)List[String]

scala> 
