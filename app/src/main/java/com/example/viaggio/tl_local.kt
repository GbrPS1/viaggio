package com.example.viaggio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class tl_local : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tl_local)
    }
    fun abrirReserva(v: View?) {
        val intent1 = Intent(applicationContext, tl_reservar::class.java)
        startActivity(intent1)
    }

}