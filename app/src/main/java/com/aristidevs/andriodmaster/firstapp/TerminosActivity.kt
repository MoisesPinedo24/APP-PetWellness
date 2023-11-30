package com.aristidevs.andriodmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aristidevs.andriodmaster.R

class TerminosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terminos)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        this.startActivity(Intent(this,ResultActivity::class.java))
    }


}