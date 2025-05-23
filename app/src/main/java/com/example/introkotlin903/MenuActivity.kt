package com.example.introkotlin903

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin903.cinepolis.CinepolisActivity
import com.example.introkotlin903.practica1.saludoActivity
import com.example.introkotlin903.practica2.OperasActivity
import com.example.introkotlin903.practica4.ArchivosActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnSaludo = findViewById<Button>(R.id.btn1)
        val btnIrOperas = findViewById<Button>(R.id.btnIrOperas)
        val btnCine = findViewById<Button>(R.id.btn2)
        val btnText = findViewById<Button>(R.id.btn3)

        btnSaludo.setOnClickListener {navegateToSaludo()}


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnSaludo.setOnClickListener {
            Toast.makeText(this, "¡Hola, Luis!", Toast.LENGTH_SHORT).show()
        }

        btnIrOperas.setOnClickListener {
            val intent = Intent(this, OperasActivity::class.java)
            startActivity(intent)
        }

        btnText.setOnClickListener {
            val intent = Intent(this, ArchivosActivity::class.java)
            startActivity(intent)
        }

        btnCine.setOnClickListener {
            val intent = Intent(this, CinepolisActivity::class.java)
            startActivity(intent)
        }

    }

    private fun navegateToSaludo() {
        val intent = Intent(this, saludoActivity::class.java)
        startActivity(intent)
    }
}