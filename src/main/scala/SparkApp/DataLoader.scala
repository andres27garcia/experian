package com.co.experian
package SparkApp

import org.apache.spark.sql.{DataFrame, SparkSession}

class DataLoader(spark: SparkSession) {

  def loadData(): (DataFrame, DataFrame, DataFrame) = {
    import spark.implicits._

    val df1 = (1 to 4000).map(i => (i, s"df1_row_$i")).toDF("id", "value")
    val df2 = (1 to 1000).map(i => (i, s"df2_row_$i")).toDF("id", "value")
    val df3 = (1 to 10).map(i => (i, s"df3_row_$i")).toDF("id", "value")

    (df1, df2, df3)
  }
}