package com.example.singleactivity


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_try_again.view.*

class TryAgainFragment : androidx.fragment.app.Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_try_again, container, false)

        view.buttonTryAgain.setOnClickListener {v->
            v.findNavController().navigate(R.id.action_tryAgainFragment_to_playFragment)
        }

        return view
    }


}
