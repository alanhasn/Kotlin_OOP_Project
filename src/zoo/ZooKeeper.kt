package zoo

import data.AnimalInfo
import models.Animal

// Represents the zookeeper who manages and feeds the animals
class ZooKeeper(
    val name: String,
    val age: Int,
    val experienceYears: Int,
    val assignedArea: String,
    var isOnDuty: Boolean
) {

    fun feedAnimal(animalName: String) {
        println("🧑‍🌾 ZooKeeper $name is feeding 🐾 $animalName")
    }

    fun trainAnimal(animalName: String) {
        println("🏋️ ZooKeeper $name is training 🐾 $animalName")
    }

    fun checkStatus() {
        val status = if (isOnDuty) {
            "✅ ZooKeeper $name is currently on duty."
        } else {
            "🚫 ZooKeeper $name is off duty. Feeding and training will be delayed."
        }
        println(status)
    }

}
