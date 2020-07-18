package com.example.singleactivity.ui.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.singleactivity.R
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        view.nextButton.setOnClickListener { v ->
            v.findNavController().navigate(R.id.action_homeFragment_to_playFragment)
        }
        return view
    }


}
