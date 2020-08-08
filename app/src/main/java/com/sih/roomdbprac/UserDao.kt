package com.sih.roomdbprac

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface UserDao {

   @Insert
   suspend fun insert(user: User)

   @Insert
   fun insertAll(list: List<User>)

   @Delete
   fun delete(user: User)

   @Query("SELECT * FROM User")
   suspend fun getAllUser(): List<User>

   @Query("SELECT * FROM User WHERE age >= :age")
   fun getUserAge(age:Int):List<User>

}