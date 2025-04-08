package models

// ---------- Imports ----------
import data.AnimalInfo
import data.AnimalType
import interfaces.Flyable
import interfaces.Trainable
import utils.Days
import utils.Gender

// class Bird represent all types of bird
// Its Inherit from Animal Abstract class and Flyable and Trainable Interfaces
class Bird(
    // Attributes
    name: String,
    age: Int,
    type: AnimalType,
    gender: Gender,
    color: String,
    weight: Double,
    isWild: Boolean,
    isCarnivore: Boolean,
    feedingDays: Days,
//    info: AnimalInfo,
    ): Animal(name , age , type , gender , color , weight , isWild , isCarnivore , feedingDays) , Flyable , Trainable
{
    // override from Animal class
    override fun makeSound() {
        // Add Specif sound for each specif Bird
        when(type.name.lowercase()){
            "eagle" -> println("The $name screeches loudly!")
            "parrot" -> println("The $name squawks!")
            "owl" -> println("The $name hoots softly!")
            else -> println("The $name makes bird sound")
        }
    }

    // override from Flyable Interface for Fly ability
    override fun canFly() {
        println("the $name can Fly")
    }

    // override from Animal class
    override fun feedingSchedule() {
        println("$name is get fed every $feedingDay")
    }

    // override from Trainable class for train ability
    override fun canTrain() {
        println("The $name is Trainable")
    }

    override fun trainingSchedule() {
        println("The $name get train every ${Days.SATURDAY}")
    }

    // Specif action for the Birds, Walk ability
    fun walk(){
        println("the $name can Walk")
    }

    // Specif action for the Birds, feed ability
    fun feed(){
        println("the $name is Eating now")
    }
    // overload the feed method
    fun feed(foodType : String) {
        println("$name eat $foodType")
    }
    // overload the feed method
    fun feed(foodType: String, portions: Int) {
        println("$name ate $portions portions of $foodType")
    }

    // Specif action for the Birds, hunt ability
    fun hunt(){
        println("The $name can Hunt")
    }
}