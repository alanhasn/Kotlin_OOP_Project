package zoo
import models.Animal
import utils.AnimalType

// Animal manager for manage the Animals
// add , remove , update , show , search by name and type
class AnimalManager {
    // animals mutable list contains all animals objects
    private val animals = mutableListOf<Animal>()

    // add animal
    fun addAnimal(animal: Animal){
        try {
            animals.add(animal)
            println("Added ${animal.animalInfo.name} to the zoo")
        }
        catch (error:Exception){
            println("Unexpected ERROR:$error")
        }
    }
    // remove animal
    fun removeAnimal(name: String) {
        // ignoreCase=true: true to ignore character case when comparing strings. By default, false.
        val removed = animals.removeIf { it.animalInfo.name.equals(name, ignoreCase = true) }
        if (removed) println(" Removed $name from the zoo.")
        else println("⚠️ Animal named $name not found.")
    }

    fun updateAnimal(name: String , newAnimal: Animal) {
        // get the item index
        val index = animals.indexOfFirst { it.animalInfo.name.equals(name, ignoreCase = true) }
        //indexOfFirst return -1 when it cant find the item
        if (index != -1) { // if there is object
            animals[index] = newAnimal // replace with new data
            println("🔁 Updated $name with new data.")
        } else {
            println("⚠️ Animal named $name not found.")
        }
    }
    // search by animal name
    fun searchByName(name: String){
        // find the first object equals to the provided animal name
        val animalName= animals.find { it.animalInfo.name.equals(name , ignoreCase = true) }
        if (animalName?.animalInfo?.name == name){
            println("Found $name")
        }
        else{
            println("No animal call $name")
        }
    }

    // search by animal type
    fun searchByType(type: AnimalType){
        val animalType = animals.find { it.animalInfo.type == type }

        if (animalType?.animalInfo?.type == type){
            println("Found $type")
        }
        else{
            println("No animal call $type")
        }
    }

    fun listAllAnimals() {
        if (animals.isEmpty()) {
            println(" No animals in the zoo.")
        } else {
            println(" Listing all animals:")
            animals.forEach { println("➡️ ${it.animalInfo.name} - ${it.animalInfo.type}") }
        }
    }
}