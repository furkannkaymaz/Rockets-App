package com.example.rocketapp.managers

import com.ddtech.ddverifier.managers.Globals
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit


class ServiceConnector {
    val serviceWrapper: ServiceWrapper = ServiceWrapper()

    val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    val httpBuilder = OkHttpClient.Builder()
    .connectTimeout(60, TimeUnit.SECONDS)
    .readTimeout(60, TimeUnit.SECONDS)
    .writeTimeout(60, TimeUnit.SECONDS)
    .addInterceptor(interceptor)
    .addInterceptor(serviceWrapper)
    var mClient = httpBuilder.build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(Globals.shared.BaseWebservice)
        .addConverterFactory(ScalarsConverterFactory.create())
        .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
        .client(mClient)
        .build()

    fun Run() = retrofit.create(ServiceEndpoints::class.java)
}