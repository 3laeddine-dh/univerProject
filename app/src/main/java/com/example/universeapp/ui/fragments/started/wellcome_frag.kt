package com.example.universeapp.ui.fragments.started

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.universeapp.R

class wellcome_frag : Fragment(R.layout.activity_welcome) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.btn_welcome_to_signin).setOnClickListener {
            findNavController().navigate(R.id.action_wellcome_frag_to_signin_frag)
        }
        view.findViewById<TextView>(R.id.btn_join_university).setOnClickListener {
            findNavController().navigate(R.id.action_wellcome_frag_to_universityJoin_frag)
        }
        view.findViewById<Button>(R.id.btn_join_member).setOnClickListener {
            findNavController().navigate(R.id.action_wellcome_frag_to_memberJoin_frag)
        }

    }


}