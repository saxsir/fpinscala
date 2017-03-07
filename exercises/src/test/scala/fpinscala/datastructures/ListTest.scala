import org.scalatest.FunSuite
import fpinscala.datastructures._

class TestDataStructures extends FunSuite {

  test("ex 3.1: match") {
    var x = List(1,2,3,4,5) match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + List.sum(t)
      case _ => 101
    }

    assert(x == 3)
  }

  test("ex 3.2: List.tail") {
    assert(List.tail(List(1, 2, 3, 4, 5)) == List(2,3,4,5))
  }

  test("ex 3.3: List.setHead") {
    assert(List.setHead(List(1, 2, 3, 4, 5), 0) == List(0,2,3,4,5))
  }
}
