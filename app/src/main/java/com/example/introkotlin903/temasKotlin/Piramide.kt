package com.example.introkotlin903.temasKotlin

fun main() {
    var n: Int
    do {
        print("Ingresa el valor de la piramide: ")
        n = readln().toInt()

        var fila = 1
        do {
            if (n > 0) {
                var asteriscos = fila
                do {
                    print("*")
                } while (--asteriscos > 0)
                println()
            }
            fila++
        } while (n >= fila)

    } while (n != 0)
}