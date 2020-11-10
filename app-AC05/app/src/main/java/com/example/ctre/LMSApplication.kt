package com.example.ctre

import android.app.Application
import java.lang.IllegalStateException

class LMSApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }

    companion object {
        private var appInstance: LMSApplication? = null
        fun getInstance(): LMSApplication {
            if(appInstance == null){
                throw IllegalStateException("Configure application no manifest")
            }
            return appInstance!!
        }
    }
}