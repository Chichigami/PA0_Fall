/**
 * GenNumTests.scala
 *
 * Copyright 2019 Andrew Hughes (ahughes6@buffalo.edu)
 *
 * This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit
 * http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 * Submission author
 * UBIT:
 * Person#:
 *
 * Collaborators (include UBIT name of each, comma separated):
 * UBIT:
 */
package cse250.pa0.tests

import cse250.pa0.objects.Functions
import org.scalatest.FlatSpec

class GenNumTests extends FlatSpec {

  behavior of "FunctionsTest.genNum"

  it should "input should be 0 - 1000 and return a positive number" in {
    val n1 = 10
    assert(n1 >= 0 && n1 <= 1000)
    val someNum = Functions.genNum(n1)
    assert(someNum > 0)
  }

  it should "return false when input < 0" in {
    val n2 = -1
    assert(n2 >= 0 && n2 <= 1000)
  }

  it should "return false when input > 1000" in {
    val n3 = 1001
    assert(n3 >= 0 && n3 <= 1000)
  }
}
