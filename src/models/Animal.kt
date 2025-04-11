package models

// import Days Enum class from utils package its contains Week days
import data.AnimalInfo

// abstract Animal class for Animal Representation
abstract class Animal(
    val animalInfo: AnimalInfo
) {
    // Companion Object for Count the number of Object created from Animal
    companion object AnimalCounter {
        var count: Int = 0 // count var for store the object number
        fun count(): String {
            return "📊 The number of animals in the park is  $count"
        }
    }

    init {
        count++ // plus by 1 every time new object created by Animal class
    }

    // Abstract method for making sound
    abstract fun makeSound()

    // Abstract method for feeding scheduling
    abstract fun feedingSchedule()

    // function for getting the animals name
    fun getAnimalsName(){
        println("Animals name in the park")
        for (i in animalInfo.name){
            println("$i")
        }
    }
}
