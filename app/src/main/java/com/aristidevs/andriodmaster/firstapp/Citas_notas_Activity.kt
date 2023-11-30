package com.aristidevs.andriodmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aristidevs.andriodmaster.R

class Citas_notas_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_citas_notas)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        this.startActivity(Intent(this,ResultActivity::class.java))
    }


}