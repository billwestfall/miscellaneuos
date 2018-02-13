scala> val foo = """This is a multiline String"""
foo: String = This is a multiline String

scala> val foo = """This is
     | a multiline
     | String"""
foo: String =
This is
a multiline
String

scala> val speech = """Four score and
     | seven years ago""".stripMargin
speech: String =
Four score and
seven years ago

scala> val speech = """Four score and
     | seven years ago
     | our fathers""".stripMargin.replaceAll("\n", " ")
speech: String = Four score and seven years ago our fathers

