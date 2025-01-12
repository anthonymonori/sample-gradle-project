plugins {
    `kotlin-dsl`
}

dependencies {
    
}

gradlePlugin {
    plugins {
        create("settings") {
            id = "sample.$name"
            implementationClass = "convention.SampleSettingsPlugin"
        }
    }
}
