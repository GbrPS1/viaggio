package com.example.viaggio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class tl_perfilPago : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tl_perfil_pago)
    }
    fun volta(v: View?) {
        val intent1 = Intent(applicationContext, HomeTurista::class.java)
        startActivity(intent1)
    }
}