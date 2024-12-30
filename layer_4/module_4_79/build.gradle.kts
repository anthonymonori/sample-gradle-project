plugins {
    id("sample.android.library")
}

dependencies { 
    implementation(project(":layer_3:module_3_63"))
    implementation(project(":layer_3:module_3_75"))
    implementation(project(":layer_3:module_3_73"))
    implementation(project(":layer_3:module_3_77"))
    implementation(project(":layer_3:module_3_62"))
    implementation(project(":layer_3:module_3_71"))
    implementation(project(":layer_3:module_3_68"))
    implementation(project(":layer_3:module_3_53"))
    implementation(project(":layer_3:module_3_52"))
    implementation(project(":layer_3:module_3_64"))
    implementation(project(":layer_3:module_3_54"))


    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.10.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}
        