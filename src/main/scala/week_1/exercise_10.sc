abstract class IntSet{
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
  //below, S is a type which is upper bounded by IntSet, means can be, Empty, Non Empty, Nothing..
  //def assertAllPos[S <: IntSet](r: S): S

  // similarly , we could have lower bounds, means can be, Non Empty, IntSet, AnyRef or Any
  // [S >: Empty]
}

object Empty extends IntSet{
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
  override def toString = "."
  def union(other: IntSet): IntSet = other
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
  override def toString = "{" + left + elem + right + "}"
  def union(other: IntSet): IntSet = ((left union right) union other) incl elem
}

val t1 = new NonEmpty(3, Empty, Empty)
val t2 = t1 incl 4
Empty

Empty contains 1
