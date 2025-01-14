package com.sample.features

import com.android.build.api.dsl.CommonExtension
import com.sample.SampleCompanyExtensionMarker
import org.gradle.api.GradleException
import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.property
import javax.inject.Inject

@SampleCompanyExtensionMarker
abstract class DaggerHandler @Inject internal constructor(objects: ObjectFactory) {
    internal val daggerHiltCore get() = "com.google.dagger:hilt-core:2.53.1"
    internal val daggerHiltCompiler get() = "com.google.dagger:hilt-compiler:2.53.1"
    internal val daggerHiltAndroid get() = "com.google.dagger:hilt-android:2.53.1"

    private val enabled: Property<Boolean> = objects.property<Boolean>().convention(false)
    private val useKsp: Property<Boolean> = objects.property<Boolean>().convention(false)
    private val _debugOnly: Property<Boolean> = objects.property<Boolean>().convention(false)
    private val _useAndroidFeatures: Property<Boolean> = objects.property<Boolean>().convention(false)

    internal var androidExtension: CommonExtension<*, *, *, *, *, *>? = null

    /**
     * Use this in your module if you only need dagger for debug sources e.g. providing a Preview implementation of the feature you are building.
     *
     * default = false
     */
    var debugOnly: Boolean
        get() = _debugOnly.get()
        set(value) {
            _debugOnly.set(value)
            _debugOnly.disallowChanges()
        }

    /**
     * It only needs to be applied when you're using things like `@AndroidEntryPoint`, `@HiltViewModel`, or other android components. If you're only using dagger for pure kotlin code, you can omit setting this.
     *
     * default = false
     */
    var useAndroidFeatures: Boolean
        get() = _useAndroidFeatures.get()
        set(value) {
            _useAndroidFeatures.set(value)
            _useAndroidFeatures.disallowChanges()
        }

    internal fun enable() {
        enabled.set(true)
        enabled.disallowChanges()
    }

    internal fun applyTo(project: Project) {
        with(project) {
            if (enabled.get().not()) return@with

            setupDaggerCompiler()
            if (useAndroidFeatures) {
                setupDaggerAndroid()
            } else {
                setupDaggerCore()
            }
        }
    }

    private fun Project.setupDaggerCore() {
        dependencies.apply {
            add(if (debugOnly) "debugImplementation" else "implementation", daggerHiltCore)
        }
    }

    private fun Project.setupDaggerAndroid() {
        val isAndroidScope = (plugins.hasPlugin("com.android.library") || plugins.hasPlugin("com.android.application")) && androidExtension != null
        check(isAndroidScope) { throw GradleException("Trying to use dagger with android features without \"com.wise.build.android.library\" plugin applied. ") }
        pluginManager.apply("com.google.dagger.hilt.android")
        dependencies.apply {
            add(if (debugOnly) "debugImplementation" else "implementation", daggerHiltAndroid)
        }
    }

    private fun Project.setupDaggerCompiler() {
        if (useKsp.get()) {
            pluginManager.apply("com.google.devtools.ksp")
            dependencies.apply {
                add("ksp", daggerHiltCompiler)
            }
        } else {
            pluginManager.apply("kotlin-kapt")
            dependencies.apply {
                add("kapt", daggerHiltCompiler)
            }
        }
    }
}