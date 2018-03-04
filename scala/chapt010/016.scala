scala> val women = List("Wilma", "Betty")
women: List[String] = List(Wilma, Betty)

scala> val men = List("Fred", "Barney")
men: List[String] = List(Fred, Barney)

scala> val couples = women zip men
couples: List[(String, String)] = List((Wilma,Fred), (Betty,Barney))

scala> for ((wife, husband) <- couples) {
     |  println(s"$wife is married to $husband") }
Wilma is married to Fred
Betty is married to Barney

scala> val couplesMap = couples.toMap
couplesMap: scala.collection.immutable.Map[String,String] = Map(Wilma -> Fred, Betty -> Barney)

scala> val products = Array("breadsticks", "pizza", "soft drink")
products: Array[String] = Array(breadsticks, pizza, soft drink)

scala> val prices = Array(4)
prices: Array[Int] = Array(4)

scala> val productsWithPrice = products.zip(prices)
productsWithPrice: Array[(String, Int)] = Array((breadsticks,4))

scala> val (a,b) = productsWithPrice.unzip
a: Array[String] = Array(breadsticks)
b: Array[Int] = Array(4)

scala> 1 to 100
res1: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100)

scala> (1 to 100).view
res2: scala.collection.SeqView[Int,scala.collection.immutable.IndexedSeq[Int]] = SeqView(...)

scala> val view = (1 to 100).view
view: scala.collection.SeqView[Int,scala.collection.immutable.IndexedSeq[Int]] = SeqView(...)

scala> val x = view.force
x: scala.collection.immutable.IndexedSeq[Int] = Vector(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100)

scala> (1 to 100).map { _ * 2 }
res3: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 118, 120, 122, 124, 126, 128, 130, 132, 134, 136, 138, 140, 142, 144, 146, 148, 150, 152, 154, 156, 158, 160, 162, 164, 166, 168, 170, 172, 174, 176, 178, 180, 182, 184, 186, 188, 190, 192, 194, 196, 198, 200)

scala> (1 to 100).view.map { _ * 2 }
res4: scala.collection.SeqView[Int,Seq[_]] = SeqViewM(...)

scala> val x = (1 to 1000).view.map { e => Thread.sleep(10)
     | e*2
     | }
x: scala.collection.SeqView[Int,Seq[_]] = SeqViewM(...)

scala> val l = (1 to 3)
l: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3)

scala> l.reverse
res5: scala.collection.immutable.Range = Range(3, 2, 1)

scala> l.view.reverse
res6: scala.collection.SeqView[Int,scala.collection.immutable.IndexedSeq[Int]] = SeqViewR(...)

scala> val x = (1 to 1000).view.map { e => Thread.sleep(10)
     | e*2
     | }
x: scala.collection.SeqView[Int,Seq[_]] = SeqViewM(...)

scala> x.foreach(print)
scala> val arr = (1 to 10).toArray
arr: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> val view = arr.view.slice(2, 5)
view: scala.collection.mutable.IndexedSeqView[Int,Array[Int]] = SeqViewS(...)

scala> arr(2) = 42

scala> view.foreach(println)
42
4
5

scala> view(0) = 10

scala> view(1) = 20

scala> view(2) = 30

scala> 

scala> arr
res13: Array[Int] = Array(1, 2, 10, 20, 30, 6, 7, 8, 9, 10)

