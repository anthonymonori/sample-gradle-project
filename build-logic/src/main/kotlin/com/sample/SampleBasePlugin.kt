package com.sample

import com.android.build.api.dsl.LibraryExtension
import com.android.build.gradle.internal.dsl.BaseAppModuleExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class SampleBasePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        with(project) {
            require(this != rootProject) {
                "Plugin should not be applied to root project!"
            }

            val sampleExtension = extensions.create(
                "sample", SampleCompanyExtension::class.java,
            )

            pluginManager.withPlugin("com.android.application") {
                configure<BaseAppModuleExtension> {
                    sampleExtension.androidExtension = this
                }
            }

            project.pluginManager.withPlugin("com.android.library") {
                configure<LibraryExtension> {
                    sampleExtension.androidExtension = this
                }
            }

            sampleExtension.applyTo(this)
        }
    }
}