package com.example.rocketapp.managers


import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url


interface ServiceEndpoints {
     @GET("rockets")
    fun rocketsGet(): Call<String>

    @GET("rockets/{input}")
    fun oneRocket(@Path("input")  input : String): Call<String>

}