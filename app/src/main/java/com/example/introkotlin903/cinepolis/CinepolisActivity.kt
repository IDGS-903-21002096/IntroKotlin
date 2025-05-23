package com.example.introkotlin903.cinepolis

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin903.R

class CinepolisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cinepolis)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val editTextNombre = findViewById<EditText>(R.id.edtNombre)
        val editTextCantidad = findViewById<EditText>(R.id.edtCompradores)
        val radioSi = findViewById<RadioButton>(R.id.radioButton)
        val btnCalcular = findViewById<Button>(R.id.button)
        val textResultado = findViewById<TextView>(R.id.tvResultado)

        btnCalcular.setOnClickListener {
            val nombre = editTextNombre.text.toString()
            val cantidadBoletas = editTextCantidad.text.toString().toIntOrNull() ?: 0
            val tieneCineco = radioSi.isChecked

            val resultado = calcularTotal(nombre, cantidadBoletas, tieneCineco)
            textResultado.text = resultado

        }
    }

    fun calcularTotal(nombre: String, cantidad: Int, tieneCineco: Boolean): String {
        if (cantidad <= 0) return "Debes colocar una cantidad mayor a 0"
        if (cantidad > 7) return "No se puede comprar más de 7 boletas."

        val precio = 12.0
        var total = precio * cantidad
        val descuento = when {
            cantidad > 5 -> 0.15
            cantidad in 3..5 -> 0.10
            else -> 0.0
        }

        total -= total * descuento

        if (tieneCineco) {
            total -= total * 0.10
        }

        return "$nombre debe pagar: $${"%,.2f".format(total)}"
    }
}