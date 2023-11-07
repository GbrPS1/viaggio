package com.example.viaggio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import android.widget.ToggleButton
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat.startActivity

class tl_reservar : AppCompatActivity() {

    private lateinit var toggleButton: ToggleButton
    private lateinit var toggleButton2: ToggleButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tl_reservar)
        toggleButton = findViewById(R.id.toggleButton)

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {

                toggleButton.setBackgroundResource(R.drawable.borda)
            } else {

                toggleButton.setBackgroundResource(0)
            }

        }
        toggleButton2 = findViewById(R.id.toggleButton2)

        toggleButton2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {

                toggleButton2.setBackgroundResource(R.drawable.borda)
            } else {

                toggleButton2.setBackgroundResource(0)
            }
    }
    }
    fun Confirmacao(view: View) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Confirmação")
        builder.setMessage("Você tem certeza de que deseja continuar?")

        builder.setPositiveButton("Sim") { dialog, which ->
            val valor = 200

            val segundaBuilder = AlertDialog.Builder(this)
            segundaBuilder.setTitle("Pagamento")
            segundaBuilder.setMessage("Valor: R$$valor,00")
            segundaBuilder.setPositiveButton("Realizar Pagamento") { dialog, which ->

                val pagamentoBemSucedido = realizarPagamento(valor)

                if (pagamentoBemSucedido) {
                    Toast.makeText(this, "Pagamento bem sucediso.", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, tl_perfilPago::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "Pagamento falhou. Tente novamente.", Toast.LENGTH_SHORT).show()
                }
            }

            segundaBuilder.setNegativeButton("Cancelar") { dialog, which ->

            }

            val segundaDialog = segundaBuilder.create()
            segundaDialog.show()
        }

        builder.setNegativeButton("Não") { dialog, which ->

        }

        val dialog = builder.create()
        dialog.show()
    }


    private fun realizarPagamento(valor: Int): Boolean {

        return true
    }




}