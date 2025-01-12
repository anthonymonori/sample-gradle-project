package convention.internal

import org.gradle.api.Plugin
import org.gradle.api.initialization.Settings
import org.gradle.caching.http.HttpBuildCache
import org.gradle.kotlin.dsl.of

internal class GradleBuildCachePlugin : Plugin<Settings> {
    override fun apply(settings: Settings) {
        configureBuildCache(settings)
    }

    private fun configureBuildCache(settings: Settings) {
        with(settings) {
            val buildCacheRemoteUrl = providers
                .gradleProperty("sample.buildCache.remoteUrl")
                .getOrElse("")

            val serverReachableProvider = providers.of(ServerReachableValueSource::class) {
                this.parameters.url.set(buildCacheRemoteUrl)
            }
            val isRemoteCacheReachable = serverReachableProvider.get()

            val isLocalCacheEnabled = providers
                .systemProperty("isLocalCacheEnabled")
                .map(String::toBoolean)
                .getOrElse(true)

            val isRemoteCachePushEnabled = providers
                .systemProperty("isRemoteCachePushEnabled")
                .map(String::toBoolean)
                .getOrElse(false)

            val isRemoteCacheEnabled = providers
                .systemProperty("isRemoteCacheEnabled")
                .map(String::toBoolean)
                .getOrElse(true)

            buildCache.remote(HttpBuildCache::class.java) {
                setUrl(buildCacheRemoteUrl)
                isAllowInsecureProtocol = false
                isAllowUntrustedServer = false
                isEnabled = isRemoteCacheReachable && isRemoteCacheEnabled
                isPush = isRemoteCachePushEnabled
            }

            buildCache.local {
                isEnabled = isLocalCacheEnabled
            }
        }
    }
}
