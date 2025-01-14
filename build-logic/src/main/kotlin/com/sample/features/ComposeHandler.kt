package com.sample.features

import com.android.build.api.dsl.CommonExtension
import com.sample.SampleCompanyExtensionMarker
import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.property
import javax.inject.Inject

@SampleCompanyExtensionMarker
abstract class ComposeHandler @Inject internal constructor(objects: ObjectFactory) {
    internal val composeVersion get() = "1.7.1"

    private val enabled = objects.property<Boolean>().convention(false)

    internal var androidExtension: CommonExtension<*, *, *, *, *, *>? = null

    internal fun enable() {
        enabled.set(true)
        enabled.disallowChanges()
        val extension =
            checkNotNull(androidExtension) {
                "ComposeHandler must be configured with an Android extension before it can be enabled. Did you apply the Android gradle plugin?"
            }
        extension.apply {
            buildFeatures { compose = true }
        }
    }

    internal fun applyTo(project: Project) {
        with(project) {
            if (enabled.get()) {
                plugins.apply("org.jetbrains.kotlin.plugin.compose")
                plugins.apply("org.jetbrains.compose")

                dependencies.apply {
                    val configuration = "implementation"
                    val debugConfiguration = "debugImplementation"

                    // core compose dependencies
                    add(debugConfiguration, "org.jetbrains.compose.ui:ui-tooling-preview:$composeVersion")
                    add(debugConfiguration, "org.jetbrains.compose.components:components-ui-tooling-preview:$composeVersion")
                    add(configuration, "org.jetbrains.compose.ui:ui:$composeVersion")
                    add(configuration, "org.jetbrains.compose.runtime:runtime:$composeVersion")
                    add(configuration, "org.jetbrains.compose.material3:material3:$composeVersion")
                    add(configuration, "org.jetbrains.compose.foundation:foundation:$composeVersion")
                    add(configuration, "org.jetbrains.compose.ui:ui-tooling:$composeVersion")
                }
            }
        }
    }
}