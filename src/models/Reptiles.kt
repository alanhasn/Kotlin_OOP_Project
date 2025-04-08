package models

// -------- Imports --------
import data.AnimalType
import utils.Days
import interfaces.Creepable
import interfaces.Trainable
import utils.Gender

// class Reptiles represent all types of Reptiles
// Its Inherit from Animal Abstract class and Creep-able and Trainable Interfaces
class Reptiles(
    // attributes
    name: String,
    age: Int,
    type: AnimalType,
    gender: Gender,
    color: String,
    weight: Double,
    isWild: Boolean,
    isCarnivore: Boolean,
    feedingDays: Days,
): Animal(name , age , type , gender , color , weight , isWild , isCarnivore , feedingDays) , Creepable , Trainable
{
    // Method Overriding
    override fun makeSound() {
        when (type.name.lowercase()) {
            // Add Specif sound for each specif Reptiles
            "snake" -> println("The $name hisses!")
            "crocodile" -> println("The $name growls and bellows!")
            "lizard" -> println("The $name rustles quietly through the leaves.")
            "turtle" -> println("The $name grunts softly.")
            else -> println("The $name makes a quiet reptile sound.")
        }
    }
    override fun canCreep() {
        println("$name Can Creep")
    }
    override fun feedingSchedule() {
        println("$name is get fed every $feedingDay")
    }
    override fun canTrain() {
        println("The $name is not Trainable")
    }
    override fun trainingSchedule() {
        println("No Schedule is available for the $name because the $name is not Trainable")
    }

    // overloading for feed method
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