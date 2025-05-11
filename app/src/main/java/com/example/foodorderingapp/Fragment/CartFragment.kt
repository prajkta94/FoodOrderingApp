package com.example.foodorderingapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.foodorderingapp.Adapter.CartAdapter
import com.example.foodorderingapp.R
import com.example.foodorderingapp.databinding.CartItemBinding
import com.example.foodorderingapp.databinding.FragmentCartBinding
import com.example.foodorderingapp.databinding.FragmentHomeBinding


class CartFragment : Fragment() {

    private lateinit var binding: FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentCartBinding.inflate(inflater,container,false)




        val cartItemList = listOf("Burger","Sandwich","Pizza","Momo","Wrap")
        val cartPriceList = listOf("$3","$3","$3","$3","$3")
        val cartImaelList = listOf(R.drawable.burger,
            R.drawable.burger,R.drawable.burger,
            R.drawable.burger,R.drawable.burger,
            )

        val adapter =CartAdapter(ArrayList(cartItemList),ArrayList(cartPriceList),ArrayList(cartImaelList))
        binding.rvCartView.layoutManager = LinearLayoutManager(requireContext())
        binding.rvCartView.adapter=adapter


        return binding.root    }

    companion object {


    }
}