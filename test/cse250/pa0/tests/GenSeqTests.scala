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
 * UBIT:
 * Person#:
 *
 * Collaborators (include UBIT name of each, comma separated):
 * UBIT:
 */
package cse250.pa0.tests

import cse250.pa0.objects.Functions
import org.scalatest.FlatSpec

class GenSeqTests extends FlatSpec {

  behavior of "FunctionsTest.genSeq"

  it should "input should be between 0 to 1000 and every element should be even" in {
    val someSeq = Functions.genSeq(10)
    assert(someSeq.size == 10)
    assert(someSeq.forall(_ % 2 == 0))
  }
}
