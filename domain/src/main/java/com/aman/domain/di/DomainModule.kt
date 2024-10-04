package com.aman.domain.di

import com.aman.domain.usecase.GetProductUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { GetProductUseCase(get()) }
}