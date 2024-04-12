plugins {
    id("java")
}

group = "org.pfe"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("com.intuit.karate:karate-core:1.1.0")
    // Remove explicit dependency on karate-apache, as it's included in karate-core
    testImplementation("com.intuit.karate:karate-junit5:1.1.0")

    // Use Cucumber 6.x series for compatibility with Karate 1.1.0
    implementation("io.cucumber:cucumber-java:6.10.4")
    implementation("io.cucumber:cucumber-junit:6.10.4")
}

tasks.test {
    useJUnitPlatform()
}
tasks.register("karateRun", Exec::class) {
    group = "verification"
    description = "Run Karate tests and generate HTML report"
    commandLine("java", "-jar", "karate.jar", "src/test/java")
}