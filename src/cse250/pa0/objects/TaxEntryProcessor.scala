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
 * UBIT: garyfeng
 * Person#: 50242102
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
    val outputFile = new BufferedWriter(new FileWriter( new File(filename + "-updated")))

    val ommitedColumns: List[Int] = List(0,1,7,8,9,10,11,12,13,20,21,22,24,31,32,33,39,40,41)
    for (line <- inputFile.getLines) {
      val columns = line.split(",")map (_.trim)
      if (!columns(20).isEmpty) {
        for (cell <- columns.indices) {
          if (!ommitedColumns.contains(cell)) {//https://stackoverflow.com/questions/14267612/scala-check-if-element-is-present-in-a-list used contain function
            if (cell == columns.length-1){
              outputFile.write(columns(cell))
            } else {
              outputFile.write(columns(cell) + ",")
            }
          }
        }
        //need to make all columns 27
        outputFile.newLine()
      }
    }


    // Without the '\n' character, all output will be written as one long line.
    // Process the lines.


    // Close the files at the end.
    inputFile.close()
    outputFile.close()

    val someFile = scala.io.Source.fromFile("data/2017-2018_Assessment_Roll.csv-updated") //does every column have to be 27?
    for (line <- someFile.getLines) {
      val columns = line.split(",") map (_.trim)
      println(columns.length)
    }
    outputFile.close()
  }

  def computeMostExpensiveEntry(filename: String): TaxEntry = {
    new TaxEntry
  }

  def computeOldestEntry(filename: String): TaxEntry = {
    new TaxEntry
  }
}
