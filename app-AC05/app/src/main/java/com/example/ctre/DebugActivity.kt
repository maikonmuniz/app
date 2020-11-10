package com.example.ctre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.navigation_menu.*
import kotlinx.android.synthetic.main.toolbar.*

open class DebugActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    var generic_layout: DrawerLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    protected fun configuraMenuLateral(){
        var toogle = ActionBarDrawerToggle(
            this,
            generic_layout,
            toolbar_view,
            R.string.nav_abrir,
            R.string.nav_fechar
        )

        generic_layout?.addDrawerListener(toogle)
        toogle.syncState()

        menu_lateral.setNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_telainicial ->{
                val it = Intent(this, MainActivity::class.java)
                Toast.makeText(this, "Tela inicial", Toast.LENGTH_SHORT).show()
                startActivity(it)
            }

            R.id.nav_forum ->{
                val it = Intent(this, ForumActivity::class.java)
                Toast.makeText(this, "Forum", Toast.LENGTH_SHORT).show()
                startActivity(it)
            }

            R.id.nav_livros ->{
                val it = Intent(this, LivroActivity::class.java)
                Toast.makeText(this, "Livros cultura", Toast.LENGTH_SHORT).show()
                startActivity(it)
            }

            R.id.nav_localizacao ->{
                Toast.makeText(this, "Localizar foruns", Toast.LENGTH_SHORT).show()
                val it = Intent(this, MapasActivity::class.java)
                startActivity(it)
            }

            R.id.nav_sair ->{
                Toast.makeText(this, "Saiu", Toast.LENGTH_SHORT).show()
                finishAffinity()
            }
        }

        generic_layout?.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}