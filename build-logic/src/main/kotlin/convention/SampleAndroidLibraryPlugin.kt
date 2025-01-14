package convention

import com.android.build.api.dsl.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.withType

internal class SampleAndroidLibraryPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            plugins.apply("com.android.library")
            plugins.apply("org.jetbrains.kotlin.android")
            plugins.apply("kotlin-kapt")

            val normalizedName = name.replace(":", "_")
            extensions.getByType(LibraryExtension::class.java).apply {
                namespace = "com.example.mylibrary.$normalizedName"
                compileSdk = 33

                defaultConfig {
                    minSdk = 24
                    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
                }

                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_11
                    targetCompatibility = JavaVersion.VERSION_11
                }
            }

            tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
                kotlinOptions {
                    jvmTarget = JavaVersion.VERSION_11.toString()
                }
            }

            dependencies.apply {
                add("implementation", "androidx.appcompat:appcompat:1.6.1")
                add("implementation", "com.google.android.material:material:1.8.0")
                add("testImplementation", "junit:junit:4.13.2")
                add("testImplementation", "org.junit.vintage:junit-vintage-engine:5.10.1")
                add("androidTestImplementation", "androidx.test.ext:junit:1.1.5")
                add("androidTestImplementation", "androidx.test.espresso:espresso-core:3.5.1")
            }
        }
    }
}