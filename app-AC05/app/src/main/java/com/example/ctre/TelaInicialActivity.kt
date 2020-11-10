package com.example.ctre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem

class TelaInicialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telainicial)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item?.itemId

        if(id == android.R.id.home){
            finish()

        }
        return super.onOptionsItemSelected(item)
    }
}