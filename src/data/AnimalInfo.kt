package data

import models.Gender

data class AnimalInfo(
    val name: String ,
    val age: Int,
    val type: String,
    val gender: Gender,
    val color: String,
    val weight: Double,
    val isWild: Boolean,
    val isCarnivore: Boolean
    ){
}