package com.example.food_recipe.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.food_recipe.entities.Recipies

@Dao
interface RecipeDao
{
    @get:Query("SELECT * FROM recipies ORDER BY id DESC")
    val allRecipes:List<Recipies>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertRecipe(recipies:Recipies)
}