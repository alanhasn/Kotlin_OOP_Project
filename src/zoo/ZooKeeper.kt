package zoo

import interfaces.Trainable
import models.Animal

// Represents the zookeeper who manages and feeds the animals
class ZooKeeper(
    val name: String,
    val age: Int,
    val experienceYears: Int,
    val assignedArea: String,
    var isOnDuty: Boolean
) {

    fun feedAnimal(animal: Animal) {
        println("🧑‍🌾 ZooKeeper $name is feeding 🐾 ${animal.animalInfo.name}")
    }

    fun trainAnimal(animal: Animal) {
        if (animal is Trainable){
            println("🏋️ ZooKeeper $name is training 🐾 ${animal.animalInfo.name}")
            animal.trainingSchedule()
        }
        else{
            println(" ${animal.animalInfo.name} is not trainable and $name can not train it.")
        }
    }

    fun checkStatus() {
        if (isOnDuty) {
            println("✅ ZooKeeper $name is currently on duty.")
        } else {
            println("🚫 ZooKeeper $name is off duty. Feeding and training will be delayed.")
        }
    }

    fun zooKeeperInfo(): String{
        return("name:$name , age:$age , Experience:$experienceYears years of Experience, age:$age , Working in:$assignedArea")
    }

}
