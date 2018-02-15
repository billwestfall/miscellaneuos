scala> def properDivisors(n: Int) = (1 to n/2).filter(i => n % i == 0)
properDivisors: (n: Int)scala.collection.immutable.IndexedSeq[Int]

scala> def classifier(i: Int) = properDivisors(i).sum compare i
classifier: (i: Int)Int

scala> val groups = (1 to 20000).groupBy( classifier )
groups: scala.collection.immutable.Map[Int,scala.collection.immutable.IndexedSeq[Int]] = Map(-1 -> Vector(1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17, 19, 21, 22, 23, 25, 26, 27, 29, 31, 32, 33, 34, 35, 37, 38, 39, 41, 43, 44, 45, 46, 47, 49, 50, 51, 52, 53, 55, 57, 58, 59, 61, 62, 63, 64, 65, 67, 68, 69, 71, 73, 74, 75, 76, 77, 79, 81, 82, 83, 85, 86, 87, 89, 91, 92, 93, 94, 95, 97, 98, 99, 101, 103, 105, 106, 107, 109, 110, 111, 113, 115, 116, 117, 118, 119, 121, 122, 123, 124, 125, 127, 128, 129, 130, 131, 133, 134, 135, 136, 137, 139, 141, 142, 143, 145, 146, 147, 148, 149, 151, 152, 153, 154, 155, 157, 158, 159, 161, 163, 164, 165, 166, 167, 169, 170, 171, 172, 173, 175, 177, 178, 179, 181, 182, 183, 184, 185, 187, 188, 189, 190, 191, 193, 194, 195, 197, 199, 201, 202, 203, ...
scala> println("Deficient: " + groups(-1).length)
Deficient: 15043

scala> println("Abundant: " + groups(1).length)
Abundant: 4953

scala> println("Perfect: " + groups(0).length + " (" + groups(0).mkString(",") + ")")
Perfect: 4 (6,28,496,8128)

