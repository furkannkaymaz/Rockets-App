package com.example.rocketapp.managers

import okhttp3.*
import okio.Buffer
import java.io.IOException
import kotlin.jvm.Throws


class ServiceWrapper : Interceptor {

    @Throws(IOException::class, OutOfMemoryError::class)
    override fun intercept(chain: Interceptor.Chain): Response {

       val requestOrginal = chain.request()


        val builder = requestOrginal.newBuilder()

        if(requestOrginal.url().url().toString().contains("/uploadprofilephoto"))
        {
            builder.addHeader("Content-Type", "application/x-www-form-urlencoded; charset=utf-8")
            builder.method(requestOrginal.method(), requestOrginal.body())
        }


        return chain.proceed(builder.build())
    }


}
