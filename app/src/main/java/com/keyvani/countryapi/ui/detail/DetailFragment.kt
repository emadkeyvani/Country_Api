package com.keyvani.countryapi.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.keyvani.countryapi.R
import com.keyvani.countryapi.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    //Binding
    private lateinit var binding: FragmentDetailBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentDetailBinding.inflate(inflater,container,false)

        return binding.root
    }


}