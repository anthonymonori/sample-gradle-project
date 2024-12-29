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
    implementation(project(":layer_1:module_1_42"))
    implementation(project(":layer_1:module_1_41"))
    implementation(project(":layer_1:module_1_24"))
    implementation(project(":layer_1:module_1_49"))
    implementation(project(":layer_1:module_1_25"))
    implementation(project(":layer_1:module_1_36"))
    implementation(project(":layer_1:module_1_37"))
    implementation(project(":layer_1:module_1_29"))
    implementation(project(":layer_1:module_1_43"))
    implementation(project(":layer_1:module_1_46"))
    implementation(project(":layer_1:module_1_19"))
    implementation(project(":layer_1:module_1_34"))
    implementation(project(":layer_1:module_1_39"))
    implementation(project(":layer_1:module_1_23"))
    implementation(project(":layer_1:module_1_17"))
    implementation(project(":layer_1:module_1_48"))
    implementation(project(":layer_1:module_1_47"))
    implementation(project(":layer_1:module_1_32"))
    implementation(project(":layer_1:module_1_33"))
    implementation(project(":layer_1:module_1_35"))
    implementation(project(":layer_1:module_1_40"))
    implementation(project(":layer_1:module_1_28"))
    implementation(project(":layer_1:module_1_31"))
    implementation(project(":layer_1:module_1_45"))
    implementation(project(":layer_1:module_1_20"))
    implementation(project(":layer_1:module_1_26"))
    implementation(project(":layer_1:module_1_22"))
    implementation(project(":layer_1:module_1_38"))
    implementation(project(":layer_1:module_1_18"))
    implementation(project(":layer_1:module_1_27"))
    implementation(project(":layer_1:module_1_30"))
    implementation(project(":layer_1:module_1_21"))
    implementation(project(":layer_1:module_1_44"))


    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.10.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
        