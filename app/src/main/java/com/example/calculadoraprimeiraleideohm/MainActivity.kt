package com.example.calculadoraprimeiraleideohm

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val edtResistencia = findViewById<EditText>(R.id.edtResistencia)
        val edtCorrente = findViewById<EditText>(R.id.edtCorrente)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        btnCalcular.setOnClickListener {
            val resistencia = edtResistencia.text.toString().toDoubleOrNull()
            val corrente = edtCorrente.text.toString().toDoubleOrNull()

            if (resistencia != null && corrente != null) {
                val tensao = resistencia * corrente
                txtResultado.text = "Resultado: V = %.2f V".format(tensao)
            } else {
                txtResultado.text = "Preencha os dois valores corretamente!"
            }
        }
    }
}