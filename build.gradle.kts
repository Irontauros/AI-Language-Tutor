plugins {
    kotlin("jvm") version "1.8.21"  // Replace with the desired Kotlin version
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
}

application {
    mainClass.set("org.example.AppKt")  // Replace with your main class
}

tasks.test {
    useJUnitPlatform()
}
