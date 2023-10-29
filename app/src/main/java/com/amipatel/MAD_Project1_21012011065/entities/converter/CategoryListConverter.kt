package com.amipatel.MAD_Project1_21012011065.entities.converter

import androidx.room.TypeConverter
import com.amipatel.MAD_Project1_21012011065.entities.CategoryItems
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CategoryListConverter {
    @TypeConverter
    fun fromCategoryList(category: List<CategoryItems>):String?{
        if (category == null){
            return (null)
        }else{
            val gson = Gson()
            val type = object : TypeToken<CategoryItems>(){

            }.type
            return gson.toJson(category,type)
        }
    }

    @TypeConverter
    fun toCategoryList ( categoryString: String):List<CategoryItems>?{
        if (categoryString == null){
            return (null)
        }else{
            val gson = Gson()
            val type = object :TypeToken<CategoryItems>(){

            }.type
            return  gson.fromJson(categoryString,type)
        }
    }
}