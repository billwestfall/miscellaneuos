scala> val employees = List("neal", "s", "stu", "j", "rich", "bob", "aiden", "j", "ethan", "liam", "mason", "noah", "lucas", "jacob", "jayden", "jack")
employees: List[String] = List(neal, s, stu, j, rich, bob, aiden, j, ethan, liam, mason, noah, lucas, jacob, jayden, jack)

scala> val parallelResult = employees .par
parallelResult: scala.collection.parallel.immutable.ParSeq[String] = ParVector(neal, s, stu, j, rich, bob, aiden, j, ethan, liam, mason, noah, lucas, jacob, jayden, jack)

scala> .filter(_.length() > 1) .map(_.capitalize) .reduce(_ + "," + _)
res0: String = Neal,Stu,Rich,Bob,Aiden,Ethan,Liam,Mason,Noah,Lucas,Jacob,Jayden,Jack
