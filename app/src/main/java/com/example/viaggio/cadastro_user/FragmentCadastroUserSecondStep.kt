package com.example.viaggio.cadastro_user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.viaggio.R

class FragmentCadastroUserSecondStep : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_cadastro_user_second_step, container, false)

        val checkBox = view.findViewById<CheckBox>(R.id.checkboxConcordo)
        val textView = view.findViewById<TextView>(R.id.labelConcordo)

        val buttonReturn = view.findViewById<Button>(R.id.buttonWithIconSecondUserFragment);

        textView.setOnClickListener {
            checkBox.isChecked = !checkBox.isChecked
        }

        buttonReturn.setOnClickListener{
            (activity as CadastroUserContainer).openFirstFragment();
        }

        return view
    }
}