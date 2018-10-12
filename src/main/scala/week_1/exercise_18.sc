def func(n: Int)=(1 until n) map (i=> (1 until i) map (j=> (i,j)))
func(4)

def func2(n: Int)=(1 until n) flatMap  (i=> (1 until i) map (j=> (i,j)))
func2(4)