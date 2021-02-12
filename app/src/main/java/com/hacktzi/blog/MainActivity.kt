package com.hacktzi.blog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        //Thread.sleep(10000)//show splashScreen 10 seconds
        setTheme(R.style.Theme_HackTziBlog) //set normal theme before show activity
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}