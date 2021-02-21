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
import com.sv.moviedesc.data.models.Movie

class AdapterMovies : RecyclerView.Adapter<DataViewHolderMovie>() {

    private var movies: List<Movie> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolderMovie {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_movie, parent, false)
        return DataViewHolderMovie(view)
    }

    override fun onBindViewHolder(holder: DataViewHolderMovie, position: Int) {
        holder.onBind(movies[position])
    }

    override fun getItemCount(): Int = movies.size

    fun bindMovies(newMovies: List<Movie>) {
        movies = newMovies
    }
}

class DataViewHolderMovie(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object {
        private val imageOption = RequestOptions()
            .placeholder(R.drawable.ic_avatar_placeholder)
            .fallback(R.drawable.ic_avatar_placeholder)
            .circleCrop()
    }

    val pg: TextView = itemView.findViewById()
    val avatar: ImageView = itemView.findViewById()
    val genre: TextView = itemView.findViewById()
    val rating: TextView = itemView.findViewById()
    val duration: TextView = itemView.findViewById()

    fun onBind(movie: Movie) {
        Glide.with(context)
            .load(actor.avatar)
            .apply(imageOption)
            .into(avatar)
        name.text = actor.name
    }
}

private val RecyclerView.ViewHolder.context
    get() = this.itemView.context