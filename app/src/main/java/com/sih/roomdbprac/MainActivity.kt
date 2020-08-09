package com.sih.roomdbprac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*

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

        btnSave.setOnClickListener {
            GlobalScope.launch(Dispatchers.IO) {  db.userDao().insert(User("Pulkit Bhaiya", "Bhubaneswar", "834841681628", 20)) }
        }


        db.userDao().getAllUser().observe(this, Observer {list ->
            if(list.isNotEmpty()) {
                with(list[list.size-1]) {
                    tvName.text = name + id
                    tvName.text = address
                    tvName.text = phone
                    tvName.text = age.toString()

                }
            }
        })

        }
    }


