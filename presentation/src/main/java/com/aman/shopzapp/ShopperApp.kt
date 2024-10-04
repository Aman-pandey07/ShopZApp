package com.aman.shopzapp

import android.app.Application
import com.aman.data.di.dataModule
import com.aman.domain.di.domainModule
import com.aman.shopzapp.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class ShopperApp : Application(){
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ShopperApp)
            modules(listOf(
                presentationModule,
                dataModule,
                domainModule
            ))
        }
    }
}