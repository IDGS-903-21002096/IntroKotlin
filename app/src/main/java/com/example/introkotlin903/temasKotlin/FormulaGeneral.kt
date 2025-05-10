package com.example.introkotlin903.temasKotlin
import kotlin.math.sqrt
fun main(){
    println("Ecuaciones con formula general")

    print("Ingresa el valor de a: ")
    val a = readln().toDoubleOrNull()

    print("Ingresa el valor de b: ")
    val b = readln().toDoubleOrNull()

    print("Ingresa el valor de c: ")
    val c = readln().toDoubleOrNull()

    if (a == null || b == null || c == null) {
        println("Uno de los valores no es válido. Usa solo números.")
        return
    }

    if (a == 0.0) {
        println("Esto no es una ecuación cuadrática porque 'a' no puede ser 0.")
        return
    }

    val discriminante = b * b - 4 * a * c

    if (discriminante < 0) {
        println("La ecuación tiene soluciones imaginarias.")
    } else {
        val x1 = (-b + sqrt(discriminante)) / (2 * a)
        val x2 = (-b - sqrt(discriminante)) / (2 * a)

        println("Las soluciones son:")
        println("x1 = $x1")
        println("x2 = $x2")
    }
}