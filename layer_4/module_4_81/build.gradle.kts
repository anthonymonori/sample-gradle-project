plugins {
    id("sample.android.library")
}

dependencies { 
    implementation(project(":layer_3:module_3_51"))
    implementation(project(":layer_3:module_3_60"))
    implementation(project(":layer_3:module_3_74"))
    implementation(project(":layer_3:module_3_58"))
    implementation(project(":layer_3:module_3_65"))


    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.10.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}
        