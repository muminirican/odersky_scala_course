def sumInts(a: Int , b: Int): Int =
if (a > b) 0 else a + sumInts(a + 1, b)

sumInts(1, 4)

def sumIntsTailRecursive(a: Int, b: Int): Int ={
  def loop (acc: Int, a: Int, b: Int): Int =
    if (a > b) acc else loop(acc + a , a + 1 , b )
  loop(0, a, b )
}

sumIntsTailRecursive(1,4)
sumIntsTailRecursive(1,1)
sumIntsTailRecursive(1,2)
sumIntsTailRecursive(2,5)
sumIntsTailRecursive(6,6)

def cube(x: Int): Int = x * x * x

def sumCubes(a: Int, b: Int): Int =
if (a > b) 0 else cube(a) + sumCubes(a + 1 , b)

cube(2)
sumCubes(2,3)

def factorial(n: Int): Int =
  if (n == 0) 1 else n * factorial(n-1)

def sumFactorial(a: Int, b: Int): Int =
if (a > b) 0 else factorial(a) + sumFactorial(a + 1 , b)


