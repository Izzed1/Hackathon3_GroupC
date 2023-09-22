package com.androidc.hackathon3.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidc.hackathon3.R
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    private lateinit var categoryAdapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val recyclerView: RecyclerView = findViewById(R.id.rv_Category)

        val categories = generateCategoryList()

        categoryAdapter = CategoryAdapter(this, categories)

        recyclerView.adapter = categoryAdapter

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager
    }

    private fun generateCategoryList(): List<CategoryItem> {
        val categoryList = ArrayList<CategoryItem>()
        categoryList.add(CategoryItem("Groceries", R.drawable.ic_category_groceries))
        categoryList.add(CategoryItem("Fruit", R.drawable.ic_category_fruits))
        categoryList.add(CategoryItem("Spices", R.drawable.ic_category_spices))
        categoryList.add(CategoryItem("Herbs", R.drawable.ic_category_herbs))
        categoryList.add(CategoryItem("Seasoning", R.drawable.ic_category_seasoning))
        categoryList.add(CategoryItem("Meat", R.drawable.ic_category_meat))
        return categoryList
    }
}