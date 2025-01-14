package com.sample.features

import com.android.build.api.dsl.CommonExtension
import com.sample.SampleCompanyExtensionMarker
import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import org.gradle.kotlin.dsl.newInstance
import javax.inject.Inject

@SampleCompanyExtensionMarker
abstract class FeaturesHandler @Inject internal constructor(objects: ObjectFactory) {
    private val composeHandler = objects.newInstance<ComposeHandler>()
    private val daggerHandler = objects.newInstance<DaggerHandler>()

    internal var androidExtension: CommonExtension<*, *, *, *, *, *>? = null
        set(value) {
            field = value
            composeHandler.androidExtension = value
            daggerHandler.androidExtension = value
        }

    internal fun applyTo(project: Project) {
        composeHandler.applyTo(project)
        daggerHandler.applyTo(project)
    }

    fun compose(action: Action<ComposeHandler>? = null) {
        composeHandler.enable()
        action?.execute(composeHandler)
    }

    fun dagger(action: Action<DaggerHandler>? = null) {
        daggerHandler.enable()
        action?.execute(daggerHandler)
    }
}