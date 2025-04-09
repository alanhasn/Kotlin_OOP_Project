package models

// ---------- Imports ----------
import data.AnimalInfo
import interfaces.Swimable
import interfaces.Trainable

// Fish Class for all types of fish
// Inherits from Animal abstract class and Swimable & Trainable Interfaces
class Fish (
    info: AnimalInfo
) : Animal(info), Swimable, Trainable {

    // Counter for how many Fish in the system
    companion object FishCounter {
        var count = 0
        fun count(): String {
            return "🐟 Total fish in the system: $count"
        }
    }

    init {
        count++
    }

    // --------- Override Methods ---------

    override fun makeSound() {
        println("🌊 The ${animalInfo.name} makes low-frequency underwater sounds.")
    }

    override fun canSwim() {
        println("🐠 The ${animalInfo.name} is swimming gracefully.")
    }

    override fun feedingSchedule() {
        println("🍽️ ${animalInfo.name} gets fed every 📅 ${animalInfo.feedingDay}")
    }

    override fun canTrain() {
        println("🚫 The ${animalInfo.name} is not trainable.")
    }

    override fun trainingSchedule() {
        println("📛 No training schedule for the ${animalInfo.name} because it's not trainable.")
    }

    // --------- Feeding Methods (Overloading) ---------

    fun feed() {
        println("🍤 The ${animalInfo.name} is eating now.")
    }

    fun feed(foodType: String) {
        println("🥣 ${animalInfo.name} eats $foodType.")
    }

    fun feed(foodType: String, portions: Int) {
        println("🍽️ ${animalInfo.name} ate $portions portions of $foodType.")
    }
}
