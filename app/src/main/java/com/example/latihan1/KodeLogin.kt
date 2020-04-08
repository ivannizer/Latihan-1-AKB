package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login_code.*

class KodeLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_code)

        button2.setOnClickListener {
            val kode :String = input1.text.toString()

            if(kode.isEmpty())
            {
                Toast.makeText(this,"Kolom Kode Tidak Boleh Dikosongkan",Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }

            val intent = Intent(this, Biodata::class.java)
            startActivity(intent)
        }
    }
}