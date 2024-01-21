package com.example.musicapp

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

    @Headers("X-RapidAPI-Key: 24e2505997msh1410424d751b27ap199a1cjsn4ab61644afac",
    "X-RapidAPI-Host:deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query: String):retrofit2.Call<MyData>
}