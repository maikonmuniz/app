package com.example.ctre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.login_activity_main.*

class LoginActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity_main)

        campo_usuario.setText(Prefs.getString("lembrarNome"))
        campo_senha.setText(Prefs.getString("lembrarSenha"))
        checkLembrar.isChecked = Prefs.getBoolean("lembrar")

        botaoLogin.setOnClickListener{
            val valorUsuario = campo_usuario.text.toString()
            val valorSenha = campo_senha.text.toString()

            Prefs.setBoolean("lembrar", checkLembrar.isChecked)
            if(checkLembrar.isChecked){
                Prefs.setString("lembrarNome", valorUsuario)
                Prefs.setString("lembrarSenha", valorSenha)
            }else {
                Prefs.setString("lembrarNome", "")
                Prefs.setString("lembrarSenha", "")
            }

            if(valorUsuario == "aluno" && valorSenha == "impacta") {
                var intent = Intent(this, MainActivity::class.java)
                Toast.makeText(this, "Aluno logado", Toast.LENGTH_LONG).show()
                startActivity(intent)
            }else{
                Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_LONG).show()
            }
        }
    }
}