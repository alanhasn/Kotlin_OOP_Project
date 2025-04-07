package models

import interfaces.Flyable

class Bird(
    name: String ,
    age: Int,
    type: String,
    gender: Gender,
    color: String,
    weight: Double,
    isWild: Boolean,
    isCarnivore: Boolean
): Animal(name , age , type , gender , color , weight , isWild , isCarnivore) , Flyable
{
    override fun makeSound() {
        println("The $name is ZQZQZQ")
    }

    override fun canFly() {
        println("the $name can Fly")
    }

    fun walk(){
        println("the $name can Walk")
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


    fun hunt(){
        println("The $name can Hunt")
    }

}