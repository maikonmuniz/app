package com.example.ctre

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

open class MainActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.generic_layout = layoutMenulateral

        setSupportActionBar(toolbar_view)
        configuraMenuLateral()

        button_sis.setOnClickListener{

            var intent = Intent(this, CursoActivity::class.java)
            var titleCursos = Bundle()
            titleCursos.putString("title", "Sistema da informação")
            intent.putExtras(titleCursos)
            startActivity(intent)

        }

        ccDisciplina.setOnClickListener{

            var intent = Intent(this, CursoActivity::class.java)
            var titleCursos = Bundle()
            titleCursos.putString("title", "Ciência da Computação")
            intent.putExtras(titleCursos)
            startActivity(intent)

        }
        button_eng.setOnClickListener{

            var intent = Intent(this, CursoActivity::class.java)
            var titleCursos = Bundle()
            titleCursos.putString("title", "Engenharia da Computação")
            intent.putExtras(titleCursos)
            startActivity(intent)

            }

        }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId

        if (id == R.id.action_adicionar){
            var intent = Intent(this, TelaInicialActivity::class.java)
            startActivity(intent)
        }

        else if (id == R.id.action_config){
            var intent = Intent(this, ConfiguracaoActivity::class.java)
            startActivity(intent)
        }

        else if (id  == R.id.action_sair){
            finish()
        }

        else if (id == R.id.action_nova){
            val intent = Intent(this, NovoForumActivity::class.java)
            startActivity(intent)
        }

        return super.onOptionsItemSelected(item)
    }

}
