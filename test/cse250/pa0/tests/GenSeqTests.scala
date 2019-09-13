/**
 * GenSeqTests.scala
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

class GenSeqTests extends FlatSpec {

  behavior of "FunctionsTest.genSeq"

  it should "input should be b/w 0 to 1000 and every element should be even" in {
    val n1 = 3
    assert(n1 >= 0 && n1 <= 1000)
    val someSeq = Functions.genSeq(n1)
    assert(someSeq.size == n1)
    //checking if all ints in the seq are even
    assert(someSeq.forall(_ % 2 == 0))
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
