val boolex01 = 1 > 2
val boolex02 = 1 < 2
val boolex03 = 1.0 <= 1.0
val boolex04 = 3.5f >= 3.6f
val boolex05 = 'a' >= 'A'
val untrue = !true

println(
  s"""|Time for some boolean fun with comparison operators.
      |
      |1 > 2 = $boolex01
      |1 < 2 = $boolex02
      |1.0 <= 1.0 = $boolex03
      |3.5f >= 3.6f = $boolex04
      |'a' >= 'A' = $boolex05
      |val untrue = !true : $untrue
      |""".stripMargin)

val toBe = true
val question = toBe || !toBe
val paradox = toBe && !toBe

println(
  s"""|
      |And now it's time for some and/or logical fun.
      |
      |val toBe = true
      |val question = toBe || !toBe: $question
      |val paradox = toBe && !toBe : $paradox
      |
      |And now let's look at the short-circuiting behavior of
      |these && || logical operations. If the expression is
      |already resolved, there is no need to evaluate any
      |further. For example, in Left || Right, if Left is
      |true then the answer will always be true, so Right is
      |never evaluated. Or in Left && Right, if Left is false
      |then the answer will always be false, so Right is never
      |evaluated.
      |
      |This shouldn't be important to you, because you
      |shouldn't be trying to get clever and using boolean
      |functions that have side effects. That's just not very
      |functional. Actually, it's smelly. But if you did have
      |side effects, it would look something like this:
      |
      |""".stripMargin)

def salt() = { println("salt"); false }
def pepper() = { println("pepper"); true }

println("""|def salt() = { println("salt"); false }
           |def pepper() = { println("pepper"); true }
           |pepper() && salt() : """.stripMargin)
val pepperAndAndSalt = pepper() && salt()
println(pepperAndAndSalt)
println("salt() && pepper() :")
val saltAndAndPepper = salt() && pepper()
println(saltAndAndPepper)

println(
  s"""|
      |It has come to my attention that there are a different
      |set of logical operators for which all the arguments
      |are evaluated no matter what. Instead of && || , there
      |is & | . Example:
      |
      |""".stripMargin)

println("salt() & pepper() :")
val saltAndPepper = salt() & pepper()
println(saltAndPepper)