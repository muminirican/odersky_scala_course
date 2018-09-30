def sum(f: Int => Int): (Int , Int) => Int ={
  def sumF(a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sumF(a + 1, b)
  sumF
}
//sum  intten inte bir fonksiyon alıyor ve iki int alıp int
//dönen başka bir fonksiyon dönüyor

def sumInts = sum(x => x)
def sumCubes = sum(x => x * x * x)

sumInts(1,10)

def cube(x: Int): Int = x * x * x
cube(4)

sum(cube)(1,8)
sum(x => x * x * x)(1,8)


def sumA(f: Int => Int)(a: Int, b: Int): Int =
if (a > b) 0 else f(a) + sumA(f)(a+1, b)
//sumA f i alıyor a ve b ye uyguluyor
sumA(x => x) _


sum(x => x)(1,2)

def test(f: Int => Int)(a: Int, b: Int): Int =
f(a) + f(b)

test(x => x * x)(3,4)
test(x => x + 1) (1,2)


def test2(f: Int => Int):(Int, Int) => Int = {
  def testBody(a: Int, b: Int): Int= f(a) + f(b)
  testBody
}

test2(x => x * x)
test2(x => x * x)(3,4)

def test3 (f: Int => Int) = (a: Int, b:Int) => f(a) + f(b)

def test4 (f: Int => Int) = (a: Int, b: Int) => f(a) + f(b)
test4(x => x * x)(3,4)
def test5 = ((a: Int,b: Int) => a + b)
test5 (4,5)

// x => x*x
def curry(f: Int => Int)(a:Int, b:Int)(c:Int => Int)= c(f(a)+f(b))
curry(x=>x)(1,2)(x => 2 * x)
def curry1(f: Int => Int):(Int, Int) => (Int =>Int) = {
  def ak (a: Int, b: Int): Int => Int = {
    def g(x: Int): Int = x * 2
    g
  }
  ak
}
curry1(x=>x)(1,2)


def curry2 = ()