/**
 * TaxEntry.scala
 *
 * Copyright 2019 Andrew Hughes (ahughes6@buffalo.edu)
 *
 * This work is licensed under the Creative Commons
 * Attribution-NonCommercial-ShareAlike 4.0 International License.
 * To view a copy of this license, visit
 * http://creativecommons.org/licenses/by-nc-sa/4.0/.
 *
 * DO NOT MODIFY THIS FILE
 */
package cse250.assignments.objects

import scala.collection.mutable.Map
import scala.collection.mutable.HashMap

class TaxEntry {
  val infoMap: Map[String, String] = new HashMap[String,String]

  override def toString: String = infoMap.toString()
}