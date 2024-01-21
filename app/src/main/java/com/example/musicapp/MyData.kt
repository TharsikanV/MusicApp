package com.example.musicapp

data class MyData(
//    https://rapidapi.com/deezerdevs/api/deezer-1
    val `data`: List<Data>,
    val next: String,
    val total: Int
)