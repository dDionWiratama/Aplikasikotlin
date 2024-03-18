package com.example.aplikasikotlin

abstract class AquariumFish {
    abstract val color: String

    interface FishAction {
        fun eat()
    }


    class Shark : AquariumFish(), FishAction {
        override val color = "grey"
        override fun eat() {
            println("hunt and eat fish")
        }

        interface FishColor {
            val color: String
        }

        object GoldColor : FishColor {
            override val color = "gold"
        }

        class PrintingFishAction(val food: String) : FishAction {
            override fun eat() {
                println(food)
            }
        }

        class Plactomous : AquariumFish(), FishAction {
            override val color = "gold"
            override fun eat() {
                println("eat algae")
            }
        }

        interface FishAction {
            fun eat()
        }

        class Plecostomus(fishColor: FishColor = GoldColor) :
            FishAction by PrintingFishAction("eat algae"),
            FishColor by fishColor

        abstract class AquariumFish : FishAction {
            abstract val color: String
            override fun eat() = println("yum")
            class Shark : FishAction, FishColor {
                override val color = "grey"
                override fun eat() {
                    println("hunt and eat fish")
                }

            }
        }
    }
}