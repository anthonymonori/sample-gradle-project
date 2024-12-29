package com.performance

class Module_3_60_50 {
    fun module_3_60_50() : String {
        val value = "Module_3_60_50"
        println("module_3_60")
        
        val dependencyClass0 = com.performance.Module_2_50_100().module_2_50_100()
        println(dependencyClass0)
        val dependencyClass1 = com.performance.Module_2_50_90().module_2_50_90()
        println(dependencyClass1)

        return value
    }
}
