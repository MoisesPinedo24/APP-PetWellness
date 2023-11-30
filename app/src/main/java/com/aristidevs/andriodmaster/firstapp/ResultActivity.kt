package com.aristidevs.andriodmaster.firstapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.aristidevs.andriodmaster.R

class ResultActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onBackPressed() {
        super.onBackPressed()


        finish()
    }


        @SuppressLint("MissingInflatedId")
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

            val Btcitas: CardView = findViewById(R.id.Btcitas)
            val Nosotros: CardView = findViewById(R.id.Nosotros)
            val TermCon: CardView = findViewById(R.id.TermCon)
        Btcitas.setOnClickListener {

            Btcitas.setOnClickListener {
                val intent: Intent = Intent(this, Citas_notas_Activity::class.java)
                startActivity(intent)
                finish()
            }

            }






            Nosotros.setOnClickListener {
                val intent = Intent(this, AcercaDeAppActivity::class.java)
                startActivity(intent)
            }

            TermCon.setOnClickListener {
                val intent = Intent(this, TerminosActivity::class.java)
                startActivity(intent)
            }



        }

    }

