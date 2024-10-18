package com.co.experian

import org.apache.spark.sql.SparkSession
import org.scalatest.{BeforeAndAfterAll, FunSuite}

class SparkAppTest extends FunSuite with BeforeAndAfterAll {
  private var spark: SparkSession = _

  override def beforeAll(): Unit = {
    spark = SparkSession.builder()
      .appName("Spark Optimization Test")
      .master("local[*]")
      .getOrCreate()
  }

  override def afterAll(): Unit = {
    if (spark != null) {
      spark.stop()
    }
  }

  test("DataLoader should load data correctly") {
    val dataLoader = new DataLoader(spark)
    val (df1, df2, df3) = dataLoader.loadData()

    assert(df1.count() == 4000)
    assert(df2.count() == 1000)
    assert(df3.count() == 10)
  }

  test("DataJoiner should perform left join correctly") {
    val dataLoader = new DataLoader(spark)
    val dataJoiner = new DataJoiner(spark)

    val (df1, df2, df3) = dataLoader.loadData()
    val df4 = dataJoiner.leftJoin(df1, df2)

    assert(df4.count() == 4000) // Left join keeps all rows from df1
  }
}