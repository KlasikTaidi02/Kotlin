package com.example.mylogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ShowDataLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_showdatalogin)

        val message1 = intent.getStringExtra("email")
        val message2 = intent.getStringExtra("nama")
        val message3 = intent.getStringExtra("jurusan")
        val message4 = intent.getStringExtra("semester")

        val textViewe = findViewById<TextView>(R.id.emailtext).apply {
            text = message1
        }

        val textViewn = findViewById<TextView>(R.id.namatext).apply {
            text = message2
        }

        val textViews = findViewById<TextView>(R.id.semestertext).apply {
            text = message4
        }

        val textViewj = findViewById<TextView>(R.id.jurusantext).apply {
            text = message3
        }


    }
}