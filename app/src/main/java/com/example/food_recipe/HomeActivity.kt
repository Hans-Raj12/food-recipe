package com.example.food_recipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.food_recipe.adapter.MainCategoryAdapter
import com.example.food_recipe.adapter.SubCategoryAdapter
import com.example.food_recipe.entities.Recipies
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_splash.*

class HomeActivity : AppCompatActivity() {
    var arrMainCategory = ArrayList<Recipies>()
    var arrSubCategory = ArrayList<Recipies>()
    var mainCategoryAdapter = MainCategoryAdapter()
    var subCategoryAdapter = SubCategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //temp data
        arrMainCategory.add(Recipies(1,"Beef"))
        arrMainCategory.add(Recipies(2,"Mutton"))
        arrMainCategory.add(Recipies(3,"chicken"))
        arrMainCategory.add(Recipies(4,"Lamb"))

        mainCategoryAdapter.setData(arrMainCategory)

        arrSubCategory.add(Recipies(1,"Beef and mustard pie"))
        arrSubCategory.add(Recipies(2,"Mutton and mushrooom"))
        arrSubCategory.add(Recipies(3,"chicken and mushroon hot"))
        arrSubCategory.add(Recipies(4,"Lamb"))

        subCategoryAdapter.setData(arrSubCategory)

        rv_main_category.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        rv_main_category.adapter = mainCategoryAdapter

        rv_sub_category.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_sub_category.adapter = subCategoryAdapter
    }

}