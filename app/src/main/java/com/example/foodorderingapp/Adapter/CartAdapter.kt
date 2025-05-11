package com.example.foodorderingapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderingapp.databinding.CartItemBinding

class CartAdapter(
    private val cartItems: MutableList<String>,
    private val cartItemsPrice: MutableList<String>,
    private val cartItemImages: MutableList<Int>
) : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    private val itemQuantites = IntArray(cartItems.size) { 1 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = cartItems.size

    inner class CartViewHolder(private val binding: CartItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                txtItemName.text = cartItems[position]
                txtItemPrice.text = cartItemsPrice[position]
                imgItem.setImageResource(cartItemImages[position])
                txtQantity.text = itemQuantites[position].toString()

                imgIn.setOnClickListener(){
                   decreaseQuantity(position)
                }

                imgDe.setOnClickListener(){
                   increaseQuantity(position)
                }

                imgDelete.setOnClickListener(){
                    val itemPosition = adapterPosition
                    if(itemPosition != RecyclerView.NO_POSITION){
                        deleteItem(itemPosition)

                    }

                }
            }
        }



    fun increaseQuantity(position: Int){
        if(itemQuantites[position]<10){
            itemQuantites[position]++
            binding.txtQantity.text=itemQuantites[position].toString()
        }
    }

    fun deleteItem(position: Int){
        cartItems.removeAt(position)
        cartItemsPrice.removeAt(position)
        cartItemImages.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position,cartItems.size)
    }

        fun decreaseQuantity(position: Int){
            if(itemQuantites[position]>1){
                itemQuantites[position]--
                binding.txtQantity.text=itemQuantites[position].toString()
            }
        }







}
}
