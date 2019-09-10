/**
 * TaxEntryProcessor.scala
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
package cse250.pa0.objects

import java.io.File
import java.io.FileWriter
import java.io.BufferedWriter
import scala.io.Source
import cse250.assignments.objects.TaxEntry

object TaxEntryProcessor {
  def sanitizeData(filename: String): Unit = {
    // For opening files, look at Scala Cookbook File I/O Excerpt
    val inputFile = scala.io.Source.fromFile(filename)
    // Note: lines is an iterator to the file. This is only valid as long as the file is open.
    //       Ensure you do not close the file prior to finishing the file usage.
    val lines = inputFile.getLines()

    val outputFile = new BufferedWriter(new FileWriter( new File(filename + "-updated")))

    // Without the '\n' character, all output will be written as one long line.
    // Process the lines.


    // Close the files at the end.
    inputFile.close()
    outputFile.close()
  }

  def computeMostExpensiveEntry(filename: String): TaxEntry = {
    new TaxEntry
  }

  def computeOldestEntry(filename: String): TaxEntry = {
    new TaxEntry
  }
}
