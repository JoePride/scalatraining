import scala.annotation.tailrec

println("First, the while loop approach:")
def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}

println(s"gcdLoop(69, 46): ${gcdLoop(69, 46)}")

println("Now, the tail recursion approach:")

@tailrec
def gcdTailRec(x: Long, y: Long): Long = if (x == 0) y else
  gcdTailRec(y % x, x)

println(s"gcdTailRec(46, 69): ${gcdTailRec(69,46)}")
