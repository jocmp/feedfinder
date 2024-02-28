plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.22"
    application
}

group = "com.jocmp.feedfinder-example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":feedfinder"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass.set("MainKt")
}