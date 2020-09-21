class Rational(n: Int, d: Int){
  private def gcf(a: Int, b: Int): Int = {
    val larger = a.abs max b.abs
    val smaller = a.abs min b.abs
    if (smaller == 0) larger max 1 else {
      val remainder = larger % smaller
      gcf(smaller, remainder)
    }
  }

  private val greatestCommon = gcf(n, d)

  val numer = (if (d < 0) -n else n)/greatestCommon
  val denom = (if (d < 0) -d else d)/greatestCommon

  val isInfinity = if (denom == 0 && numer > 0) true else false
  val isNegativeInfinity = if(denom == 0 && numer < 0) true else false
  val isIndeterminate = if(denom == 0 && numer == 0) true else false
  override def toString = if (this.isInfinity) "Infinity" else
    if (this.isNegativeInfinity) "-Infinity" else
      if (this.isIndeterminate) "Indeterminate" else numer + "/" + denom
  lazy val createString = "Created " + this.toString
  println(createString)

  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational = {
    if(this.isIndeterminate || that.isIndeterminate) new Rational(0, 0) else
      if (this.isInfinity && that.isInfinity || this.isNegativeInfinity &&
        that.isNegativeInfinity)
        new Rational(this.numer + that.numer, 0) else
        if (this.isInfinity && that.isNegativeInfinity || this.isNegativeInfinity
          && that.isInfinity) {
          println("Infinity - Infinity: Indeterminate")
          new Rational(0, 0)
        } else
          if (this.isInfinity || that.isInfinity) new Rational (1, 0) else
            if (this.isNegativeInfinity || that.isNegativeInfinity)
              new Rational(-1, 0) else
                new Rational(
                  this.numer * that.denom + that.numer * this.denom,
                  this.denom * that.denom
                )
  }

  def + (i: Int): Rational = new Rational(numer + i * denom, denom)
  def - (that: Rational): Rational = this + new Rational(
    -that.numer, that.denom
  )
  def - (i: Int): Rational = new Rational(numer - i * denom, denom)

  def * (that: Rational) = new Rational(
    this.numer * that.numer,
    this.denom * that.denom
  )
  def * (i: Int): Rational = new Rational(numer * i, denom)
  def / (that: Rational) = new Rational(
    this.numer * that.denom,
    this.denom * that.numer
  )
  def / (i: Int): Rational = new Rational(numer, denom * i)

  def <(that: Rational): Boolean = {
    if (this.isInfinity && that.isInfinity || this.isNegativeInfinity &&
    that.isNegativeInfinity) {
      println("Comparing infinite numbers: Indeterminate.")
      false
    } else
      if (that.isInfinity || this.isNegativeInfinity) true else
        if (that.isNegativeInfinity || this.isInfinity) false else
          this.numer * that.denom < that.numer * this.denom
  }

  def >(that: Rational): Boolean = {
    that < this
  }
}

implicit def intToRational(x: Int): Rational = new Rational(x)

val gcdtest = new Rational(66, 42)
val testRational01 = new Rational(4, 5)
val testRational02 = new Rational(6, 0)
val testRational03 = testRational01 + testRational02
val testRational04 = new Rational(-3, 0)
val testRational05 = new Rational(5)
val testAddNegativeInfinity = testRational01 + testRational04
val testAddInfinityToNegativeInfinity = testRational02 + testRational04
val comparingInfinity = testRational02 < testRational03
val finiteLessThanInfinite = testRational01 < testRational02
val infiniteLessThanFinite = testRational02 < testRational01
val finiteLessThanNegativeInfinite = testRational01 < testRational04
val negativeInfiniteLessThanFinite = testRational04 < testRational01
val finiteGreaterThanNegativeInfinite = testRational01 > testRational04
val infiniteGreaterThanNegativeInfinite = testRational02 > testRational04
val negativeInfiniteLessThanInfinite = testRational04 < testRational02
val multTest = new Rational(4) * new Rational(7, 10)
val multTest2 = new Rational(5, 0) * new Rational (-2, 0)
val multTest3 = multTest * multTest2
val implicitTest = 5 + new Rational(2, 3)

class RationalNoInfinity(n: Int, d: Int) extends Rational(n: Int, d: Int){
  override lazy val createString = if (d == 0) "DIVIDE BY ZERO ERROR" else "Created " + this.toString
  require(d != 0)
}

val testRationalNoInfinity01 = new RationalNoInfinity(4, 5)
// val testRationalNoInfinity02 = new RationalNoInfinity(6, 0)
val testRationalNoInfinity03 = new RationalNoInfinity(7, 11)
val testRationalNoInfinity04 = testRationalNoInfinity01 + testRationalNoInfinity03