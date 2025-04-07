package models

import interfaces.Playable
class Mammal (
    name: String ,
    age: Int,
    type: String,
    gender: Gender,
    color: String,
    weight: Double,
    isWild: Boolean,
    isCarnivore: Boolean

): Animal(name , age , type , gender , color , weight , isWild , isCarnivore) , Playable
{
    override fun makeSound() {
        println("the $name make sound")
    }

    override fun canPlay() {
        println("the $name can Play")
    }

    fun feed(){
        println("the $name is Eating now")
    }

    fun feed(foodType : String) {
        println("$name eat $foodType")
    }

    fun feed(foodType: String, portions: Int) {
        println("$name ate $portions portions of $foodType")
    }

}