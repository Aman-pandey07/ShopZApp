package com.aman.domain.network

import com.aman.domain.models.Product
import java.lang.Exception

interface NetworkService {
    suspend fun getProducts(): ResultWrapper<List<Product>>
}

sealed class ResultWrapper<out T>{
    data class Success<out T>(val value: T): ResultWrapper<T>()
    data class Failure(val exception: Exception) : ResultWrapper<Nothing>()
}