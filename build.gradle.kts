package com.example.aplikasikotlin.Model

open class Aquarium(open var width: Int = 20, open var length: Int = 20, open var height: Int = 40) {
    // Fungsi untuk mencetak ukuran akuarium
    fun printSize() {
        println("Width: $width cm\tLength: $length cm\tHeight: $height cm")
    }
}

class TowerTank(override var width: Int, override var height: Int) : Aquarium(width = width, height = height)

sealed class AquariumFish(val color: String)

class Shark : AquariumFish("gray") {
    fun eat() {
        println("The shark is eating")
    }
}

class Plecostomus : AquariumFish("gold") {
    fun eat() {
        println("The plecostomus is eating algae")
    }
}

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(width = 25, height = 40)
    myTower.printSize()
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    buildAquarium()
    makeFish()
}
