plugins {
    `java-library`
}

group = "com.daromi"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    api("org.jspecify:jspecify:1.0.0")

    testImplementation("org.junit.jupiter:junit-jupiter:6.0.2")
}

tasks.test {
    useJUnitPlatform()
}
