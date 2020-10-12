package com.example.ctre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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
            var intent = Intent(this, activityCadastro::class.java)
            startActivity(intent)
        }



        else if (id == R.id.action_config){
            var intent = Intent(this, ConfiguracaoActivity::class.java)
            startActivity(intent)
        }

        else if (id  == R.id.action_sair){
            finish()
        }

        return super.onOptionsItemSelected(item)
    }

}
