package com.keyvani.countryapi.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import coil.load
import com.keyvani.countryapi.databinding.FragmentDetailBinding
import com.keyvani.countryapi.viewmodel.ViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailFragment : Fragment() {
    //Binding
    private lateinit var binding: FragmentDetailBinding


    //Other
    private val viewModel: ViewModel by viewModels()
    private var ccn3 = ""
    private val args: DetailFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Get data
        ccn3 = args.ccn3
        //Call api
        viewModel.loadCountryDetail(ccn3)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //InitViews
        binding.apply {
            //load data
            viewModel.countryDetail.observe(viewLifecycleOwner) { response ->
                tvCountryName.text = response[0].name?.common.toString()
                tvCapital.text = response[0].capital.toString()
                tvPopulation.text = String.format("%,d", response[0].population)
                imgNormalFlag.load(response[0].flags?.png.toString()) {
                    crossfade(true)
                    crossfade(800)
                }


            }


            //Back
            backImg.setOnClickListener {
                findNavController().navigateUp()
            }


        }
    }


}