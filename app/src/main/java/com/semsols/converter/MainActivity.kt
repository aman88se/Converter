package com.semsols.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        convert.setOnClickListener {

            val convertVal = Number.text.toString().toInt() * 0.001

            kmText.text = "$convertVal KM"
        }

    }
}