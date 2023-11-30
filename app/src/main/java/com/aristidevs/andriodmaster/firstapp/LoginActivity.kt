package com.aristidevs.andriodmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.aristidevs.andriodmaster.R
import com.aristidevs.andriodmaster.databinding.ActivityLoginBinding
import com.aristidevs.andriodmaster.databinding.ActivityRegristroBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class LoginActivity : AppCompatActivity() {
    private lateinit var auth:FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = Firebase.auth

        val button2: Button = findViewById(R.id.button2)
        val email = findViewById<EditText>(R.id.editTextText)
        val password = findViewById<EditText>(R.id.editTextText2)
        val buttonRegristro = findViewById<Button>(R.id.button4)
        button2.setOnClickListener {
        if (email.text.isEmpty()||password.text.isEmpty()){
            showMessage("Campo vacio")
            return@setOnClickListener
        }
            if (!email.text.matches("^[A-Za-z0-9+_.-]+@(.+)$".toRegex() )){
                showMessage("email invalido")
                return@setOnClickListener


            }

            initSession(email.text.toString(),password.text.toString())

        }

        buttonRegristro.setOnClickListener {
            this.startActivity(Intent(this,RegristroActivity::class.java))
            finish()
        }

    }

    private fun initSession(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
            if (it.isSuccessful){
                Log.e("Bienvenido!!", "Sesion iniciada")
                goHome()

            }
            else{ Log.e("Bienvenido no bro!!", "Sesion no iniciada bro")
                showMessage("Usuario no registrado")
            }



        }

    }

    private fun goHome(){
        val intent: Intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
        finish()

    }
    private fun showMessage(massege: String){
        Toast.makeText(this,massege,Toast.LENGTH_SHORT).show()

    }
    override fun onBackPressed() {
        super.onBackPressed()
        this.startActivity(Intent(this,WolcomeActivity::class.java))
    }



}