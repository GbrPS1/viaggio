package com.example.viaggio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

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
    fun abrirEsqueceu(v: View?) {
        val intent1 = Intent(applicationContext, recuperacaoSenha::class.java)
        startActivity(intent1)
    }

    fun abrirLocal(v: View?) {
        val intent1 = Intent(applicationContext, recuperacaoSenha::class.java)
        startActivity(intent1)
    }

}