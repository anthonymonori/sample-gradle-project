plugins {
    `kotlin-dsl`
}

dependencies {
    //noinspection AndroidGradlePluginVersion
    implementation("com.android.tools.build:gradle:8.7.2")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.0")
    implementation("com.jraska.module.graph.assertion:com.jraska.module.graph.assertion.gradle.plugin:2.7.1")
}

gradlePlugin {
    plugins {
        create("root") {
            id = "sample.$name"
            implementationClass = "com.sample.convention.SampleRootPlugin"
            version = "1.0.0"
        }

        create("android.library") {
            id = "sample.$name"
            implementationClass = "com.sample.convention.SampleAndroidLibraryPlugin"
            version = "1.0.0"
        }

        create("android.application") {
            id = "sample.$name"
            implementationClass = "com.sample.convention.SampleAndroidApplicationPlugin"
            version = "1.0.0"
        }
    }
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}