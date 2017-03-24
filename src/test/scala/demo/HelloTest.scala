package demo

import org.scalatest.FunSuite

/**
  * Created by smarslan on 23.03.2017.
  */
class HelloTest extends FunSuite {
  test("sayHello method works correctly"){
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }
}
