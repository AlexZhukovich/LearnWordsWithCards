package com.alexzh.learnwordswithcards

import android.app.Application
import com.alexzh.learnwordswithcards.di.dataModule
import com.alexzh.learnwordswithcards.di.favouritesModule
import com.alexzh.learnwordswithcards.di.trainingsModule
import com.alexzh.learnwordswithcards.di.wordsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        initDI()
    }

    private fun initDI() {
        startKoin {
            androidContext(this@App)
            androidLogger(Level.ERROR)
            modules(
                listOf(
                    dataModule,
                    wordsModule,
                    favouritesModule,
                    trainingsModule
                )
            )
        }
    }
}