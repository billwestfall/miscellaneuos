scala> val sayHello = () => { println("Hello") }
sayHello: () => Unit = <function0>

scala> def executeFunction(callback:() => Unit) { callback()
     | }
executeFunction: (callback: () => Unit)Unit

scala> executeFunction(sayHello)
Hello

scala> def plusOne(i: Int) = i + 1
plusOne: (i: Int)Int

scala> plusOne(1)
res2: Int = 2

scala> def plusOne(i: Int): Unit = i + 1
plusOne: (i: Int)Unit

scala> plusOne(1)
