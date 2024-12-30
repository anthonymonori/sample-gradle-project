plugins {
    id("sample.android.library")
}

dependencies { 
    implementation(project(":layer_4:module_4_84"))
    implementation(project(":layer_4:module_4_87"))
    implementation(project(":layer_4:module_4_89"))
    implementation(project(":layer_4:module_4_83"))
    implementation(project(":layer_4:module_4_85"))
    implementation(project(":layer_4:module_4_81"))
    implementation(project(":layer_4:module_4_78"))
    implementation(project(":layer_4:module_4_82"))
    implementation(project(":layer_4:module_4_91"))
    implementation(project(":layer_4:module_4_90"))
    implementation(project(":layer_4:module_4_80"))
    implementation(project(":layer_4:module_4_79"))
    implementation(project(":layer_4:module_4_86"))


    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.10.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}
        