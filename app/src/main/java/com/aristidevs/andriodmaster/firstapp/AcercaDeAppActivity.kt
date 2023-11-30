package com.aristidevs.andriodmaster.firstapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.aristidevs.andriodmaster.R

class AcercaDeAppActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acerca_de_app)


    }
    override fun onBackPressed() {
        super.onBackPressed()
        this.startActivity(Intent(this,ResultActivity::class.java))
    }


}