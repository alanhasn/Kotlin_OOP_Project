package models


abstract class Animal(
    val name: String ,
    val age: Int,
    val type: String,
    val gender: Gender,
    val color: String,
    val weight: Double,
    val isWild: Boolean,
    val isCarnivore: Boolean
)
{
    abstract fun makeSound()
}
