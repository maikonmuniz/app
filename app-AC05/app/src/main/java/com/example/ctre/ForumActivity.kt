package com.example.ctre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_forum.*
import kotlinx.android.synthetic.main.toolbar.*

class ForumActivity : DebugActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forum)

        this.generic_layout = layoutMenulateral

        setSupportActionBar(toolbar_view)
        supportActionBar?.title = "Forum"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        configuraMenuLateral()

        recyclerForum?.layoutManager = LinearLayoutManager(this)
        recyclerForum?.itemAnimator = DefaultItemAnimator()
        recyclerForum?.setHasFixedSize(true)
    }

    override fun onResume() {
        super.onResume()
        taskForum()
    }

    var forum = listOf<Forum>()

    fun taskForum(){
        Thread {
            this.forum = ForumService.getForum()
            runOnUiThread {
                recyclerForum?.adapter = ForumAdapter(this.forum) { onclickForum(it) }

                enviaNotificacao(this.forum[0])
            }
        }.start()
    }

    fun enviaNotificacao(forum: Forum){
        val intent = Intent(this, ForumActivity::class.java)
        intent.putExtra("forum", forum)

        NotificationUtil.create(1, intent, "Ctre", "Você é aluno no ${forum.nome}")
    }

    fun onclickForum(forum: Forum){

        val it = Intent(this, ListaForumActivity::class.java)
        it.putExtra("forum", forum)
        startActivity(it)
    }
}