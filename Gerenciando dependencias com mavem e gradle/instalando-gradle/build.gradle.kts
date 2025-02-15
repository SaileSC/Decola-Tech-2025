plugins {
    id("java")
    checkstyle
}

group = "br.com.dio"
version = "1.0-SNAPSHOT"

val mapstructVersion = "1.6.3"
val lombokVersion = "1.18.36"
val lombokMapstructBinding = "0.2.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")

    implementation("org.projectlombok:lombok-mapstruct-binding:$lombokMapstructBinding")
    annotationProcessor("org.projectlombok:lombok-mapstruct-binding:$lombokMapstructBinding")

    implementation("org.mapstruct:mapstruct:$mapstructVersion")
    annotationProcessor("org.mapstruct:mapstruct-processor:$mapstructVersion")
}

tasks.withType<Checkstyle>().configureEach {
    reports{
        xml.required = true
        html.required = true
    }
}

tasks.checkstyleMain{
    source = fileTree("src/main/java")
}