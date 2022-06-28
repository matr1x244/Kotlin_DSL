package com.geekbrains.kotlindsl

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.geekbrains.newlibrary.sumModuleDSLNewLibrary
import com.geekbrains.newlibrary.textModuleDSLNewLibrary

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newModule()
    }

    private fun newModule() {
        textModuleDSLNewLibrary()
        sumModuleDSLNewLibrary.sum(100, 300)
        // Next NewLibraryPro, если через implementation
        sumModuleDSLNewLibrary.multi(100, 555)
    }

}