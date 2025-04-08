package models

// ---------- Imports ----------
import data.AnimalType
import interfaces.Swimable
import interfaces.Trainable
import utils.Days
import utils.Gender

// Fish Class for all types of fish
// inherit from Animal abstract class and Swim-able and Trainable Interfaces
class Fish (
    // attributes
    name: String,
    age: Int,
    type: AnimalType,
    gender: Gender,
    color: String,
    weight: Double,
    isWild: Boolean,
    isCarnivore: Boolean,
    feedingDay: Days,
): Animal(name , age , type , gender , color , weight , isWild , isCarnivore , feedingDay) , Swimable , Trainable
{
    //  --------- Override Methods ---------
    override fun makeSound() {
        println("The $name makes low-frequency underwater sounds")
    }
    override fun canSwim() {
        println("the $name can swim")
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

    // --------- overloading feed method  ---------
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

