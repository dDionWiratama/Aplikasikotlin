package com.example.aplikasikotlin

import com.example.aplikasikotlin.AquariumFish
import com.example.aplikasikotlin.Aquarium

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printsize()
    val myTower = Aquarium.Aquarium.TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}
fun makeFish() {
    val shark = AquariumFish.Shark()
    val pleco = AquariumFish.Shark.Plactomous()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}
fun main() {
    buildAquarium()
    makeFish()
}