import utils.AnimalType
import models.Animal
import models.Bird
import models.Fish
import models.Mammal
import models.Reptiles
import utils.Gender
import utils.Days
import data.AnimalInfo
import zoo.ZooKeeper

fun main() {
    // Zoo keeper
    val keeper1 = ZooKeeper("Alan" , 20  , 10 , "Bird Zone" , true)
    keeper1.checkStatus()
    keeper1.feedAnimal("Eagle")
    keeper1.trainAnimal("Eagle")
    println("-----------------------------------")
    // Bird
    val eagle_info = AnimalInfo("Eagle", 5, AnimalType.BIRD, Gender.MALE, "Brown & White", 6.5, true, true, Days.MONDAY)
    val eagle = Bird(eagle_info)
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
    val shark_info = AnimalInfo("Shark", 8, AnimalType.FISH, Gender.FEMALE, "Grey", 1500.0, true, false, Days.TUESDAY)
    val shark = Fish(shark_info)
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
    val elephant_info = AnimalInfo("Elephant", 25, AnimalType.MAMMAL, Gender.FEMALE, "Grey", 5000.0, false, true, Days.WEDNESDAY)
    val elephant = Mammal(elephant_info)
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
    val cobra_info = AnimalInfo("Cobra", 4, AnimalType.REPTILE, Gender.MALE, "Black", 5.5, true, true, Days.THURSDAY)
    val cobra = Reptiles(cobra_info)
    cobra.makeSound()
    cobra.canCreep()
    cobra.feed()
    cobra.feed("rat")
    cobra.feed("rat", 1)
    cobra.feedingSchedule()
    cobra.canTrain()
    cobra.trainingSchedule()

    println("----------------------------------")
    // Companions Objects
    println(Animal.AnimalCounter.count())
    println(Bird.BirdCounter.count())
    println(Fish.FishCounter.count())
    println(Reptiles.ReptileCounter.count())
    println(Mammal.MammalCounter.count())
}
