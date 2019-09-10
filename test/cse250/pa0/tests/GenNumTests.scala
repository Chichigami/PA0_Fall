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

  it should "return a number from 0 to 1000" in {
    val n = 10
    assert(n >= 0 && n <= 1000)
    val someNum = Functions.genNum(n)
    assert(someNum >= 0)
  }
}
