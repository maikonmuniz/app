package com.example.ctre

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Forum::class), version = 1)
abstract class LMSDatabase: RoomDatabase() {
    abstract fun forumDAO(): ForumDAO
}