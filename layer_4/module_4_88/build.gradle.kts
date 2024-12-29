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
    implementation(project(":layer_3:module_3_54"))
    implementation(project(":layer_3:module_3_77"))
    implementation(project(":layer_3:module_3_56"))
    implementation(project(":layer_3:module_3_52"))
    implementation(project(":layer_3:module_3_69"))
    implementation(project(":layer_3:module_3_62"))
    implementation(project(":layer_3:module_3_76"))
    implementation(project(":layer_3:module_3_70"))
    implementation(project(":layer_3:module_3_65"))
    implementation(project(":layer_3:module_3_74"))
    implementation(project(":layer_3:module_3_51"))
    implementation(project(":layer_3:module_3_72"))
    implementation(project(":layer_3:module_3_53"))
    implementation(project(":layer_3:module_3_60"))
    implementation(project(":layer_3:module_3_68"))
    implementation(project(":layer_3:module_3_71"))
    implementation(project(":layer_3:module_3_59"))
    implementation(project(":layer_3:module_3_66"))
    implementation(project(":layer_3:module_3_58"))
    implementation(project(":layer_3:module_3_61"))
    implementation(project(":layer_3:module_3_55"))
    implementation(project(":layer_3:module_3_73"))
    implementation(project(":layer_3:module_3_63"))
    implementation(project(":layer_3:module_3_75"))
    implementation(project(":layer_3:module_3_57"))
    implementation(project(":layer_3:module_3_64"))


    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.10.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
        