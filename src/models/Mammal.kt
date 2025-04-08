package models

//  --------- Imports  ---------
import data.AnimalType
import interfaces.Playable
import interfaces.Trainable
import utils.Days
import utils.Gender

// Mammal class for mammal animal type representation
// inherit from Animal abstract class and Playable and Trainable Interfaces
class Mammal (
    name: String,
    age: Int,
    type: AnimalType,
    gender: Gender,
    color: String,
    weight: Double,
    isWild: Boolean,
    isCarnivore: Boolean,
    feedingDays: Days
): Animal(name , age , type , gender , color , weight , isWild , isCarnivore , feedingDays) , Playable , Trainable
{
    // Overriding Methods
    override fun makeSound() {
        when (type.name.lowercase()) {
            // Add Specif sound for each specif Mammal
            "elephant" -> println("The $name trumpets loudly!")
            "lion" -> println("The $name roars fiercely!")
            "dog" -> println("The $name barks loudly!")
            "cat" -> println("The $name meows softly!")
            "horse" -> println("The $name neighs energetically!")
            else -> println("The $name makes a mammal sound.")
        }
    }
    override fun canPlay() {
        println("the $name can Play")
    }
    override fun feedingSchedule() {
        println("$name is get fed every $feedingDay")
    }
    override fun canTrain() {
        println("The $name is Trainable")
    }
    override fun trainingSchedule() {
        println("The $name get train every ${Days.FRIDAY} and ${Days.THURSDAY}")
    }

    // overloading feed method
    fun feed(){
        println("the $name is Eating now")
    }
    fun feed(foodType : String) {
        println("$name eat $foodType")
    }
    fun feed(foodType: String, portions: Int) {
        println("$name ate $portions portions of $foodType")
    }
}