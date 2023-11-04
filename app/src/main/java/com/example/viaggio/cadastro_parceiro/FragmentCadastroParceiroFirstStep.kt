package com.example.viaggio.cadastro_parceiro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.viaggio.R

class FragmentCadastroParceiroFirstStep : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cadastro_parceiro_first_step, container, false)
        val buttonNext = view.findViewById<Button>(R.id.btnCadastrarParceiroGoToSecondStep)
        val buttonReturn = view.findViewById<Button>(R.id.buttonCadastroParceiroWithIcon)

        buttonNext.setOnClickListener {
            (activity as CadastroParceiroContainer).openSecondFragment();
        }

        buttonReturn.setOnClickListener{
            val fragmentManager = super.getChildFragmentManager();
            fragmentManager?.beginTransaction()?.remove(this)?.commit()
        }

        return view
    }
}