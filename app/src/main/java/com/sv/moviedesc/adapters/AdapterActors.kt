package com.sv.moviedesc.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

import com.sv.moviedesc.R
import com.sv.moviedesc.data.models.Actor

class AdapterActors : RecyclerView.Adapter<DataViewHolder>() {

    private var actors: List<Actor> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_actors_data, parent, false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.onBind(actors[position])
    }

    override fun getItemCount(): Int = actors.size

    fun bindActors(newActors: List<Actor>) {
        actors = newActors
    }
}

class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object {
        private val imageOption = RequestOptions()
            .placeholder(R.drawable.ic_avatar_placeholder)
            .fallback(R.drawable.ic_avatar_placeholder)
            .circleCrop()
    }

    private val avatar: ImageView = itemView.findViewById(R.id.iv_actor_avatar)
    private val name: TextView = itemView.findViewById(R.id.tv_actor_name)

    fun onBind(actor: Actor) {
        Glide.with(context)
            .load(actor.avatar)
            .apply(imageOption)
            .into(avatar)
        name.text = actor.name
    }
}

private val RecyclerView.ViewHolder.context
    get() = this.itemView.context