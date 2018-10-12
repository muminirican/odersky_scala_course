val fruit = "apples" :: ("oranges" :: ("pear" :: Nil))
fruit.head

val empty = Nil
empty.isEmpty
//empty.head


Nil.::(4).::(3).::(2).::(1)
Nil.::(1)
Nil.::(1).::(2)


val list2 = Nil :: (4) :: (3) :: (2) :: (1) :: Nil

list2.reverse
list2.reverse.reverse == list2

val xs = Array(1,122,3,44)
xs.max

xs map (x => x * 2)

xs exists(p => p<1)

val s= "hello world"
s filter (c => c.isUpper)

val pairs = List(1, 2, 3) zip s
val k = pairs.unzip
k._1.reverse

(List(1,2,3), List("h", "e", "l"))

val r: Range = 6 to 1 by -2

val r2: Range = 1 to 5

r2.head


val nums = Vector(1, 2, 3, 4)

nums :+ 1
nums.+: (1)
1 +: nums

(1 to 5) map(f=>(f,f+1))

(List(1, 2, 3) zip List(4,5,6)).map(xs)