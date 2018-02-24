scala> import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ArrayBuffer

scala> var fruits = ArrayBuffer[String]()
fruits: scala.collection.mutable.ArrayBuffer[String] = ArrayBuffer()

scala> var ints = ArrayBuffer[Int]()
ints: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()

scala> var nums = ArrayBuffer(1, 2, 3)
nums: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

scala> var nums = ArrayBuffer(1, 2, 3)
nums: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

scala> scala> nums += 4

// Detected repl transcript paste: ctrl-D to finish.

// Replaying 1 commands from transcript.

scala> nums += 4
res0: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4)


scala> scala> nums += (5, 6)

// Detected repl transcript paste: ctrl-D to finish.

// Replaying 1 commands from transcript.

scala> nums += (5, 6)
res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6)


scala> nums ++= List(7, 8)
res2: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8)

scala> nums -= 9
res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8)

scala> nums -= (7, 8)
res4: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6)

scala> nums --= Array(5, 6)
res5: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4)

scala> 
