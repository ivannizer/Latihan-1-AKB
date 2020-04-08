package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val intent = Intent(this, KodeLogin::class.java)
            startActivity(intent)
        }
    }
}

/*
    5 April 2020 mengerjakan layout beserta code
    10117154
    Andi Muhammad Ivan M
    IF4
*/
