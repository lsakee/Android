package com.example.viewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager2.databinding.FirstfragmentBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FirstfragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FirstfragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}
