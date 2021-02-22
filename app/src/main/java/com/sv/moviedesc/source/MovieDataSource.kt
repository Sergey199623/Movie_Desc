package com.sv.moviedesc.source

import com.sv.moviedesc.data.models.Movie

class MovieDataSource {
    fun getActors(): List<Movie> {
        return listOf(
            Movie("13+", "https://image.ibb.co/j142xJ/Amanda_Seyfried.jpg",
                    "Action, Adventure, Fantasy", "125", "Avengers: End Game",
                    "137"),
            Movie("16+", "https://image.ibb.co/j142xJ/Amanda_Seyfried.jpg",
                    "Action, Adventure, Fantasy", "98", "Tenet", "97"),
            Movie("13+", "https://image.ibb.co/euy6Py/Anne_Hathaway.jpg",
                    "Action, Adventure, Fantasy", "38", "Black Widow",
                    "102"),
            Movie("13+", "https://image.ibb.co/dJY6Py/Emma_Stone.jpg",
                    "Action, Adventure, Fantasy", "74", "Wonder Woman 1984",
                    "120"),
        )
    }
}