package com.aristidevs.andriodmaster.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.window.OnBackInvokedDispatcher
import com.aristidevs.andriodmaster.R
import com.aristidevs.andriodmaster.databinding.ActivityRegristroBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class RegristroActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val  binding = ActivityRegristroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = Firebase.auth

        binding.Reg.setOnClickListener {
            if (binding.emailReg.text.isEmpty() || binding.ContraReg.text.isEmpty() ){
                showMessage("Campo vacio")
                return@setOnClickListener

            }

        registerUser(binding.emailReg.text.toString(),binding.ContraReg.text.toString())

        }
    }

    private fun registerUser(email:String,password:String){
        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
            if (it.isSuccessful){
                goHome()

            }

        }

    }

    private fun goHome(){
        val intent: Intent = Intent(this, ResultActivity::class.java)
        startActivity(intent)
        finish()

    }
    private fun showMessage(massege: String){
        Toast.makeText(this,massege, Toast.LENGTH_SHORT).show()

    }

    override fun onBackPressed() {
        super.onBackPressed()
        this.startActivity(Intent(this,LoginActivity::class.java))
    }




}