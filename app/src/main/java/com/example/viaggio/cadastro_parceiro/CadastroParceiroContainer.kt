package com.example.viaggio.cadastro_parceiro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viaggio.R

class CadastroParceiroContainer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_parceiro_container)
        openFirstFragment();
    }


    fun openFirstFragment(){
        val fragment = FragmentCadastroParceiroFirstStep()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.cadastro_parceiro_container, fragment) // Substitua R.id.container pelo ID do seu contêiner
        transaction.commit()
    }

    fun openSecondFragment(){
        val fragment = FragmentCadastroParceiroSecondStep()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.cadastro_parceiro_container, fragment) // Substitua R.id.container pelo ID do seu contêiner
        transaction.commit()
    }

    fun openThirdFragment(){
        val fragment = FragmentCadastroParceiroThirdStep()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.cadastro_parceiro_container, fragment) // Substitua R.id.container pelo ID do seu contêiner
        transaction.commit()
    }
}