package com.example.expmdmfebrero.app

import android.app.Application
import com.example.expmdmfebrero.app.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class ExPMDMFebreroApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ExPMDMFebreroApp)
            modules(appModule)
        }
    }
}