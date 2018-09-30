class Rational (x: Int, y: Int) {
  require( y != 0, "denom must be nonzero")
  def this(x: Int) = this (x, 1)
  private def gdc(a: Int, b:Int): Int = if (b == 0) a else gdc(b, a%b)
  private val g = gdc(x,y)
  def numer = x / g
  def denom = y / g

  def add(that: Rational) = new Rational(
    this.numer * that.denom + that.numer * this.denom, this.denom * that.denom
  )
  override def toString = numer + "/" + denom

  def neg: Rational = new Rational(-numer, denom)
  def sub(that: Rational) = add(that.neg)
  def less(that: Rational) = numer * that.denom < that.numer * denom
  def isMax(that: Rational) = (that.less(this))
  def max(that: Rational) = if (this.less(that)) that else this
}

val firstRational = new Rational(1, 2)
firstRational.numer
firstRational.denom

def addRational (r: Rational, s: Rational): Rational =
new Rational(r.numer * s.denom + s.numer * r.denom, r.denom * s.denom)

def makeString(r: Rational) = r.numer + "/" + r.denom

makeString(addRational(new Rational(1,2), new Rational(2,3)))

val y = new Rational(2,3)
makeString(y.add(firstRational))
y.add(firstRational)
y.neg
firstRational less y
y less firstRational
y max firstRational
y isMax firstRational

new Rational(2)



