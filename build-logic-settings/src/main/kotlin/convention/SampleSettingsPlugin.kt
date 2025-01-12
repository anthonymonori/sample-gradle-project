package convention

import convention.internal.GradleBuildCachePlugin
import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.api.initialization.resolve.DependencyResolutionManagement
import org.gradle.kotlin.dsl.maven
import org.gradle.plugin.management.PluginManagementSpec

class SampleSettingsPlugin : Plugin<Settings> {
    override fun apply(settings: Settings) {
        with(settings) {
            enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
            enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

            pluginManagement {
                configurePluginManagement()
            }

            dependencyResolutionManagement {
                configureRepositories()
            }

            pluginManager.apply(GradleBuildCachePlugin::class.java)

            defineProjects()
        }
    }

    private fun Settings.defineProjects() {
        includeBuild("build-logic")
        include (":layer_0:module_0_1")
        include (":layer_0:module_0_2")
        include (":layer_0:module_0_3")
        include (":layer_0:module_0_4")
        include (":layer_0:module_0_5")
        include (":layer_0:module_0_6")
        include (":layer_0:module_0_7")
        include (":layer_0:module_0_8")
        include (":layer_0:module_0_9")
        include (":layer_0:module_0_10")
        include (":layer_0:module_0_11")
        include (":layer_0:module_0_12")
        include (":layer_0:module_0_13")
        include (":layer_0:module_0_14")
        include (":layer_0:module_0_15")
        include (":layer_0:module_0_16")
        include (":layer_1:module_1_17")
        include (":layer_1:module_1_18")
        include (":layer_1:module_1_19")
        include (":layer_1:module_1_20")
        include (":layer_1:module_1_21")
        include (":layer_1:module_1_22")
        include (":layer_1:module_1_23")
        include (":layer_1:module_1_24")
        include (":layer_1:module_1_25")
        include (":layer_1:module_1_26")
        include (":layer_1:module_1_27")
        include (":layer_1:module_1_28")
        include (":layer_1:module_1_29")
        include (":layer_1:module_1_30")
        include (":layer_1:module_1_31")
        include (":layer_1:module_1_32")
        include (":layer_1:module_1_33")
        include (":layer_1:module_1_34")
        include (":layer_1:module_1_35")
        include (":layer_1:module_1_36")
        include (":layer_1:module_1_37")
        include (":layer_1:module_1_38")
        include (":layer_1:module_1_39")
        include (":layer_1:module_1_40")
        include (":layer_1:module_1_41")
        include (":layer_1:module_1_42")
        include (":layer_1:module_1_43")
        include (":layer_1:module_1_44")
        include (":layer_1:module_1_45")
        include (":layer_1:module_1_46")
        include (":layer_1:module_1_47")
        include (":layer_1:module_1_48")
        include (":layer_1:module_1_49")
        include (":layer_2:module_2_50")
        include (":layer_3:module_3_51")
        include (":layer_3:module_3_52")
        include (":layer_3:module_3_53")
        include (":layer_3:module_3_54")
        include (":layer_3:module_3_55")
        include (":layer_3:module_3_56")
        include (":layer_3:module_3_57")
        include (":layer_3:module_3_58")
        include (":layer_3:module_3_59")
        include (":layer_3:module_3_60")
        include (":layer_3:module_3_61")
        include (":layer_3:module_3_62")
        include (":layer_3:module_3_63")
        include (":layer_3:module_3_64")
        include (":layer_3:module_3_65")
        include (":layer_3:module_3_66")
        include (":layer_3:module_3_67")
        include (":layer_3:module_3_68")
        include (":layer_3:module_3_69")
        include (":layer_3:module_3_70")
        include (":layer_3:module_3_71")
        include (":layer_3:module_3_72")
        include (":layer_3:module_3_73")
        include (":layer_3:module_3_74")
        include (":layer_3:module_3_75")
        include (":layer_3:module_3_76")
        include (":layer_3:module_3_77")
        include (":layer_4:module_4_78")
        include (":layer_4:module_4_79")
        include (":layer_4:module_4_80")
        include (":layer_4:module_4_81")
        include (":layer_4:module_4_82")
        include (":layer_4:module_4_83")
        include (":layer_4:module_4_84")
        include (":layer_4:module_4_85")
        include (":layer_4:module_4_86")
        include (":layer_4:module_4_87")
        include (":layer_4:module_4_88")
        include (":layer_4:module_4_89")
        include (":layer_4:module_4_90")
        include (":layer_4:module_4_91")
        include (":layer_5:module_5_92")
        include (":layer_5:module_5_93")
        include (":layer_5:module_5_94")
        include (":layer_5:module_5_95")
        include (":layer_5:module_5_96")
        include (":layer_5:module_5_97")
        include (":layer_5:module_5_98")
        include (":layer_5:module_5_99")
        include (":app")
    }

    private fun PluginManagementSpec.configurePluginManagement() {
        repositories {
            google().content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
            gradlePluginPortal()
            mavenCentral()
        }
        includeBuild("build-logic")
    }

    private fun DependencyResolutionManagement.configureRepositories() {
        @Suppress("UnstableApiUsage")
        repositories {
            google().content {
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("androidx.*")
            }
            gradlePluginPortal()
            mavenCentral()
        }
    }
}