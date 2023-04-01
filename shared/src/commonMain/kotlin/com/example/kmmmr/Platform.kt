package com.example.kmmmr

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform