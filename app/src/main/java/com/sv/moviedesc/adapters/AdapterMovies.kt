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

    val pg: TextView = itemView.findViewById(R.id.tv_pg)
    val avatar: ImageView = itemView.findViewById(R.id.iv_avatar_film)
    val genre: TextView = itemView.findViewById(R.id.tv_genre)
    val rating: TextView = itemView.findViewById(R.id.tv_rating)
    val name: TextView = itemView.findViewById(R.id.tv_name)
    val duration: TextView = itemView.findViewById(R.id.tv_duration)

    fun onBind(movie: Movie) {
        Glide.with(context)
            .load(movie.avatar)
            .apply(imageOption)
            .into(avatar)
        pg.text = movie.pg
        genre.text = movie.genre
        rating.text = movie.rating
        name.text = movie.name
        duration.text = movie.duration
    }
}

private val RecyclerView.ViewHolder.context
    get() = this.itemView.context