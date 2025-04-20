package com.example.foodorderingapp.Adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderingapp.databinding.PolpularItemBinding

class PopularAdapter(private val items:List<String>,private val price :List<String>,private  val image :List<Int>): RecyclerView.Adapter<PopularAdapter.PopularViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
       return items.size

    }

    override fun onBindViewHolder(holder: PopularViewHolder, position: Int) {
        TODO("Not yet implemented")

        val items = items[position]
        val image = image[position]
        val price = price[position]
        holder.bind(items,price ,image)

    }
    class PopularViewHolder (private  val binding :PolpularItemBinding) : RecyclerView.ViewHolder(binding.root){
        private val imageView  =  binding.imageView2
        fun bind(items: String, price:String,image: Int) {
            binding.txtFoodName.text = items
            binding.txtPrice.text = price
            imageView.setImageResource(image)





        }


    }

}