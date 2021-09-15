package com.krayapp.popularlibs

class Model {

    private val counters = mutableListOf(0, 0, 0)

    fun incrementCounter(index:Int){
        ++counters[index]
    }
    fun getCurrent(index: Int): Int {
        return counters[index]
    }

}