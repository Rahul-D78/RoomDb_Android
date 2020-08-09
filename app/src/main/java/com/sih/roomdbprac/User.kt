package com.sih.roomdbprac

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
 val name: String,
 val address: String,
 val phone: String,
 val age: Int,
 @PrimaryKey(autoGenerate = true)
 val id:Long = 0L
)

//Dao --> Data Access Object