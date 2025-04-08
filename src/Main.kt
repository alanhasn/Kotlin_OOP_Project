import data.AnimalType
import models.Animal
import models.Bird
import models.Fish
import models.Mammal
import models.Reptiles
import utils.Gender
import utils.Days
import data.AnimalInfo

fun main() {
    // Bird
    val eagle = Bird("Eagle", 5, AnimalType.BIRD, Gender.MALE, "Brown & White", 6.5, true, true, Days.MONDAY)
    eagle.makeSound()
    eagle.canFly()
    eagle.walk()
    eagle.hunt()
    eagle.feed()
    eagle.feed("meat")
    eagle.feed("meat", 2)
    eagle.feedingSchedule()
    eagle.trainingSchedule()
    eagle.canTrain()
    eagle.trainingSchedule()

    println("------------------------------")

    //  Fish
    val shark = Fish("Shark", 8, AnimalType.FISH, Gender.FEMALE, "Grey", 1500.0, true, false, Days.TUESDAY)
    shark.makeSound()
    shark.canSwim()
    shark.feed()
    shark.feed("fish")
    shark.feed("fish", 10)
    shark.feedingSchedule()
    shark.canTrain()
    shark.trainingSchedule()

    println("------------------------------")

    // Mammal
    val elephant = Mammal("Elephant", 25, AnimalType.MAMMAL, Gender.FEMALE, "Grey", 5000.0, false, true, Days.WEDNESDAY)
    elephant.makeSound()
    elephant.canPlay()
    elephant.feed()
    elephant.feed("grass")
    elephant.feed("grass", 50)
    elephant.feedingSchedule()
    elephant.trainingSchedule()
    elephant.canTrain()
    elephant.trainingSchedule()

    println("------------------------------")

    // Reptile
    val cobra = Reptiles("Cobra", 4, AnimalType.REPTILE, Gender.MALE, "Black", 5.5, true, true, Days.THURSDAY)
    cobra.makeSound()
    cobra.canCreep()
    cobra.feed()
    cobra.feed("rat")
    cobra.feed("rat", 1)
    cobra.feedingSchedule()
    cobra.trainingSchedule()
    cobra.canTrain()
    cobra.trainingSchedule()

    println(Animal.AnimalCounter.count())
}
