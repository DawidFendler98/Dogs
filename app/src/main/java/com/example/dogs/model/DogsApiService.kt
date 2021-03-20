package com.example.dogs.model

import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class DogsApiService {

    private val BASE_URL = "https://raw.githubusercontent.com"

    //object that we use to access to backend endpoint // allow us to call and end point and retrieve information
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create()) // convert json to our model using Gson
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create()) // converts a list of our elements ,our object into an observable which in our case is a single
        .build()
        .create(DogsApi::class.java)

    fun getDogs(): Single<List<DogBreed>>{
        return  api.getDogs()
    }
}