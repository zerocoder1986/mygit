package com.example.philip.msgshareapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {

            val user:String= username.text.toString()
           val intent= Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,user)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"fack fack fack fuck the pussies"))
        //    intent.putExtra("user",user)
        //    startActivity(intent)
        }

    }
}
