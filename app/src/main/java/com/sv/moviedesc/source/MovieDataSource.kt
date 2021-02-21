package com.sv.moviedesc.source

import com.sv.moviedesc.data.models.Movie


class MovieDataSource {
    fun getActors(): List<Movie> {
        return listOf(
            Movie("Robert Downey Jr.", "https://image.ibb.co/j142xJ/Amanda_Seyfried.jpg"),
            Movie("Chris Evans", "https://image.ibb.co/j142xJ/Amanda_Seyfried.jpg"),
            Movie("Mark Ruffalo", "https://image.ibb.co/euy6Py/Anne_Hathaway.jpg"),
            Movie("Chris Hemsworth", "https://image.ibb.co/dJY6Py/Emma_Stone.jpg"),
        )
    }
}