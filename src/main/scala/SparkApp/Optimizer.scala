package com.co.experian
package SparkApp

import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.sql.functions.broadcast

class Optimizer(spark: SparkSession) {

  def optimize(df: DataFrame): DataFrame = {
    // Usamos un broadcast join para optimizar cuando df3 es pequeño
    broadcast(df)
  }
}