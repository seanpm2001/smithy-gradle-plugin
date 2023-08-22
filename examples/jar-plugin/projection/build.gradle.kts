// This example places a projected version of the model into the JAR.

plugins {
    id("java-library")
    id("smithy-jar").version("0.8.0")
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation("software.amazon.smithy:smithy-aws-traits:[1.0, 2.0[")
}

smithy {
    sourceProjection.set("foo")
}
