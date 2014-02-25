package com.example.sonarscala

import org.scalatest._
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class TestGreeting extends FunSuite {

  test("Test the greeting function!") {
    assert(Greeting.sayGreeting("Hello!").length == 6)
  }

}