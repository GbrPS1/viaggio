package com.example.viaggio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class recuperacaoCod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperacao_cod)
    }
    fun abrirNovaSenha(v: View?) {
        val intent1 = Intent(applicationContext, novaSenha::class.java)
        startActivity(intent1)
    }


}