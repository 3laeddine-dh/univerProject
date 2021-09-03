package com.example.universeapp.ui.fragments.started

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.MainThread
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.universeapp.R
import com.example.universeapp.ui.MainActivity

class signin_frag : Fragment(R.layout.activity_signin) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.btn_signin_to_home).setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_signin_frag_to_main_nav)
        }

        view.findViewById<TextView>(R.id.forget_password_btn).setOnClickListener{
             Navigation.findNavController(view).navigate(R.id.action_signin_frag_to_resetEmail_frag)
        }

        view.findViewById<ImageButton>(R.id.back_btn_signin).setOnClickListener{
            Navigation.findNavController(view).popBackStack()
        }



    }

}