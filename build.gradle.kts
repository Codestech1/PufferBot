plugins {
    id("java")
    id ("com.github.johnrengelman.shadow") version "7.1.0"
}

group = "io.github.heroostech.pufferbot"
version = "0.0.1"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.DV8FromtheWorld:JDA:v5.0.0-beta.2")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}