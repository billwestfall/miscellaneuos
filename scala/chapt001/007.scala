scala> "hello world".split(" ")
res0: Array[String] = Array(hello, world)

scala> "hello world".split(" ").foreach(println)
hello
world

scala> val s = "eggs, milk, butter, Coco Puffs"
s: String = eggs, milk, butter, Coco Puffs

scala> .split(",")
res2: Array[String] = Array(eggs, " milk", " butter", " Coco Puffs")

scala> s.split(",").map(_.trim)
res3: Array[String] = Array(eggs, milk, butter, Coco Puffs)

scala> "hello world, this is Al".split("\\s+")
res4: Array[String] = Array(hello, world,, this, is, Al)

scala> "hello world".split(" ")
res5: Array[String] = Array(hello, world)

scala> "hello world".split(' ')
res6: Array[String] = Array(hello, world)

