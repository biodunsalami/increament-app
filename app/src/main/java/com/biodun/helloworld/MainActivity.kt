package com.biodun.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var tv_number = 1
    //if tv_number is set to 0 instead, button click wont start the increment until the second click

    fun increment(view: View) {
        tv1.text = (tv_number++).toString()
    }

}


