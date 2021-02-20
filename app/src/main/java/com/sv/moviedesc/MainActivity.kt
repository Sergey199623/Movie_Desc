package com.sv.moviedesc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import com.sv.moviedesc.activities.MovieDetailsActivity
import com.sv.moviedesc.fragments.FragmentMoviesList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val tvMove : TextView = findViewById(R.id.tvMoveToMovie)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .addToBackStack(null)
                .replace(R.id.fragment_container_view, FragmentMoviesList())
                .commit()
        }

//        tvMove.setOnClickListener { moveToMovieDesc() }
    }

    private fun moveToMovieDesc() {
        val intent = Intent (this, MovieDetailsActivity::class.java)
        startActivity(intent)
    }


}