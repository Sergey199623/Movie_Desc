package com.sv.moviedesc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.sv.moviedesc.activities.MovieDetailsActivity
import com.sv.moviedesc.fragments.FragmentMoviesList


class MainActivity : AppCompatActivity() {

    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        val tvMove : TextView = findViewById(R.id.tvMoveToMovie)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.nav_host_fragment, FragmentMoviesList())
                .commit()
        }

//        tvMove.setOnClickListener { moveToMovieDesc() }
    }

    fun onFragment1NextClick() {
        navController.navigate(R.id.fragmentMoviesDetails)
    }

    fun onFragment1BackClick() {}


    fun onFragment2NextClick() {
//        navController.navigate(R.id.fragment3)
    }

    fun onFragment2BackClick() {
        navController.popBackStack()
    }
}