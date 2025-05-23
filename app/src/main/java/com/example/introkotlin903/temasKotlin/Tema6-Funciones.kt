package com.example.introkotlin903.temasKotlin

fun saludo(){
    return println("Hola Mundo!")
}

fun sum(x: Int, y: Int): Int{
    return x + y
}

fun sum2(x: Int, y: Int) = x + y

fun main(){
    saludo()
    println("__________")
    println(sum(2,3))
    println(sum2(2,4))
}

