name := "addressgenerator"

version := "1.0"

scalaVersion := "2.12.0"

libraryDependencies += "org.scorexfoundation" %% "scrypto" % "1.2.0"

libraryDependencies += "com.github.scopt" %% "scopt" % "3.5.0"

mainClass in assembly := Some("AddressGenerator")
assemblyJarName in assembly := "addressgenerator.jar"
