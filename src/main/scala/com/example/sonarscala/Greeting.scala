package com.example.sonarscala

object Greeting {

  def sayGreeting(greeting: String): String = {

    // try to see if the scala plugin for sonar
    // can detect very high complexity

    var result:String = null

    if (greeting.startsWith("H")) {
      if (greeting.startsWith("He")) {
        if (greeting.startsWith("Hel")) {
          if (greeting.startsWith("Hell")) {
            if (greeting.startsWith("Hello")) {
                result = greeting
            }
          }
        }
      }
    }

    if (result == null) {
      result = "The Strokes!"
    }

    result

  }
}