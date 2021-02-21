package com.sv.moviedesc.source

import com.sv.moviedesc.data.models.Actor

class ActorsDataSource {
    fun getActors(): List<Actor> {
        return listOf(
                Actor("Robert Downey Jr.", "https://image.ibb.co/j142xJ/Amanda_Seyfried.jpg"),
                Actor("Chris Evans", "https://image.ibb.co/j142xJ/Amanda_Seyfried.jpg"),
                Actor("Mark Ruffalo", "https://image.ibb.co/euy6Py/Anne_Hathaway.jpg"),
                Actor("Chris Hemsworth", "https://image.ibb.co/dJY6Py/Emma_Stone.jpg"),
        )
    }
}