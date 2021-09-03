package com.example.universeapp.ui.fragments.started

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.universeapp.R

class memberJoin_frag : Fragment(R.layout.activity_member_join) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageButton>(R.id.back_btn_join_member_to_signin).setOnClickListener{
            Navigation.findNavController(view).popBackStack()
        }

    }

}