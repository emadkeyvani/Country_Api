package com.keyvani.countryapi.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.keyvani.countryapi.databinding.FragmentSearchBinding
import com.keyvani.countryapi.adapter.HomeAdapter
import com.keyvani.countryapi.viewmodel.ViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SearchFragment : Fragment() {
    //Binding
    private lateinit var binding: FragmentSearchBinding

    @Inject
    lateinit var searchAdapter: HomeAdapter

    //Others
    private val viewModel: ViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //InitViews
        binding.apply {
            edtSearch.addTextChangedListener {
                val search = it.toString()
                if (search.isNotEmpty()) {
                    viewModel.loadSearchCountry(search)
                }
            }
            // Get countries list
            viewModel.searchCountry.observe(viewLifecycleOwner) {
                searchAdapter.differ.submitList(it)
                //Recycler
                rvSearchedCountry.apply {
                    layoutManager = LinearLayoutManager(context)
                    adapter = searchAdapter
                }
            }
            //Click
            searchAdapter.setonItemClickListener {
                val direction = SearchFragmentDirections.actionToDetail(it.ccn3.toString())
                findNavController().navigate(direction)
            }

            //Loading
            viewModel.loading.observe(viewLifecycleOwner) {
                if (it) {
                    pbSearch.visibility = View.VISIBLE
                } else {
                    pbSearch.visibility = View.GONE

                }
            }
            //Empty items
            viewModel.empty.observe(viewLifecycleOwner) {
                if (it) {
                    conEmptyLayout.visibility = View.VISIBLE
                    rvSearchedCountry.visibility = View.GONE
                } else {
                    conEmptyLayout.visibility = View.GONE
                    rvSearchedCountry.visibility = View.VISIBLE
                }
            }

        }

    }
}

