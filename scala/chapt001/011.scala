scala> val address = "123 Main Street".replaceAll("[0-9]", "x")
address: String = xxx Main Street

scala> val regex = "[0-9]".r
regex: scala.util.matching.Regex = [0-9]

scala> val newAddress = regex.replaceAllIn("123 Main Street", "x")
newAddress: String = xxx Main Street

scala> val result = "123".replaceFirst("[0-9]", "x")
result: String = x23

scala> val regex = "H".r
regex: scala.util.matching.Regex = H

scala> val result = regex.replaceFirstIn("Hello world", "J")
result: String = Jello world
