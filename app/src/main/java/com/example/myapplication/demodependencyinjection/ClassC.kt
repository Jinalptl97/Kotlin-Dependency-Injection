package com.example.myapplication.demodependencyinjection

import android.util.Log
import javax.inject.Inject

//class ClassC {
//    private val classA=ClassA()
//    private  val classB=ClassB()
//
//    fun startClassC(){
//        classA.startClassA()
//        classB.startClassB()
//        Log.i("TAG","Class C is started")
//    }
//
//}

class ClassC @Inject constructor(private val classA: ClassA, private val classB: ClassB ){
    fun startClassC(){
       classA.startClassA()
        classB.startClassB()
        Log.i("TAG","Class C is started") }


}