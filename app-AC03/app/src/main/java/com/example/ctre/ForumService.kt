package com.example.ctre

object ForumService {
    fun getForum() : List<Forum>{
        val foros = mutableListOf<Forum>()

        for (i in 1..10){
            val d = Forum()
            d.nome = "Forum $i"
            d.lider = "Lider $i"
            d.diretor = "Diretor $i"
            d.foto = "https://www.hojemais.com.br/imagem/noticia/1000/1000/1548511734_80567.jpeg"
            foros.add(d)
        }

        return foros
    }
}