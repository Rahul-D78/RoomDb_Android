package com.sih.roomdbprac

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class Database: RoomDatabase() {
    //If you have multiple daos you have to declare them here
    abstract fun userDao():UserDao
}