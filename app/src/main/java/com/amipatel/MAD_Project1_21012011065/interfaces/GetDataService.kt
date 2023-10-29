package com.amipatel.MAD_Project1_21012011065.interfaces

import com.amipatel.MAD_Project1_21012011065.entities.Category
import com.amipatel.MAD_Project1_21012011065.entities.Meal
import com.amipatel.MAD_Project1_21012011065.entities.MealResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {
    @GET("categories.php")
    fun getCategoryList(): Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("c") category: String): Call<Meal>

    @GET("lookup.php")
    fun getSpecificItem(@Query("i") id: String): Call<MealResponse>


}