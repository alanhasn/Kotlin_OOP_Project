package models

// ---------- Imports ----------
import data.AnimalInfo
import interfaces.Flyable
import interfaces.Trainable
import utils.Days

// class Bird represents all types of birds
// It inherits from Animal abstract class and implements Flyable & Trainable interfaces
class Bird(
    info: AnimalInfo,
) : Animal(info), Flyable, Trainable {

    // to count how many birds in the system
    companion object BirdCounter {
        var count = 0
        fun count(): String {
            return "🐦 Total birds in the system: $count"
        }
    }

    init {
        count++
    }

    // override from Animal class
    override fun makeSound() {
        // Add specific sound for each specific bird
        when (animalInfo.name.lowercase()) {
            "eagle" -> println("🦅 The ${animalInfo.name} screeches loudly!")
            "parrot" -> println("🦜 The ${animalInfo.name} squawks!")
            "owl" -> println("🦉 The ${animalInfo.name} hoots softly!")
            else -> println("🐦 The ${animalInfo.name} makes a bird sound.")
        }
    }

    // override from Flyable Interface
    override fun canFly() {
        println("The ${animalInfo.name} can fly high in the sky!")
    }

    // override from Animal class
    override fun feedingSchedule() {
        println("${animalInfo.name} gets fed every 📅 ${animalInfo.feedingDay}")
    }

    // override from Trainable interface
    override fun canTrain() {
        println("The ${animalInfo.name} is trainable and responds well.")
    }

    override fun trainingSchedule() {
        println("The ${animalInfo.name} trains every 📆 ${Days.SATURDAY}")
    }

    // Specific action: Walk
    fun walk() {
        println("The ${animalInfo.name} can walk on the ground.")
    }

    // Feeding behavior (default)
    fun feed() {
        println("🍗 The ${animalInfo.name} is eating now.")
    }

    // Overloaded feed method with food type
    fun feed(foodType: String) {
        println("${animalInfo.name} eats $foodType.")
    }

    // Overloaded feed method with food type and portions
    fun feed(foodType: String, portions: Int) {
        println(" ${animalInfo.name} ate $portions portions of $foodType.")
    }

    // Specific action: Hunt
    fun hunt() {
        println("The ${animalInfo.name} is hunting skillfully.")
    }
}
