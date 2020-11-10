package com.example.ctre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_livro.*
import kotlinx.android.synthetic.main.toolbar.*


class LivroActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_livro)

        this.generic_layout = layoutMenulateral

        setSupportActionBar(toolbar_view)
        supportActionBar?.title = "Livros"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        configuraMenuLateral()
    }

}