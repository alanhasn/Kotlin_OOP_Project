package models

// import Days Enum class from utils package its contains Week days
import data.AnimalType
import utils.Days
import utils.Gender

// abstract Animal class for Animal Representation
abstract class Animal(
    // Animal Attributes
    val name: String,
    val age: Int,
    val type: AnimalType,
    val gender: Gender, // Gender its Enum class contains gender types
    val color: String,
    val weight: Double,
    val isWild: Boolean,
    val isCarnivore: Boolean,
    val feedingDay:Days, // Days: its enum class contains the week days
)
{
    // Companion Object for Count the number of Object created from Animal
    companion object AnimalCounter{
        var count: Int = 0 // count var for store the object number
        fun count(): String {
            return "The number of Animals in the park is $count" // return object number
        }
    }
    init {
        count++ // plus by 1 every time new object created by Animal class
    }

    // Abstract method for making sound
    abstract fun makeSound()

    // abstract method for feeding scheduling
    abstract fun feedingSchedule()
}
