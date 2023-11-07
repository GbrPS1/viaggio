package com.example.viaggio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class HomeTurista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_turista)
    }
    fun abrirHome(v: View?) {
        val intent1 = Intent(applicationContext, HomeTurista::class.java)
        startActivity(intent1)
    }
    fun abrirLocal(v: View?) {
        val intent1 = Intent(applicationContext, tl_local::class.java)
        startActivity(intent1)
    }
    fun abrirPerfilTurista(v: View?) {
        val intent1 = Intent(applicationContext, perfil_guia::class.java)
        startActivity(intent1)
    }
}