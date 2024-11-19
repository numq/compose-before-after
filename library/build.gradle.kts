plugins {
    kotlin("jvm") version "2.0.0"
    id("org.jetbrains.compose") version "1.6.10"
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0"
    id("maven-publish")
}

group = "com.github.numq"
version = "1.0.1"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    implementation(compose.foundation)
    implementation(compose.material)
    implementation(compose.runtime)
    implementation(compose.ui)
    implementation("org.jetbrains.compose.material:material-icons-extended-desktop:1.6.11")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
            groupId = project.group.toString()
            artifactId = rootProject.name
            version = project.version.toString()
        }
    }
}