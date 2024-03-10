package com.Ti2A.aplikasikotlin.example.myapp

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40) {
        // Dimensions in cm
        var length: Int = length
        var width: Int = width
        var height: Int = height

        fun printSize() {
            println(
                "Width: $width cm " +
                        "Length: $length cm " +
                        "Height: $height cm "
            )
            // 1 liter = 1000 cm^3
            println("Volume: $volume liters")
        }

        init {
            println("aquarium initializing")
        }

        constructor(numberOfFish: Int) : this() {
            // 2,000 cm^3 per fish + extra room so water doesn't spill
            val tank = numberOfFish * 2000 * 1.1
            // calculate the height needed
            height = (tank / (length * width)).toInt()
        }

        var volume: Int
            get() = width * height * length / 1000
            set(value) {
                height = (value * 1000) / (width * length)
            }
}