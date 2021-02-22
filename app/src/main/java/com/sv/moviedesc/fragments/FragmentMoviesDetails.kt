package com.sv.moviedesc.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

import com.sv.moviedesc.R
import com.sv.moviedesc.adapters.AdapterActors
import com.sv.moviedesc.adapters.AdapterMovies
import com.sv.moviedesc.source.ActorsDataSource
import com.sv.moviedesc.source.MovieDataSource

class FragmentMoviesDetails : Fragment() {

    private lateinit var adapter: AdapterMovies

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movies_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val recycler: RecyclerView = view.findViewById(R.id.rv_actors)
        adapter = AdapterMovies()
        recycler.adapter = adapter
    }

    override fun onStart() {
        super.onStart()
        updateData()
    }

    private fun updateData() {
        adapter.bindMovies(MovieDataSource().getActors())
        adapter.notifyDataSetChanged()
    }
}