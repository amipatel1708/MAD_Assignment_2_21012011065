package com.amipatel.MAD_Project1_21012011065.entities

import androidx.room.*
import com.amipatel.MAD_Project1_21012011065.entities.converter.CategoryListConverter
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity(tableName = "Category")
data class Category(
    @PrimaryKey(autoGenerate = true)
    var id:Int,

    @ColumnInfo(name = "categoryItems")
    @Expose
    @SerializedName("categories")
    @TypeConverters(CategoryListConverter::class)
    var categorieitems: List<CategoryItems>? = null
)
