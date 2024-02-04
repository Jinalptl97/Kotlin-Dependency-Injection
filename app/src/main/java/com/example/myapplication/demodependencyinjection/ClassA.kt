package com.example.myapplication.demodependencyinjection

import android.util.Log
import javax.inject.Inject

class ClassA @Inject constructor(){
    fun startClassA(){
        Log.i("Tag","Class A is created")
    }
}