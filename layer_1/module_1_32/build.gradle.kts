plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

val normalizedName = name.replace(":", "_")
android {
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

dependencies { 
    implementation(project(":layer_0:module_0_11"))
    implementation(project(":layer_0:module_0_10"))
    implementation(project(":layer_0:module_0_12"))
    implementation(project(":layer_0:module_0_7"))
    implementation(project(":layer_0:module_0_8"))
    implementation(project(":layer_0:module_0_13"))
    implementation(project(":layer_0:module_0_14"))
    implementation(project(":layer_0:module_0_15"))
    implementation(project(":layer_0:module_0_5"))
    implementation(project(":layer_0:module_0_1"))
    implementation(project(":layer_0:module_0_6"))


    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.10.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
        