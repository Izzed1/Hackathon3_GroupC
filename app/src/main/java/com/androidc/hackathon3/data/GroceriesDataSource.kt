package com.androidc.hackathon3.data

import com.androidc.hackathon3.model.Product

interface GroceriesDataSource {
    fun getPlanets(): List<Product>
}