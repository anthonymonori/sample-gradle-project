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
    implementation(project(":layer_4:module_4_85"))
    implementation(project(":layer_4:module_4_87"))
    implementation(project(":layer_4:module_4_86"))
    implementation(project(":layer_4:module_4_91"))
    implementation(project(":layer_4:module_4_89"))
    implementation(project(":layer_4:module_4_83"))
    implementation(project(":layer_4:module_4_90"))
    implementation(project(":layer_4:module_4_80"))
    implementation(project(":layer_4:module_4_79"))
    implementation(project(":layer_4:module_4_84"))


    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.10.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
        