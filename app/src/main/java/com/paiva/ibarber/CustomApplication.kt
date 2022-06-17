package com.paiva.ibarber

import android.app.Application
import com.paiva.ibarber.di.useCase
import com.paiva.ibarber.di.viewModel
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class CustomApplication: Application() {
    
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@CustomApplication)
            modules(listOf(
                useCase, viewModel))
        }
    }
}