println(
  s"""|Bitwise operations. Not normally my favorite way to do anything, but
      |in the sake of thoroughness, here it is.
      |
      |The "&" operation does an "and" on every bit.
      |
      |1 & 2 = (0b0001 & 0b0010) = ${1 & 2} = 0b${(1 & 2).toBinaryString}
      |
      |The "|" operation does an "or" on every bit.
      |
      |1 | 2 = (0b0001 | 0b0010) = ${1 | 2} = 0b${(1 | 2).toBinaryString}
      |
      |The "^" operation does an "xor" on every bit.
      |
      |1 ^ 3 = (0b0001 ^ 0b0011) = ${1 ^ 3} = 0b${(1 ^ 3).toBinaryString}
      |
      |You would normally think that "^" would be the symbol for an
      |exponent. It is in most languages. In Scala, you will want to use
      |scala.math.pow(number: Double, exponent: Double): Double
      |""".stripMargin)

val powExample = scala.math.pow(2, 3)

println(
  s"""|
      |scala.math.pow(2, 3) = $powExample
      |
      |The "~" operation inverts each bit.
      |
      |~1 = ${~1} ; ~0b${1.toBinaryString} = ${(~1).toBinaryString}
      |
      |All right. Now some bit shifting. Shift left (<<) fills all the new
      |bits with 0; shift right (>>) fills all the new bits from the left
      |end with the current left end bit. If you put a number after the
      |operator, it indicates how many bits to shift left or right. The
      |">>>" operator is an unsigned bit shift right; it always fills with
      |0. Examples:
      |
      |-1 >> 31 = 0b${-1.toBinaryString} >> 31 = ${-1 >> 31} = 0b${(-1 >> 31).toBinaryString}
      |
      |-1 >>> 31 = 0b${-1.toBinaryString} >>> 31 = ${-1 >>> 31} = 0b${(-1 >>> 31).toBinaryString}
      |
      |1 << 2 = 0b${1.toBinaryString} << 2 = ${1 << 2} = 0b${(1 << 2).toBinaryString}
      |""".stripMargin)