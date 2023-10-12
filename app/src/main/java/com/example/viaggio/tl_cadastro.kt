package com.example.viaggio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class tl_cadastro : AppCompatActivity() {

    lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tl_cadastro)

    loadFragment(tl_cadastro_turista())
    bottomNav = findViewById(R.id.bottomNav) as BottomNavigationView
    bottomNav.setOnItemSelectedListener {
        when (it.itemId) {
            R.id.home -> {
                loadFragment(tl_cadastro_turista())
                true
            }
            R.id.message -> {
                loadFragment(tl_cadastro_parceiro())
                true
            }
            else -> false
        }
    }

}

private  fun loadFragment(fragment: Fragment){
    val transaction = supportFragmentManager.beginTransaction()
    transaction.replace(R.id.container,fragment)
    transaction.commit()
}


    fun abrirInicio(v: View?) {
        val intent1 = Intent(applicationContext, tl_index_turista::class.java)
        startActivity(intent1)
    }

    }
