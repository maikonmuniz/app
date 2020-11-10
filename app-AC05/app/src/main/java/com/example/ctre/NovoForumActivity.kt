package com.example.ctre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_novo_forum.*

class NovoForumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo_forum)

        botaoSalvar.setOnClickListener {
            val d = Forum()
            d.nome = nomeForum.text.toString()
            d.lider = lider.text.toString()
            d.foto = foto.text.toString()
            d.diretor = diretor.text.toString()
            Thread{
                ForumService.saveForum(d)
                runOnUiThread{
                    finish()
                }
            }.start()
        }
    }
}