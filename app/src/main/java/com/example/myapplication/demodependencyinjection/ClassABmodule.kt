package com.example.myapplication.demodependencyinjection

import dagger.Module
import dagger.Provides

@Module
object ClassABmodule {
    @Provides
    fun provideclassA(): ClassA{
        return ClassA()
    }

    @Provides
    fun provideclassB(): ClassB{
        return ClassB()
    }
}