package com.keyvani.countryapi.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.keyvani.countryapi.databinding.ItemHomeCountryListBinding
import com.keyvani.countryapi.response.ResponseCountries.ResponseCountriesItem
import javax.inject.Inject

class HomeAdapter @Inject constructor() : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {
    //Binding
    private lateinit var binding: ItemHomeCountryListBinding


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = ItemHomeCountryListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(differ.currentList[position])
        holder.setIsRecyclable(false)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    inner class ViewHolder : RecyclerView.ViewHolder(binding.root) {
        fun bindItems(item: ResponseCountriesItem) {
            binding.apply {
                tvCountryName.text = item.name?.common
                tvCapital.text = item.capital.toString()
                ivFlag.load(item.flags?.png.toString()) {
                    crossfade(true)
                    crossfade(800)
                }
                //Click
                root.setOnClickListener {
                    onItemClickListener?.let {
                        it(item)
                    }
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


    private var onItemClickListener: ((ResponseCountriesItem) -> Unit)? = null

    fun setonItemClickListener(listener: (ResponseCountriesItem) -> Unit) {
        onItemClickListener = listener
    }

}