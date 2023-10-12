package com.example.viaggio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class recuperacaoSenha : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mandar_email)
    }fun confirmaCod(v: View?) {
        val intent1 = Intent(applicationContext, recuperacaoCod::class.java)
        startActivity(intent1)
    }


}