package fpinscala.datastructures

sealed trait Tree[+A]
case class Leaf[A](value: A) extends Tree[A]
case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]


object Tree {

  // ex 3.25
  def size[A](t: Tree[A]): Int = t match {
    case Leaf(_) => 1
    case Branch(l,r) => 1 + size(l) + size(r)
  }

  // scala> import fpinscala.datastructures._
  // import fpinscala.datastructures._
  //
  // scala> val tree = Branch(Branch(Leaf("a"), Leaf("b")), Branch(Leaf("c"), Leaf("d")))
  // tree: fpinscala.datastructures.Branch[String] = Branch(Branch(Leaf(a),Leaf(b)),Branch(Leaf(c),Leaf(d)))
  //
  // scala> Tree.size(tree)
  // res13: Int = 7

  // ex3.26
  def maximum(t: Tree[Int]): Int = t match {
    case Leaf(n) => n
    case Branch(l,r) => maximum(l) max maximum(r)
  }

}
