plugins {
    id("sample.android.library")
}

dependencies { 
    implementation(project(":layer_3:module_3_56"))
    implementation(project(":layer_3:module_3_59"))
    implementation(project(":layer_3:module_3_55"))
    implementation(project(":layer_3:module_3_66"))
    implementation(project(":layer_3:module_3_65"))
    implementation(project(":layer_3:module_3_61"))
    implementation(project(":layer_3:module_3_57"))
    implementation(project(":layer_3:module_3_76"))
    implementation(project(":layer_3:module_3_52"))
    implementation(project(":layer_3:module_3_72"))
    implementation(project(":layer_3:module_3_64"))
    implementation(project(":layer_3:module_3_69"))
    implementation(project(":layer_3:module_3_70"))
    implementation(project(":layer_3:module_3_67"))


    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.8.0")
    testImplementation("junit:junit:4.13.2")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.10.1")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}
        