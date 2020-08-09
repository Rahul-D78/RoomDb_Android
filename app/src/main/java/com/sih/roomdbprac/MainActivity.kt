package com.sih.roomdbprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import kotlin.reflect.KProperty

class MainActivity : AppCompatActivity() {

//Now we have to create the object of our database to get some values out of the database

    val db by lazy {
       Room.databaseBuilder(
           this,
            Database::class.java,
           "User.db")
           .allowMainThreadQueries()
           .fallbackToDestructiveMigration()
           .build()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

