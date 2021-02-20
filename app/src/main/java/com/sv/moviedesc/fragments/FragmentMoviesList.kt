package com.sv.moviedesc.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView

import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController


import com.sv.moviedesc.R

class FragmentMoviesList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movies_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val moveToFilm = view.findViewById<ImageButton>(R.id.ivFilm1)
        moveToFilm?.setOnClickListener {
            findNavController().navigate(R.id.fragmentMoviesDetails)
        }
//
//        view.findViewById<ImageButton>(R.id.ivFilm1)?.setOnClickListener {
//            findNavController().navigate(R.id.fragmentMoviesDetails, null)
//        }

//        view.findViewById<ImageButton>(R.id.ivFilm1)?.setOnClickListener(
//                Navigation.createNavigateOnClickListener(R.id.next_action, null)
//        )
    }
}