package com.aman.data.repository

import com.aman.domain.models.Product
import com.aman.domain.network.NetworkService
import com.aman.domain.network.ResultWrapper
import com.aman.domain.repository.ProductRepository

class ProductRepositoryImpl(private val networkService: NetworkService):ProductRepository {
    override suspend fun getProducts(): ResultWrapper<List<Product>> {
        return networkService.getProducts()
    }
}