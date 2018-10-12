(x: Int) => x * x

{class AnonFun extends Function1[Int, Int] {
  def apply(x: Int) = x * x }
  new AnonFun
}

//anonymous class syntax below
new Function[Int, Int] {
  def apply(x: Int) = x * x
}


// this is the way to use the inherent apply mehtod
{(x: Int) => x * x}.apply(5)


// another way

val f = (x: Int) => x * x
f.apply(5)


// the above would expand to

val f2 = new Function[Int, Int] {
  def apply(x: Int) = x * x
}

f2.apply(5)
