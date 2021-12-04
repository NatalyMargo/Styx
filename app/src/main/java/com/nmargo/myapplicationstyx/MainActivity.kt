package com.nmargo.myapplicationstyx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "У меня живет козленок,")
    }

    override fun onStart() {
        super.onStart()
        Log.d (TAG,  "Я сама его пасу.")
    }

    override fun onResume() {
        super.onResume()
        Log.d (TAG, "Я козленка в сад зеленый")
    }

    override fun onPause() {
        super.onPause()
        Log.d (TAG, "Рано утром отнесу.")
    }

    override fun onStop() {
        super.onStop()
        Log.d (TAG,  "Он заблудится в саду-")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d (TAG, "Я в траве его найду.\nУ меня живет козленок.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d (TAG,  "Я в траве его найду")
    }
}