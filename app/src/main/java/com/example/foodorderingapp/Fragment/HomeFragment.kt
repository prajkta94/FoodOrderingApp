package com.example.foodorderingapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.foodorderingapp.Adapter.PopularAdapter
import com.example.foodorderingapp.R
import com.example.foodorderingapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding :FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner2,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner3,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner4,ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner5,ScaleTypes.FIT))

        val imageSilder = binding.imageSlider
        imageSilder.setImageList(imageList)
        imageSilder.setImageList(imageList,ScaleTypes.FIT)

        imageSilder.setItemClickListener(object :ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }
            override fun onItemSelected(position: Int) {

                val imagePosition = imageList[position]
                val itemMessage="Selected Image $position"

                Toast.makeText(requireContext(),itemMessage,Toast.LENGTH_SHORT).show()
            }
        })

        val item = listOf("Burger","sandwich","momo","item1")
        val Price = listOf("$5","$6","$8","$7")
        val image = listOf(R.drawable.banner1,R.drawable.banner4,R.drawable.banner4,R.drawable.banner4)
        val adapter = PopularAdapter(item,Price,image)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter=adapter




    }

    companion object {

    }
}