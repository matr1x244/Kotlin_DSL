package com.geekbrains.newlibrary

import com.geekbrains.newlibrarypro.NewLibraryPro

fun textModuleDSLNewLibrary() {
    var a = "NewLibrary.kt MODULE DSL "
    var b = "LOADING"
    var c = a + b
    println("@@@ $c")
}

object sumModuleDSLNewLibrary {
    fun sum(a: Int, b: Int) {
        val c = a + b
        println("@@@ $c")
    }

    //  NewLibraryPro
    fun multi(a: Int, b: Int) {
        val c = NewLibraryPro.multi(a, b) * 2
        println("@@@ $c")
    }
}