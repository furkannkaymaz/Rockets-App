package com.example.rocketapp.managers



import com.example.rocketapp.model.rocketsmodel

import com.google.gson.Gson

import java.util.*
import kotlin.collections.ArrayList

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS", "NAME_SHADOWING")
class ServiceManager {

    fun Rockets(callbackSuccess: (response: rocketsmodel) -> Unit, callbackFailure: (response: ArrayList<String>) -> Unit)
    {



        val call = ServiceConnector().Run().rocketsGet()
        call.enqueue(callback({ response ->

            response?.body()?.let {

                val plainBody: String = it
                val responseConvert: rocketsmodel = Gson().fromJson(plainBody, rocketsmodel::class.java)

                callbackSuccess(responseConvert)
                return@callback
            }
        },
                { throwable ->
                    throwable?.let {
                        var errors = ArrayList<String>()
                        errors.add(it.localizedMessage)
                        callbackFailure(errors)
                        return@callback
                    }
                }
        ))
    }

    fun oneRocket(rocketName : String, callbackSuccess: (response: rocketsmodel.rocketsmodelItem) -> Unit, callbackFailure: (response: ArrayList<String>) -> Unit)
    {

        val call = ServiceConnector().Run().oneRocket(rocketName)
        call.enqueue(callback({ response ->

            response?.body()?.let {
                val plainBody: String = it
                val responseConvert: rocketsmodel.rocketsmodelItem = Gson().fromJson(plainBody, rocketsmodel.rocketsmodelItem::class.java)
                callbackSuccess(responseConvert)
                return@callback
            }
        },
                { throwable ->
                    throwable?.let {
                        var errors = ArrayList<String>()
                        errors.add(it.localizedMessage)
                        callbackFailure(errors)
                        return@callback
                    }
                }
        ))
    }


}
