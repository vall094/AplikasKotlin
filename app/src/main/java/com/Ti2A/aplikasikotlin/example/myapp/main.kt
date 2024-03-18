package com.Ti2A.aplikasikotlin.example.myapp

import com.Ti2A.aplikasikotlin.example.myapp.Decor.Plecostomus
import com.Ti2A.aplikasikotlin.example.myapp.Decor.Shark
import com.Ti2A.aplikasikotlin.example.myapp.Decor.TowerTank
import java.lang.Math.PI

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
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

fun main (){
    buildAquarium()
    makeFish()
}
