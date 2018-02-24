scala> import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ArrayBuffer

scala> val a = ArrayBuffer(1, 2, 3)
a: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3)

scala> a.append(4)

scala> val a
     | 
     | 
You typed two blank lines.  Starting a new command.

scala> a
res1: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4)

scala> a.append(5, 6)

scala> a
res3: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6)

scala> a.appendAll(Seq(7,8))

scala> a
res5: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8)

scala> a.clear

scala> a
res7: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()

scala> val a = ArrayBuffer(9, 10)
a: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(9, 10)

scala> a.insert(0, 8)

scala> a
res9: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(8, 9, 10)

scala> a.insert(0, 6, 7)

scala> a
res11: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(6, 7, 8, 9, 10)

scala> a.insertAll(0, Vector(4, 5))

scala> a
res13: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(4, 5, 6, 7, 8, 9, 10)

scala> a.prepend(3)

scala> a
res15: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(3, 4, 5, 6, 7, 8, 9, 10)

scala> a.prepend(1, 2)

scala> a
res17: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> a.prependAll(Array(0))

scala> a
res19: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> val a = ArrayBuffer.range('a', 'h')
a: scala.collection.mutable.ArrayBuffer[Char] = ArrayBuffer(a, b, c, d, e, f, g)

scala> a.remove(0)
res20: Char = a

scala> a
res21: scala.collection.mutable.ArrayBuffer[Char] = ArrayBuffer(b, c, d, e, f, g)

scala> a.remove(2, 3)

scala> a
res23: scala.collection.mutable.ArrayBuffer[Char] = ArrayBuffer(b, c, g)

scala> val a = ArrayBuffer.range('a', 'h')
a: scala.collection.mutable.ArrayBuffer[Char] = ArrayBuffer(a, b, c, d, e, f, g)

scala> a
res24: scala.collection.mutable.ArrayBuffer[Char] = ArrayBuffer(a, b, c, d, e, f, g)

scala> a.trimStart(2)

scala> a
res26: scala.collection.mutable.ArrayBuffer[Char] = ArrayBuffer(c, d, e, f, g)

scala> a.trimEnd(2)

scala> a
res28: scala.collection.mutable.ArrayBuffer[Char] = ArrayBuffer(c, d, e)

scala> 
