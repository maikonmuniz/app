package com.example.ctre

import androidx.room.Room

object DatabaseManager {

    private var dbInstance: LMSDatabase

    init {
        val contexto = LMSApplication.getInstance().applicationContext
        dbInstance = Room.databaseBuilder(
                contexto,
                LMSDatabase::class.java,
                "lms.sqllite"
        ).build()
    }

    fun getForumDAO(): ForumDAO{
        return dbInstance.forumDAO()
    }
}