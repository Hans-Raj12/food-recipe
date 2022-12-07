package com.example.food_recipe.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.food_recipe.R
import com.example.food_recipe.entities.Recipies
import kotlinx.android.synthetic.main.item_rv_sub_category.view.*

class SubCategoryAdapter: RecyclerView.Adapter<SubCategoryAdapter.RecipeViewHolder>() {

    var arrSubCategory = ArrayList<Recipies>()

    inner class RecipeViewHolder(view:View):RecyclerView.ViewHolder(view){

    }
    fun setData(arrData:List<Recipies>){
        arrSubCategory = arrData as ArrayList<Recipies> /* = java.util.ArrayList<com.example.food_recipe.entities.Recipies> */
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_rv_sub_category,parent,false))
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.itemView.tv_dish_name.text = arrSubCategory[position].dishName
    }

    override fun getItemCount(): Int {
        return arrSubCategory.size
    }
}