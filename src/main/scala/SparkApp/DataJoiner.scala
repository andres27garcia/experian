package com.co.experian
package SparkApp

import org.apache.spark.sql.{DataFrame, SparkSession}

class DataJoiner(spark: SparkSession) {

  def leftJoin(df1: DataFrame, df2: DataFrame): DataFrame = {
    df1.join(df2, Seq("id"), "left")
  }

  def innerJoin(df4: DataFrame, df3: DataFrame): DataFrame = {
    df4.join(df3, Seq("id"))
  }
}