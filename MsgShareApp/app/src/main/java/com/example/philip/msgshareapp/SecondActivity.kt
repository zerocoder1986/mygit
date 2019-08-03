package com.example.philip.msgshareapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_layout.*


class SecondActivity: AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        val bundle:Bundle?=intent.extras
       val msg= bundle!!.getString("user")
        textView.text=msg
    }

}