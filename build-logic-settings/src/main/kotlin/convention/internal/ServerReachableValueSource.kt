package convention.internal

import org.gradle.api.provider.Property
import org.gradle.api.provider.ValueSource
import org.gradle.api.provider.ValueSourceParameters
import org.gradle.process.ExecOperations
import javax.inject.Inject

abstract class ServerReachableValueSource : ValueSource<Boolean, ServerReachableParameters> {

    @get:Inject
    abstract val execOperations: ExecOperations

    override fun obtain(): Boolean {
        val url = parameters.url.get()
        return try {
            val exitValue = execOperations.exec {
                commandLine = "curl --silent --output /dev/null --max-time 1 --head $url".split(" ")
            }.exitValue

            exitValue == 0
        } catch (exception: Exception) {
            false
        }
    }
}

interface ServerReachableParameters : ValueSourceParameters {
    val url: Property<String>
}
