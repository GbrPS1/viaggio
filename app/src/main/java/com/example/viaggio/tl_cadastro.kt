package com.example.viaggio

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.viaggio.cadastro_parceiro.CadastroParceiroContainer
import com.example.viaggio.cadastro_user.CadastroUserContainer

class tl_cadastro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tl_cadastro)
    }
    fun returnToLogin(v: View?){
        super.onBackPressedDispatcher.onBackPressed()
    }

    fun openPartnerSignupFlow(v: View?){
        val intentCadastroUserContainer = Intent(applicationContext, CadastroParceiroContainer::class.java)
        startActivity(intentCadastroUserContainer)
    }

    fun openUserSignupFlow(v: View?){
        val intentCadastroUserContainer = Intent(applicationContext, CadastroUserContainer::class.java)
        startActivity(intentCadastroUserContainer)
    }

}
