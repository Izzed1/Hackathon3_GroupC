package com.androidc.hackathon3.model

import java.util.UUID

data class Product(
    val id: String = UUID.randomUUID().toString(),
    val position : Int,
    val name: String,
    val price: Int,
    val weight: Int,
    val supplierName: String,
    val rating: Double,
    val desc: String,
    val imgUrl: String,
)
