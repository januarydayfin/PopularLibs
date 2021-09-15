package com.krayapp.popularlibs

class Presenter(val view: View) {
    private val model = Model()

    fun firstCounter(){
        model.incrementCounter(0)
        view.setCounter(0, model.getCurrent(0))
    }

    fun secondCounter(){
        model.incrementCounter(1)
        view.setCounter(1, model.getCurrent(1))
    }

    fun thirdCounter(){
        model.incrementCounter(2)
        view.setCounter(2, model.getCurrent(2))
    }
}