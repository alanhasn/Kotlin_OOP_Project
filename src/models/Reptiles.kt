package models

// -------- Imports --------
import data.AnimalInfo
import interfaces.Creepable
import interfaces.Trainable
import utils.Days

// class Reptiles represents all types of reptiles
// Inherits from Animal abstract class and implements Creep able and Trainable Interfaces
class Reptiles(
    info: AnimalInfo
) : Animal(info), Creepable, Trainable {

    // Counter for how many reptiles in the system
    companion object ReptileCounter {
        var count = 0
        fun count(): String {
            return "Total reptiles in the system: $count"
        }
    }

    init {
        count++
    }

    // ---------- Overridden Methods ----------

    override fun makeSound() {
        when (animalInfo.name.lowercase()) {
            "snake" -> println("🐍 The ${animalInfo.name} hisses!")
            "crocodile" -> println("🐊 The ${animalInfo.name} growls and bellows!")
            "lizard" -> println("🦎 The ${animalInfo.name} rustles quietly through the leaves.")
            "turtle" -> println("🐢 The ${animalInfo.name} grunts softly.")
            else -> println("🦖 The ${animalInfo.name} makes a quiet reptile sound.")
        }
    }

    override fun canCreep() {
        println("${animalInfo.name} can creep stealthily.")
    }

    override fun feedingSchedule() {
        println("🍽️ ${animalInfo.name} gets fed every 📅 ${animalInfo.feedingDay}")
    }

    override fun canTrain() {
        println("The ${animalInfo.name} is trainable.")
    }

    override fun trainingSchedule() {
        println("The Eagle trains every ${Days.THURSDAY}.")
    }

    // ---------- Feeding Methods (Overloading) ----------

    fun feed() {
        println("🍗 The ${animalInfo.name} is eating now.")
    }

    fun feed(foodType: String) {
        println("🥩 ${animalInfo.name} eats $foodType.")
    }

    fun feed(foodType: String, portions: Int) {
        println("🍽️ ${animalInfo.name} ate $portions portions of $foodType.")
    }
}
