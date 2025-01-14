plugins {
    id("sample.android.library")
}

dependencies { 
    implementation(project(":layer_0:module_0_3"))
    implementation(project(":layer_0:module_0_5"))
    implementation(project(":layer_0:module_0_12"))
    implementation(project(":layer_0:module_0_7"))
    implementation(project(":layer_0:module_0_16"))
    implementation(project(":layer_0:module_0_9"))
    implementation(project(":layer_0:module_0_8"))
    implementation(project(":layer_0:module_0_10"))
    implementation(project(":layer_0:module_0_2"))


    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.10.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}
        