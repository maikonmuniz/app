package com.example.ctre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ListaForumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_forum)
        val forum = intent.getSerializableExtra("forum")
        Toast.makeText(this, "$forum", Toast.LENGTH_LONG).show()
    }
}