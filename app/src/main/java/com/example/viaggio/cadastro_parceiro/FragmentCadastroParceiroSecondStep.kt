package com.example.viaggio.cadastro_parceiro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.viaggio.R

class FragmentCadastroParceiroSecondStep : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_cadastro_parceiro_second_step, container, false)
        val buttonReturn = view.findViewById<Button>(R.id.buttonCadastroParceiroWithIcon);
        val buttonNext = view.findViewById<Button>(R.id.btnSignupParceiroGoToPassword)

        buttonNext.setOnClickListener {
            (activity as CadastroParceiroContainer).openThirdFragment();
        }

        buttonReturn.setOnClickListener{
            (activity as CadastroParceiroContainer).openFirstFragment();
        }

        return view;
    }
}