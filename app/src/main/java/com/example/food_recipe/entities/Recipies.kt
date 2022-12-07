package com.example.food_recipe.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName= "recipies")
data class Recipies(
    @PrimaryKey(autoGenerate = true)
    var id:Int
):Serializable