package com.aman.data.di

import com.aman.data.repository.ProductRepositoryImpl
import com.aman.domain.repository.ProductRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<ProductRepository> { ProductRepositoryImpl(get()) }
}