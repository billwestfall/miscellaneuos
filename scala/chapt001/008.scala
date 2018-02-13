scala> val name = "Fred"
name: String = Fred

scala> val age = 33
age: Int = 33

scala> val weight = 200.00
weight: Double = 200.0

scala> println(s"$name is $age years old, and weighs $weight pounds.")
Fred is 33 years old, and weighs 200.0 pounds.

scala> println(s"Age next year: ${age + 1}")
Age next year: 34

scala> println(s"You are 33 years old: ${age == 33}")
You are 33 years old: true

scala> case class Student(name: String, score: Int)
defined class Student

scala> val hannah = Student("Hannah", 95)
hannah: Student = Student(Hannah,95)

scala> println(s"${hannah.name} has a score of ${hannah.score}")
Hannah has a score of 95

scala> println(s"$hannah.name has a score of $hannah.score")
Student(Hannah,95).name has a score of Student(Hannah,95).score

scala> println(f"$name is $age years old, and weighs $weight%.2f pounds.")
Fred is 33 years old, and weighs 200.00 pounds.

scala> println(f"$name is $age years old, and weighs $weight%.0f pounds.")
Fred is 33 years old, and weighs 200 pounds.

scala> val out = f"$name, you weigh $weight%.0f pounds."
out: String = Fred, you weigh 200 pounds.

scala> s"foo\nbar"
res7: String =
foo
bar

scala> raw"foo\nbar"
res8: String = foo\nbar

scala> val name = "Fred"
name: String = Fred

scala> val age = 33
age: Int = 33

scala> val s = "%s is %d years old".format(name, age)
s: String = Fred is 33 years old

scala> println("%s is %d years old".format(name, age))
Fred is 33 years old
