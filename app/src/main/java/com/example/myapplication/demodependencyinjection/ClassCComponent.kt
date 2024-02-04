package com.example.myapplication.demodependencyinjection

import dagger.Component

@Component(modules = [ClassABmodule::class])
interface ClassCComponent {
    fun getclassInstance():ClassC
}