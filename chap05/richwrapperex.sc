import scala.language.postfixOps

println(
  s"""|So in addition to basic math, there are also "rich"
      |versions of basic types. Here are a few that are
      |given as examples in the book. Many more are
      |available and could be handy.
      |
      |0 max 5 : ${0 max 5}
      |0 min 5 : ${0 min 5}
      |-2.7 abs : ${-2.7 abs}
      |-2.7 round : ${-2.7 round}
      |1.5 isInfinity : ${1.5 isInfinity}
      |(1.0 / 0) isInfinity : ${(1.0 / 0) isInfinity}
      |4 to 6 : ${4 to 6}
      |"bob" capitalize : ${"bob" capitalize}
      |"robert" drop 2 : ${"robert" drop 2} """.stripMargin)