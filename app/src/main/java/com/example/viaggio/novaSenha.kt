package com.example.viaggio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class novaSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nova_senha)
    }
    fun abrirInicioo(v: View?) {
        val intent1 = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent1)
    }
}