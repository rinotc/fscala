ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.3"

ThisBuild / name := "finance-scala"

lazy val scala3                 = "3.1.3"
lazy val scala213               = "2.13.8"
lazy val supportedScalaVersions = List(scala3, scala213)

lazy val root = (project in file("."))
  .settings(
    scalaVersion       := scala3,
    crossScalaVersions := supportedScalaVersions,
    organization       := "com.github.rinotc",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.14" % Test
    )
  )
