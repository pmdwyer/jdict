plugins {
    kotlin("jvm") version "2.1.10"
}

group = "org.thirdnature"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(23)
    dependencies {
        implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.18.3")
        implementation("com.fasterxml.woodstox:woodstox-core:6.5.0")
        implementation("org.xerial:sqlite-jdbc:3.49.1.0")
    }
}