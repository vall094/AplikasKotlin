package com.Ti2A.aplikasikotlin


        fun main(args: Array<String>) {
            println("hello, ${args[0]}")
            val temperature = 20
                    val isHot = if (temperature > 40) "Panas" else "dingin"
            println(isHot)
        }