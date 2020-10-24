package com.example.ctre

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class ForumAdapter(
    val foros: List<Forum>,
    val onClick: (Forum) -> Unit
):RecyclerView.Adapter<ForumAdapter.ForumViewHolder>() {

    class ForumViewHolder(view: View): RecyclerView.ViewHolder(view){
        val cardNome: TextView
        val cardImg: ImageView
        val cardProgress: ProgressBar

        init {
            cardNome = view.findViewById(R.id.cardNome)
            cardImg = view.findViewById(R.id.cardImg)
            cardProgress = view.findViewById(R.id.cardProgress)
        }
    }

    override fun getItemCount() = this.foros.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(
            R.layout.adapter_forum, parent, false)

        val holder = ForumViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: ForumViewHolder, posicao: Int) {
        val context = holder.itemView.context
        val forum = this.foros[posicao]

        holder.cardNome.text = forum.nome
        holder.cardProgress.visibility = View.VISIBLE

        val resources: Resources = context.resources
        val resourceId: Int = resources.getIdentifier(forum.foto, "drawable", context.packageName)
        holder.cardImg.setImageResource(resourceId)

        Picasso.with(context).load(forum.foto).fit().into(holder.cardImg,
        object: com.squareup.picasso.Callback{
            override fun onSuccess() {
                holder.cardProgress.visibility = View.GONE
            }

            override fun onError() {
                holder.cardProgress.visibility = View.GONE
            }
        })

        holder.itemView.setOnClickListener {onClick(forum)}
    }
}