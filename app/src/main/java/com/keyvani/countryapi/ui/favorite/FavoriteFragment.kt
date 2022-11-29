package com.keyvani.countryapi.ui.favorite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.keyvani.countryapi.R
import com.keyvani.countryapi.databinding.FragmentDetailBinding
import com.keyvani.countryapi.databinding.FragmentFavoriteBinding


class FavoriteFragment : Fragment() {
    //Binding
    private lateinit var binding: FragmentFavoriteBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View {
        binding = FragmentFavoriteBinding.inflate(inflater,container,false)

        return binding.root
    }
}