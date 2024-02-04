package com.example.myapplication.demodependencyinjection

import android.util.Log
import javax.inject.Inject

class ClassB @Inject constructor() {
    fun startClassB(){
        Log.i("Tag","Class B is created")
    }
}