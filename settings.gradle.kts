rootProject.name="sample-gradle-project"

pluginManagement {
    includeBuild("build-logic-settings")
}

plugins {
    id("sample.settings")
}
