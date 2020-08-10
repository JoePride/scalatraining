val sum = 1 + 2
println(sum)
println(s"(1).+(2): ${(1).+(2)}")
print(s"""|longSum, 1 + 2L: ${1 + 2L}
  |Index of o in "Hello, world!": ${"Hello, world!" indexOf 'o'}
  |index of o in "Hello, world!" starting at 5: ${"Hello, world!" indexOf ('o', 5)}
  |""".stripMargin)
