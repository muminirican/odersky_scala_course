def sum(f: Int => Int, a: Int, b: => Int): Int =
  if (a > b) 0
  else f(a) + sum(f, a + 1, b)

def id(x: Int): Int = x
def cube (x: Int): Int = x * x * x
def fact(x: Int): Int = if (x == 0) 1 else x * fact(x - 1)

def sumInts(a: Int, b: Int): Int = sum(id, a, b)
def sumCube(a: Int, b: Int): Int = sum(cube, a, b)
def sumFact(a: Int, b: Int): Int = sum(fact, a, b)

sumInts(1, 2)
sumCube(1, 3)
sumFact(1, 5)

def sumIntsAnon(a: Int, b: Int): Int = sum(x => x, a, b)
def sumCubeAnon(a: Int, b: Int): Int = sum(x => x * x * x, a, b)


def sumTailRecursive(f: Int => Int,a: Int, b: Int): Int ={
  def loop(a:Int, acc: Int): Int =
    if(a > b) acc
    else loop(a + 1, f(a) + acc )
  loop(a,0)
}

sumTailRecursive(x => x * x - x , 4, 5)
sumTailRecursive(fact, 3, 4)
