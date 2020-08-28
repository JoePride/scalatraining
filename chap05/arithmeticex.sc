println(
  s"""|This is a demonstration of the most arcane elements of arithmetic operations
      |in Scala. Let's begin.
      |
      |In older versions of Scala, a number with a dot, i.e., 5. , is a Double.
      |However, that behavior is or will soon be deprecated. 5. could
      |be a prefix for a function call like 5.toSomething ; it's better written
      |as 5.0 or (5).toSomething for a Double or an Int being operated on,
      |respectively.
      |
      |That's in the first example.
      |
      |""".stripMargin)

val doubleExample01 = 1.2 + 2.3

println(s"1.2 + 2.3 = $doubleExample01: Double")

val intExample01 = 3 - 1

println(s"3 - 1 = $intExample01: Int")

val charToIntExample01 = 'b' - 'a'

println(s"'b' - 'a' = $charToIntExample01: Int")

val longExample01 = 2L + 3L

println(s"2L + 3L = $longExample01: Long")

val intDivisionExample01 = 11 / 4

println(s"11 / 4 = $intDivisionExample01: Int")

val intRemainderExample01 = 11 % 4

println(s"11 % 4 = $intRemainderExample01: Int")

val floatDivisionExample01 = 11.0f / 4.0f

println(s"11.0f / 4.0f = $floatDivisionExample01: Float")

val doubleRemainderExample01 = 11.0 % 4.0

println(s"11.0 % 4.0 = $doubleRemainderExample01: Double")

println(
  s"""|
      |In that remainder example, the remainder is calculated what I'm sure you
      |think of as the "normal" way; dividing a / b = c doesn't round to the
      |nearest value of c; it truncates to the largest value of c where c * b
      |will fit inside a and not go over. Truncating division. Then the
      |remainder d in a % b = d is the number left over. For rounding division,
      |try the scala.math IEEE remainder if you feel really geeky:
      |
      |math.IEEEremainder(11.0, 4.0) = ${math.IEEEremainder(11.0, 4.0)}: Double
      |
      |Let's look at some edge cases:
      |
      |""".stripMargin)

val edgeCase01 = 11.5 / 4
println(s"11.5 / 4 = $edgeCase01: Double")
val edgeCase02 = 11.5 % 4
println(s"11.5 / 4 = $edgeCase02: Double")
val edgeCase03 = 11 / 4.0
println(s"11 / 4.0 = $edgeCase03: Double")
val edgeCase04 = 11 / 4
println(s"11 / 4 = $edgeCase04: Int")
val edgeCase05 = -11 / 4
println(s"-11 / 4 = $edgeCase05: Int")
val edgeCase06 = (-11) % 4
println(s"(-11) % 4 = $edgeCase06: Int")
val edgeCase07 = -11.0 % 4.0
println(s"-11.0 % 4.0 = $edgeCase07: Double")
val edgeCase08 = -11.0 % -4.0
println(s"-11.0 % -4.0 = $edgeCase08: Double")

println(
  """|
     |Now for a little fun with unary operators.
     |
     |""".stripMargin)
val neg = 1 + -3
println(s"val neg = 1 + -3 : $neg")
val y = +3
println(s"val y = +3 : $y")
println(s"-neg = ${-neg}")