package com.example.viaggio.cadastro_user

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.viaggio.R

class CadastroUserContainer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro_user_container)
        openFirstFragment()
    }

    fun openFirstFragment(){
        val fragment = FragmentCadastroUserFirstStep()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.cadastro_user_container, fragment) // Substitua R.id.container pelo ID do seu contêiner
        transaction.commit()
    }

    fun openSecondFragment(){
        val fragment = FragmentCadastroUserSecondStep()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.cadastro_user_container, fragment) // Substitua R.id.container pelo ID do seu contêiner
        transaction.commit()
    }
}