name := "scala-workshop"

version := "0.1.0-SNAPSHOT"

organization := "com.yanns"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-async" % "0.9.5",
  "com.typesafe.akka" %% "akka-actor" % "2.3.12"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4",
  "org.mockito" % "mockito-core" % "1.10.19",
  "org.scalacheck" %% "scalacheck" % "1.12.4"
).map(_ % "test")

lazy val macros = project
  .settings(scalaVersion := "2.11.7")
  .settings(libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value)

lazy val root =
  project.in( file(".") )
    .dependsOn(macros)
