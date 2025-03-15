plugins {
    kotlin("jvm") version "1.8.21"  // Keep the Kotlin version as it is
    application
}

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin standard library
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Ktor dependencies
    implementation("io.ktor:ktor-server-core:2.1.0")  // Ktor core library
    implementation("io.ktor:ktor-server-netty:2.1.0") // Netty engine for serving HTTP requests
    implementation("io.ktor:ktor-server-auth:2.1.0")  // For authentication if needed
    implementation("io.ktor:ktor-server-sessions:2.1.0") // For session management

    // JSON serialization for Ktor (Optional for API responses)
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.1.0")

    // Testing dependencies (optional, for unit tests)
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
}

application {
    mainClass.set("org.example.AppKt")  // Replace with your main class
}

tasks.test {
    useJUnitPlatform()
}

