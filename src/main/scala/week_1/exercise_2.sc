def abs(x: Double): Double = if( x <0) -x else x

def sqrt(x: Double) = {

  def sqrtIter(guess: Double): Double =
    if (isGoodEnough(guess)) guess
    else sqrtIter(improve(guess))

  def isGoodEnough(guess: Double) =
    abs(guess * guess - x) < 0.001

  def improve(guess: Double) =
    (guess + x / guess) / 2

  sqrtIter(2.0)
}

sqrt(9)
sqrt(2)

