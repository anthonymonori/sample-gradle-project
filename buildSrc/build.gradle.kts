plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins` // Enables Kotlin DSL for precompiled script plugins
}

dependencies {
    implementation("com.android.tools.build:gradle:8.7.2")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.0")
    implementation("com.jraska.module.graph.assertion:com.jraska.module.graph.assertion.gradle.plugin:2.7.1")
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}