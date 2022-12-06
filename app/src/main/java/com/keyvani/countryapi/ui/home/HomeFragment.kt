package com.keyvani.countryapi.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.keyvani.countryapi.adapter.HomeAdapter
import com.keyvani.countryapi.databinding.FragmentHomeBinding
import com.keyvani.countryapi.viewmodel.ViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {
    //Binding
    private lateinit var binding: FragmentHomeBinding

    @Inject
    lateinit var homeAdapter: HomeAdapter

    //Others
    private val viewModel: ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Api call
        viewModel.loadCountriesList()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //InitViews
        binding.apply {
            //Get Countries
            viewModel.countriesList.observe(viewLifecycleOwner) {
                homeAdapter.differ.submitList(it)
                //Recycler
                rvCountriesList.apply {
                    layoutManager = LinearLayoutManager(context)
                    adapter = homeAdapter
                }
            }
            viewModel.loading.observe(viewLifecycleOwner) {
                if (it) {
                    pbCountries.visibility = View.VISIBLE
                    rvCountriesList.visibility = View.GONE
                } else {
                    pbCountries.visibility = View.GONE
                    rvCountriesList.visibility = View.VISIBLE

                }
            }

            //Click
            homeAdapter.setonItemClickListener {
                val direction = HomeFragmentDirections.actionToDetail(it.ccn3.toString())
                findNavController().navigate(direction)
            }


        }
    }
}