// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val kotlinVersion = "1.3.11"
    repositories {
        google()
        jcenter()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.5.3")
        classpath(kotlin("gradle-plugin", kotlinVersion))
        classpath("com.vanniktech:gradle-code-quality-tools-plugin:0.15.0")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files

    }
}

allprojects {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://pdftron-maven.s3.amazonaws.com/release") }
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}