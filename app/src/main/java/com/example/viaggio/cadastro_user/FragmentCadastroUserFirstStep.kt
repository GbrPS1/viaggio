package com.example.viaggio.cadastro_user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.viaggio.R

class FragmentCadastroUserFirstStep : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cadastro_user_first_step, container, false)
        val buttonNext = view.findViewById<Button>(R.id.btnCadastrarGoToSecondStep)
        val buttonReturn = view.findViewById<Button>(R.id.buttonCadastroUserWithIconFirstFragment);

        buttonNext.setOnClickListener {
            (activity as CadastroUserContainer).openSecondFragment();
        }

        buttonReturn.setOnClickListener{
            val fragmentManager = super.getChildFragmentManager();
            fragmentManager?.beginTransaction()?.remove(this)?.commit()
        }

        return view
    }
}