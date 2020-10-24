package com.example.ctre

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ForumDAO {

    @Query("SELECT * FROM forum where id=:id")
    fun getById(id: Long): Forum?

    @Query("SELECT * FROM forum")
    fun findAll(): List<Forum>

    @Insert
    fun insert(forum: Forum)

    @Delete
    fun delete(forum: Forum)

}