package com.example.viewpager2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager2.databinding.FirstfragmentBinding
import com.example.viewpager2.databinding.SecondfragmentBinding

class SecondFragment : Fragment() {
    private lateinit var binding: SecondfragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  SecondfragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
}
