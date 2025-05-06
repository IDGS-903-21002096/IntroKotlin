package com.example.introkotlin903.temasKotlin

fun main(){
    print("Ingresa el sueldo del empleado:")
    val sueldo = readln().toDouble()

    if(sueldo>3000){
      println("Debe pagar impuestos")
    }else{
        println("No debe pagar impuestos")
    }

}