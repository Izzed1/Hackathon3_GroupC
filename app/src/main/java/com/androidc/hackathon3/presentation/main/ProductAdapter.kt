package com.androidc.hackathon3.presentation.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.androidc.hackathon3.R
import com.androidc.hackathon3.databinding.ItemListProductBinding
import com.androidc.hackathon3.model.Product
import com.bumptech.glide.Glide


class ProductAdapter (private val product: ArrayList<Product>):RecyclerView.Adapter<ProductAdapter.ViewHolder>(){
    class ViewHolder(var binding: ItemListProductBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(product: Product){
            Glide.with(itemView).load(product.imgUrl).into(binding.ivMenu)
            binding.tvNamaMakanan.text= product.name
            binding.tvPriceFood.text= product.price.toString()
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListProductBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val productItem = product[position]
        holder.bind(productItem)

        holder.binding.ivMenu.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("namaMenu", productItem.name)
            bundle.putString("hargaMenu", productItem.price.toString())
            bundle.putDouble("rating", productItem.rating)
            bundle.putString("gambar", productItem.imgUrl)
        }
    }


    override fun getItemCount(): Int {
        return product.size
    }

}