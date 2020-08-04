package com.sih.roomdbprac

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
 val name: Int,
 val address: String,
 val phone: Int,
 val age: String,
 @PrimaryKey(autoGenerate = true)
 val id:Long = 0L
)

//Dao --> Data Access Object