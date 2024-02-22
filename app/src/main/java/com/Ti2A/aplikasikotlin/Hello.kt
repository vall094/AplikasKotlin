package com.Ti2A.aplikasikotlin


class Person(val name: String, val hobby: Hobby)

class Hobby(val name: String, val description: String)

fun main() {
    val hobby = Hobby("Main Game", "Saya suka memaikan game, terutama memainkan game mobile legends karena saya sangat jago")
    val person = Person("Noval Fajar Budi Pamungkas", hobby)

    println("Nama: ${person.name}")
    println("Hobi: ${person.hobby.name}")
    println("Deskripsi Hobi: ${person.hobby.description}")
}
