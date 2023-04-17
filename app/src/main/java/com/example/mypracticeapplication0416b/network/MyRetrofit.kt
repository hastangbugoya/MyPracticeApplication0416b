package com.example.mypracticeapplication0416b.network

import com.example.mypracticeapplication0416b.data.Bitcoin
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class MyRetrofit {
    companion object{
        fun MakeRetrofit() : Retrofit = Retrofit.Builder()
            .baseUrl("https://api.coinpaprika.com/")
            .addConverterFactory(GsonConverterFactory.create()).build()

        fun getService() : RetrofitService = MakeRetrofit()
            .create(RetrofitService::class.java)
    }
}


interface RetrofitService {

    @GET("v1/ticker")
    suspend fun getAllCoins() : Response<Bitcoin>

}