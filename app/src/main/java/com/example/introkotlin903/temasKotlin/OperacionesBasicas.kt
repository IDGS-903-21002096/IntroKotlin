package com.example.introkotlin903.temasKotlin

fun main(){

    do{
    println("Calculadora de Operaciones")
    println("1. Suma")
    println("2. Resta")
    println("3. Multiplicacion")
    println("4. Division")
    println("5. Salir")
    print("Escoja operacion a realizar:")
    val operacion = readln().toInt()


        if(operacion == 1){
            print("Ingresa el primer valor:")
            var num1 = readln().toDouble()
            print("Ingresa el segundo valor:")
            var num2 = readln().toDouble()
            var suma = num1 + num2
            println("La suma de $num1 y $num2 es $suma")

        }else if (operacion == 2){
            print("Ingresa el primer valor:")
            var num1 = readln().toDouble()
            print("Ingresa el segundo valor:")
            var num2 = readln().toDouble()
            var resta = num1 - num2
            println("La resta de $num1 y $num2 es $resta")

        }else if (operacion == 3){
            print("Ingresa el primer valor:")
            var num1 = readln().toDouble()
            print("Ingresa el segundo valor:")
            var num2 = readln().toDouble()
            var multiplicacion = num1 * num2
            println("La suma de $num1 y $num2 es $multiplicacion")

        }else if (operacion == 4){
            print("Ingresa el primer valor:")
            var num1 = readln().toDouble()
            print("Ingresa el segundo valor:")
            var num2 = readln().toDouble()
            var division = num1 / num2
            println("La suma de $num1 y $num2 es $division")
        }
    }while(operacion<5)

}