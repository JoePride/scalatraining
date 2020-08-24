import scala.language.postfixOps

val sum = 1 + 2
println(s"val sum = 1 + 2: $sum")
val sumMore = (1).+(2)
println(s"val sumMore = (1).+(2): $sumMore")
println(s"(1).+(2): ${(1).+(2)}")
val s = "Hello, world!"
println(s"s: $s")
println(
  """|The following is an example of an infix
     |operator. The operator is a method of the
     |object to its left, and it takes the
     |item to its right as an argument.
     |""".stripMargin)
println(s"s indexOf 'o': ${s indexOf 'o'}")
println(
  """|In the following section, an infix operator
     |is used with multi-argument. Please note
     |that although this example was in the book,
     |it is being deprecated; multi-argument infix
     |operators look confusingly too much like
     |tuples. Apparently, the correct way to do
     |such a thing would be with a good old-
     |fashioned method call. I.e.,
     |s.indexOf('o',5).
     |Still, following along with the book, here
     |ya go:
     |""".stripMargin)
println(s"s indexOf ('o',5): ${s indexOf ('o',5)}")
println("Prefix Operators:")
println(s"-2.0: ${-2.0}")
println(s"(2.0).unary_-: ${(2.0).unary_-}")
println("Postfix operators:")
println(s"s.toLowerCase: ${s.toLowerCase}")
println(
  """|Note that for this postfix operator to work,
     |you need to import scala.language.postfixOps.
     |""".stripMargin)
println(s"s toLowerCase: ${s toLowerCase}")
