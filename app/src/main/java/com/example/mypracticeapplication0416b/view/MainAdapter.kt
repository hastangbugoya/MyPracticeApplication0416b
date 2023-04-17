package com.example.mypracticeapplication0416b.view

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mypracticeapplication0416b.data.BitcoinItem
import com.example.mypracticeapplication0416b.databinding.ItemCardBinding

class MainAdapter: RecyclerView.Adapter<MainAdapter.BitCoinViewholder>() {

    private var myList = ArrayList<BitcoinItem>()

    class BitCoinViewholder(var binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BitCoinViewholder {
        val binding = ItemCardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BitCoinViewholder(binding)
    }

    override fun onBindViewHolder(holder: BitCoinViewholder, position: Int) {
        holder.binding.apply {
            topText.text = myList?.get(position)?.name ?: "none"
            secondText.text = myList?.get(position)?.priceUsd ?: "none"
        }
    }

    override fun getItemCount(): Int = myList.size

    fun setData(newList : ArrayList<BitcoinItem>){
        myList = newList
        notifyDataSetChanged()
    }
}