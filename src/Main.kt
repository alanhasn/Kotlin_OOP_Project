import utils.AnimalType
import models.*
import utils.*
import data.AnimalInfo
import zoo.ZooKeeper
import zoo.AnimalManager

fun main() {

    val keeper = ZooKeeper("Alan", 25, 5, "All Zones", true)

    println("========== ZOO KEEPER STATUS ==========")
    keeper.checkStatus()
    println("=======================================\n")

    val manager = AnimalManager()

    println("========== ADDING ANIMALS ==========")
    val eagle = Bird(AnimalInfo("Eagle", 5, AnimalType.BIRD, Gender.MALE, "Brown", 6.0, true, true, Days.MONDAY))
    val shark = Fish(AnimalInfo("Shark", 8, AnimalType.FISH, Gender.FEMALE, "Grey", 1500.0, true, false, Days.TUESDAY))
    val elephant = Mammal(AnimalInfo("Elephant", 20, AnimalType.MAMMAL, Gender.FEMALE, "Grey", 5000.0, false, true, Days.WEDNESDAY))
    val cobra = Reptiles(AnimalInfo("Cobra", 4, AnimalType.REPTILE, Gender.MALE, "Black", 5.5, true, true, Days.THURSDAY))

    manager.addAnimal(eagle)
    manager.addAnimal(shark)
    manager.addAnimal(elephant)
    manager.addAnimal(cobra)
    println("=====================================\n")

    println("========== CURRENT ANIMALS IN ZOO ==========")
    manager.listAllAnimals()
    println("============================================\n")

    println("========== SEARCHING FOR: Eagle ==========")
    manager.searchByName("Eagle")
    println("==========================================\n")

    println("========== REMOVING: Shark ==========")
    manager.removeAnimal("Shark")
    println("=====================================\n")

    println("========== UPDATING: Elephant ==========")
    val newElephant = Mammal(AnimalInfo("Elephant", 21, AnimalType.MAMMAL, Gender.FEMALE, "Light Grey", 5200.0, true, true, Days.FRIDAY))
    manager.updateAnimal("Elephant", newElephant)
    println("========================================\n")

    println("========== FINAL ANIMAL LIST ==========")
    manager.listAllAnimals()
    println("=======================================\n")

    println("========== ACTIONS ON ANIMALS ==========")
    manager.searchByName("Eagle")
    manager.searchByName("Shark")
    println("========================================\n")

    println("========== ANIMAL COUNTERS ==========")
    println("Total Animals : ${Animal.AnimalCounter.count()}")
    println("Birds         : ${Bird.BirdCounter.count()}")
    println("Fishes        : ${Fish.FishCounter.count()}")
    println("Mammals       : ${Mammal.MammalCounter.count()}")
    println("Reptiles      : ${Reptiles.ReptileCounter.count()}")
    println("======================================")
}
