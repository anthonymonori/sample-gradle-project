package com.sample.convention

import org.gradle.api.Plugin
import org.gradle.api.Project

internal class SampleRootPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        require(project == project.rootProject) {
            "Plugin must be applied to root project!"
        }

        project.plugins.apply("com.jraska.module.graph.assertion")
    }
}