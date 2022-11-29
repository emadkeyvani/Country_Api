package com.keyvani.countryapi.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.keyvani.countryapi.databinding.ItemHomeCountryListBinding
import com.keyvani.countryapi.response.ResponseCountries.ResponseCountriesItem
import javax.inject.Inject

class CountriesAdapter @Inject constructor() : RecyclerView.Adapter<CountriesAdapter.ViewHolder>() {
    //Binding
    private lateinit var binding: ItemHomeCountryListBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemHomeCountryListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(differ.currentList[position])
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    inner class ViewHolder : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(item: ResponseCountriesItem) {
            binding.apply {
                tvCountryName.text = item.name?.common
                tvCapital.text = item.capital.toString()
                tvCountryLanguage.text = item.languages.toString()
                ivFlag.load(item.flags?.png.toString()) {
                    crossfade(true)
                    crossfade(800)
                }
            }
        }

    }

    private val differCallback = object : DiffUtil.ItemCallback<ResponseCountriesItem>() {
        override fun areItemsTheSame(oldItem: ResponseCountriesItem, newItem: ResponseCountriesItem): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: ResponseCountriesItem, newItem: ResponseCountriesItem): Boolean {
            return oldItem == newItem
        }

    }
    val differ = AsyncListDiffer(this, differCallback)


}