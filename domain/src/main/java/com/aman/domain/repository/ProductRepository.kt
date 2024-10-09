package com.aman.domain.repository

import com.aman.domain.models.Product
import com.aman.domain.network.ResultWrapper

interface ProductRepository {
    suspend fun getProducts(): ResultWrapper<List<Product>>
}