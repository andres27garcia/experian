ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.15"

ThisBuild / libraryDependencies ++= Seq(
  // Dependencias para Spark
  "org.apache.spark" %% "spark-core" % "3.3.0",
  "org.apache.spark" %% "spark-sql"  % "3.3.0",

  // Dependencia para ScalaTest (solo para pruebas)
  "org.scalatest" %% "scalatest" % "3.2.0" % Test
)

lazy val root = (project in file("."))
  .settings(
    name := "ExperianTest",
    idePackagePrefix := Some("com.co.experian")
  )

