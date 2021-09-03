package com.example.universeapp.ui.fragments.started

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.universeapp.R

class resetEmail_frag : Fragment(R.layout.activity_reset_email) {

    //
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.back_btn_resetEmail_to_signin).setOnClickListener{
            Navigation.findNavController(view).popBackStack()
        }

    }


}