package data

import utils.Gender
import utils.Days

// animal Info
data class AnimalInfo(
    // Animal Attributes
    val name: String ,
    val age: Int,
    val type: String,
    val gender: Gender,
    val color: String,
    val weight: Double,
    val isWild: Boolean,
    val isCarnivore: Boolean,
    val feedingDay:Days // Days: its enum class contains the week days
)