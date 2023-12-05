package com.example.roomdatabase

import android.app.Application
import com.example.roomdatabase.repositori.ContainerApp

class AplikasiSiswa : Application() {
    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = ContainerDataApp(this)
    }
}