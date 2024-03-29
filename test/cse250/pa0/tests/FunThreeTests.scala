/**
 * FunThreeTests.scala
 *
 * Copyright 2019 Andrew Hughes (ahughes6@buffalo.edu)
 *
 * This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit
 * http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 * Submission author
  * UBIT: garyfeng
  * Person#: 50242102
 *
 * Collaborators (include UBIT name of each, comma separated):
 * UBIT:
 */
package cse250.pa0.tests

import cse250.pa0.objects.Functions
import org.scalatest.FlatSpec

class FunThreeTests extends FlatSpec {

  behavior of "FunctionsTest.funThree"

  it should "f(n) <= f(n+1)" in {
    val n1 = 10
    assert(n1 >= 0 && n1 <= 1000)
    val b = n1 + 1
    val y1 = Functions.funThree(n1)
    val y2 = Functions.funThree(b)
    assert(y1 <= y2)
  }

  it should "fail when less than 0" in {
    val n2 = -1
    assert(n2 >= 0 && n2 <= 1000)
  }

  it should "fail when greater than 0" in {
    val n3 = 1001
    assert(n3 >= 0 && n3 <= 1000)
  }
}
