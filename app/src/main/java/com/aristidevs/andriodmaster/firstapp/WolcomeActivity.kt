package com.aristidevs.andriodmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.aristidevs.andriodmaster.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class WolcomeActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onStart() {
        super.onStart()
        auth = Firebase.auth
        val user = auth.currentUser
        if(user!=null){
            val intent: Intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
            finish()

        }


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        val screenSplash = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wolcome)
        screenSplash.setKeepOnScreenCondition{false}
        val btAcceder: Button = findViewById(R.id.btAcceder)
        btAcceder.setOnClickListener {
            val intent: Intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

}