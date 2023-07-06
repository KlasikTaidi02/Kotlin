package com.example.mylogin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button
    private lateinit var editTexte : EditText
    private lateinit var  editTextn : EditText
    private lateinit var   editTexts : EditText
    private lateinit var  editTextj : EditText

    private lateinit var builder: AlertDialog.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener{

            button = findViewById(R.id.loginbutton)
            editTexte = findViewById(R.id.emailInput)
            editTextn = findViewById(R.id.passwordinput)
            editTexts = findViewById(R.id.semesterinput)
            this.editTextj = findViewById(R.id.jurusaninput)

            if(editTexte.text.toString().isEmpty() || editTextn.text.toString().isEmpty()
                || editTextj .text.toString().isEmpty()  || editTexts.text.toString().isEmpty())
            {


                builder = AlertDialog.Builder(this)


                builder.setTitle("ERROR !")
                    .setMessage("Inputan tidak boleh kosong !!")
                    .setCancelable(true)
                    .setNegativeButton("OK") { dialogInterface, _ ->
                        dialogInterface.cancel()
                    }



            }
            else if(!editTexte.text.toString().contains('@') || editTexte.text.toString()[editTexte.text.toString().length- 5] != '.')
            {


                builder = AlertDialog.Builder(this)

                builder.setTitle("ERROR !")
                    .setMessage(editTexte.text.toString())
                    .setCancelable(true)
                    .setNegativeButton("OK"){ dialogInterface, _ ->
                        dialogInterface.cancel()
                    }
                    .show()





            }else{
                callActivity()
            }


        }

    }

    private fun callActivity() {

        val editTexte = findViewById<EditText>(R.id.emailInput)
        val editTextn = findViewById<EditText>(R.id.passwordinput)
        val editTexts = findViewById<EditText>(R.id.semesterinput)
        val editTextj = findViewById<EditText>(R.id.jurusaninput)


        val email = editTexte.text.toString()
        val nama = editTextn.text.toString()
        val jurusan = editTextj .text.toString()
        val semester = editTexts.text.toString()

        val intentemail = Intent(this, ShowDataLogin::class.java).also {
            it.putExtra("email", email)

            startActivity(it)

        }

        val intentnama = Intent(this, ShowDataLogin::class.java).also {
            it.putExtra("nama", email)

            startActivity(it)

        }

        val intentjurusan = Intent(this, ShowDataLogin::class.java).also {
            it.putExtra("jurusan", jurusan)

            startActivity(it)

        }

        val intentsemester = Intent(this, ShowDataLogin::class.java).also {
            it.putExtra("semester", semester)

            startActivity(it)

        }


    }



}




