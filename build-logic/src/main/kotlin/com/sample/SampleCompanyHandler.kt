package com.sample

import com.android.build.api.dsl.CommonExtension
import com.sample.features.FeaturesHandler
import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import javax.inject.Inject

@DslMarker
annotation class SampleCompanyExtensionMarker

@SampleCompanyExtensionMarker
open class SampleCompanyExtension @Inject internal constructor(objects: ObjectFactory) {

    private val featuresHandler = objects.newInstance(FeaturesHandler::class.java)

    internal var androidExtension: CommonExtension<*, *, *, *, *, *>? = null
        set(value) {
            field = value
            featuresHandler.androidExtension = value
        }

    fun features(action: Action<FeaturesHandler>) {
        action.execute(featuresHandler)
    }

    internal fun applyTo(project: Project) {
        project.afterEvaluate {
            featuresHandler.applyTo(project)
        }
    }
}