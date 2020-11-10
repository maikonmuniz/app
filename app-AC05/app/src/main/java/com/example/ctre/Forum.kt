package com.example.ctre

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "forum")
class Forum: Serializable {

    @PrimaryKey
    var id: Long = 0
    var nome = ""
    var lider = ""
    var diretor = ""
    var foto = ""

    override fun toString(): String {
        return "$nome"
    }
}