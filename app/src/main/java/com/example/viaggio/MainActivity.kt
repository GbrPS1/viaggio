package com.example.viaggio

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.viaggio.esqueceu_senha.EsqueceuSenha

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun abrirCad(v: View?) {
        val intent = Intent(applicationContext, tl_cadastro::class.java)
        startActivity(intent)
    }
    fun abrirInicio(v: View?) {
        val intent1 = Intent(applicationContext, tl_index_turista::class.java)
        startActivity(intent1)
    }
    fun openForgetPassword(v: View?) {
        val intent1 = Intent(applicationContext, EsqueceuSenha::class.java)
        startActivity(intent1)
    }

    fun abrirLocal(v: View?) {
//        val intent1 = Intent(applicationContext, recuperacaoSenha::class.java)
//        startActivity(intent1)
    }

}