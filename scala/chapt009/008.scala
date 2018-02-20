scala> def saySomething(prefix: String) = (s: String) => { prefix + " " + s
     | }
saySomething: (prefix: String)String => String

scala> val sayHello = saySomething("Hello")
sayHello: String => String = <function1>

scala> sayHello("Al")
res1: String = Hello Al

scala> def greeting(language: String) = (name: String) => { language match {
     | case "english" => "Hello, " + name
     | case "spanish" => "Buenos dias, " + name }
     | }
greeting: (language: String)String => String
       ^
scala> val hello = greeting("english")
hello: String => String = <function1>

scala> val buenosDias = greeting("spanish")
buenosDias: String => String = <function1>

scala> hello("Al")
res3: String = Hello, Al

scala> buenosDias("Lorenzo")
res4: String = Buenos dias, Lorenzo

