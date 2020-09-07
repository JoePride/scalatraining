println(
  s"""|Mathematical operators generally have precedence in the same way they do
      |in algebra. For example, * has higher precedence than +.
      |
      |2 + 2 * 7 = ${2 + 2 * 7}
      |(2 + 2) * 7 = ${(2 + 2) * 7}
      |
      |A method has preference based on the starting character of the
      |method name.
      |
      |Precedence (highest to lowest):
      |(all other special characters)
      |* / %
      |+ -
      |:
      |= !
      |< >
      |&
      |^
      ||
      |(all letters)
      |(all assignment operators)
      |
      |2 << 2 + 2 = ${2 << 2 + 2}
      |
      |(2 + 2 gets evaluated first, resulting in 4. Shifting 2 left by
      |4 bits results in 2 to the 5th power, or 32.
      |
      |However, in an assignment operator such as *= or +=, even though
      |the initial character of the operator may have some precedence,
      |overall the precedence is lowest because it's an assignment
      |operator. Everything else has to be calculated before doing the
      |assignment. Example:
      |""".stripMargin)

var x = 2
x *= 3 + 5

println(
  s"""|var x = 2
      |x *= 3 + 5 : $x
      |
      |If the precedence is all the same, then the terms are evaluated
      |from left to right, even if associativity goes the other way.
      |For example, a ::: b is the same as b.:::(a) . But the 'a' term
      |will still be evaluated first. This would only matter if the
      |terms have side effects, which would be poor form, but you
      |should probably keep this thought in the back of your mind in
      |case you get strange behavior. Example:
      |
      |def a = { println("This is a!"); List(1, 2, 3) }
      |def b = { println("This is b!"); List(4, 5, 6) }""".stripMargin)

def a = { println("This is a!"); List(1, 2, 3)}
def b = { println("This is b!"); List(4, 5, 6)}

println("""println(a ::: b) :""")

println(a ::: b)

println(
  """|
     |So even though this translates to b.:::(a), the 'a' gets
     |evaluated first before 'b' gets evaluated and the ':::'
     |method gets applied to it.
     |
     |I guess the moral of this story is: Whenever it looks even a
     |little complicated, use parentheses so other people don't have
     |to remember all these rules to read your code.""".stripMargin)