scala> val numPattern = "[0-9]+".r
numPattern: scala.util.matching.Regex = [0-9]+

scala> val address = "123 Main Street Suite 101"
address: String = 123 Main Street Suite 101

scala> al match1 = numPattern.findFirstIn(address)
<console>:14: error: not found: value al
val $ires0 = al.match1
             ^
<console>:12: error: not found: value al
       al match1 = numPattern.findFirstIn(address)
       ^

scala> val match1 = numPattern.findFirstIn(address)
match1: Option[String] = Some(123)

scala> val matches = numPattern.findAllIn(address)
matches: scala.util.matching.Regex.MatchIterator = non-empty iterator

scala> matches.foreach(println)
123
101

scala> val matches = numPattern.findAllIn(address).toArray
matches: Array[String] = Array(123, 101)

scala> import scala.util.matching.Regex
import scala.util.matching.Regex

scala> val numPattern = new Regex("[0-9]+")
numPattern: scala.util.matching.Regex = [0-9]+

scala> val address = "123 Main Street Suite 101"
address: String = 123 Main Street Suite 101

scala> val match1 = numPattern.findFirstIn(address)
match1: Option[String] = Some(123)

scala> val match1 = numPattern.findFirstIn(address)
match1: Option[String] = Some(123)

scala> val address = "No address given"
address: String = No address given

scala> val match1 = numPattern.findFirstIn(address)
match1: Option[String] = None

scala> val result = numPattern.findFirstIn(address).getOrElse("no match")
result: String = no match

scala> val address = "123 Main Street Suite 101"
address: String = 123 Main Street Suite 101

scala> val result = numPattern.findFirstIn(address).getOrElse("no match")
result: String = 123

scala> val numPattern = "[0-9]+".r
numPattern: scala.util.matching.Regex = [0-9]+

scala> val address = "123 Main Street Suite 101"
address: String = 123 Main Street Suite 101

scala> val match1 = numPattern.findFirstIn(address)
match1: Option[String] = Some(123)

scala> match1.foreach { e =>
     | println(s"Found a match: $e")
     | }
Found a match: 123
