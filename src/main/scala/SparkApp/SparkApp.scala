package com.co.experian
package SparkApp

import org.apache.spark.sql.SparkSession

object SparkApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
      .appName("Spark Optimization Project")
      .master("local[*]")
      .getOrCreate()

    val dataLoader = new DataLoader(spark)
    val dataJoiner = new DataJoiner(spark)
    val optimizer = new Optimizer(spark)

    // Cargar DataFrames
    val (df1, df2, df3) = dataLoader.loadData()

    // Realizar el left join y el join final
    val df4 = dataJoiner.leftJoin(df1, df2)
    val df5 = dataJoiner.innerJoin(df4, df3)

    // Optimización y muestra de resultados
    val optimizedDF5 = optimizer.optimize(df5)
    optimizedDF5.show()

    spark.stop()
  }
}