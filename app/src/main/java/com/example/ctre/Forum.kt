package com.example.ctre

import java.io.Serializable

class Forum: Serializable {
    var id: Long = 0
    var nome = ""
    var lider = ""
    var diretor = ""
    var foto = ""

    override fun toString(): String {
        return "Forúm(nome=$nome)"
    }
}