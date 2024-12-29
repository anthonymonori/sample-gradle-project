package com.performance

class Module_3_60_120 {
    fun module_3_60_120() : String {
        val value = "Module_3_60_120"
        println("module_3_60")
        
        val dependencyClass0 = com.performance.Module_2_50_40().module_2_50_40()
        println(dependencyClass0)
        val dependencyClass1 = com.performance.Module_2_50_97().module_2_50_97()
        println(dependencyClass1)

        return value
    }
}
