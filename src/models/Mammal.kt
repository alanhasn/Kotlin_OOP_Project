package models

//  --------- Imports  ---------
import data.AnimalInfo
import interfaces.Playable
import interfaces.Trainable
import utils.Days

// Mammal class for mammal animal type representation
// Inherits from Animal abstract class and implements Playable and Trainable Interfaces
class Mammal (
    info: AnimalInfo
) : Animal(info), Playable, Trainable {

    // to count how many Mammals in the system
    companion object MammalCounter {
        var count = 0
        fun count(): String {
            return "Total mammals in the system: $count"
        }
    }

    init {
        count++
    }

    // ---------- Overridden Methods ----------

    override fun makeSound() {
        when (animalInfo.name.lowercase()) {
            "elephant" -> println("🐘 The ${animalInfo.name} trumpets loudly!")
            "lion" -> println("🦁 The ${animalInfo.name} roars fiercely!")
            "dog" -> println("🐶 The ${animalInfo.name} barks loudly!")
            "cat" -> println("🐱 The ${animalInfo.name} meows softly!")
            "horse" -> println("🐴 The ${animalInfo.name} neighs energetically!")
            else -> println(" The ${animalInfo.name} makes a mammal sound.")
        }
    }

    override fun canPlay() {
        println(" The ${animalInfo.name} loves to play!")
    }

    override fun feedingSchedule() {
        println(" ${animalInfo.name} gets fed every 📅 ${animalInfo.feedingDay}")
    }

    override fun canTrain() {
        println(" The ${animalInfo.name} is trainable.")
    }

    override fun trainingSchedule() {
        println("📆 The ${animalInfo.name} trains every ${Days.FRIDAY} and ${Days.THURSDAY}.")
    }

    // ---------- Feeding Methods (Overloading) ----------

    fun feed() {
        println("🥩 The ${animalInfo.name} is eating now.")
    }

    fun feed(foodType: String) {
        println(" ${animalInfo.name} eats $foodType.")
    }

    fun feed(foodType: String, portions: Int) {
        println("🍽 ${animalInfo.name} ate $portions portions of $foodType.")
    }
}
