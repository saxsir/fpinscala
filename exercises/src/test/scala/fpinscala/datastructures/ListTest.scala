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

  test("ex 3.4: List.drop") {
    assert(List.drop(List(1, 2, 3, 4, 5), 1) == List(2,3,4,5))
    assert(List.drop(List(1, 2, 3, 4, 5), 2) == List(3,4,5))
  }

  test("ex 3.5: List.dropWhile") {
    val overFive: Int => Boolean = n => n > 5
    assert(List.dropWhile(List(2, 4, 6, 3, 4, 5), overFive) == List(6, 3, 4, 5))

    val isEven: Int => Boolean = n => n % 2 == 0
    assert(List.dropWhile(List(1, 3, 5, 2, 3, 5), isEven) == List(2, 3, 5))

    val isOdd: Int => Boolean = n => !isEven(n)
    assert(List.dropWhile(List(2, 4, 6, 3, 4, 5), overFive) == List(6, 3, 4, 5))
  }

}
