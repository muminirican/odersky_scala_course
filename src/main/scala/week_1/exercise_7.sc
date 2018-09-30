def product(f: Int => Int)(a: Int, b: Int): Int =
if(a > b) 1 else f(a) * product(f)(a + 1, b)

product(x=>x)(7,9)

def fact(n: Int)= product(x => x)(1,n)
fact(4)