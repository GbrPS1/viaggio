package com.example.viaggio.cadastro_parceiro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.viaggio.R


class FragmentCadastroParceiroThirdStep : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_cadastro_parceiro_third_step, container, false)

        val checkBox = view.findViewById<CheckBox>(R.id.checkboxParceiroConcordo)
        val textView = view.findViewById<TextView>(R.id.labelParceiroConcordo)
        val buttonReturn = view.findViewById<Button>(R.id.buttonWithIconThirdParceiroFragment);

        textView.setOnClickListener {
            checkBox.isChecked = !checkBox.isChecked
        }

        buttonReturn.setOnClickListener{
            (activity as CadastroParceiroContainer).openSecondFragment();
        }

        return view
    }
}