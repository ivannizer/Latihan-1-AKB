package com.example.latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.biodata.*

class Biodata : AppCompatActivity() {

    lateinit var Nama : EditText
    lateinit var Btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biodata)

        Nama = findViewById(R.id.nama)
        Btn = findViewById(R.id.button4)

        Btn.setOnClickListener {
            var name = Nama.text.toString()
            var umur1 :String = umur.text.toString()

            if(name.isEmpty())
            {
                Toast.makeText(this,"Kolom Nama Tidak Boleh Dikosongkan", Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }

            if(umur1.isEmpty())
            {
                Toast.makeText(this,"Kolom Umur Tidak Boleh Dikosongkan",Toast.LENGTH_SHORT ).show()
                return@setOnClickListener
            }

            val intent = Intent(this, SayHai::class.java)
            intent.putExtra("Nama", name)
            startActivity(intent)
        }

    }
}