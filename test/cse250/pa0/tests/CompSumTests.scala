/**
 * CompSumTests.scala
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

class CompSumTests extends FlatSpec {

  behavior of "FunctionsTest.compSum"

  it should "return the sum from 1 to n" in {
    val n1 = 50
    assert(n1 >= 1 && n1 <= 50000)
    val sum1 = 1275
    assert(sum1 == Functions.compSum(n1))
  }

  it should "handle big numbers" in {
    val n4 = 50000
    assert(n4 >= 1 && n4 <= 50000)
    val sum2 = (n4*(n4+1))/2
    assert(sum2 == Functions.compSum(n4))
  }

  it should "fail because it's less than 1" in {
    val n2 = 0
    assert(n2 >= 1 && n2 <= 50000)
  }

  it should "fail because it's greater than 50,000" in {
    val n3 = 5000000
    assert(n3 >= 1 && n3 <= 50000)
  }
}
