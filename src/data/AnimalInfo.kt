package data

import utils.AnimalType
import utils.Gender
import utils.Days

// animal Info: for store all animal information

data class AnimalInfo(
    // Animal Attributes
    val name: String,
    val age: Int,
    val type: AnimalType, // Animal Type its enum class
    val gender: Gender, // Gender its enum class
    val color: String,
    val weight: Double,
    val isWild: Boolean,
    val isCarnivore: Boolean,
    val feedingDay:Days // Days: its enum class contains the week days
)