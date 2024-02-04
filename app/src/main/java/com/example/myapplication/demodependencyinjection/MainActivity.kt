package com.example.myapplication.demodependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // val classC=ClassC()
       // classC.startClassC()

        DaggerClassCComponent.create().getclassInstance().startClassC()
    }
}