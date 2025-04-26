package com.liam.gonzales.laboratoriocalificado01

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ejercicio01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Permite que el layout se extienda tras las barras de sistema
        enableEdgeToEdge()

        // Asocia el XML de layout
        setContentView(R.layout.activity_ejercicio01)

        // Aplica padding de sistema (status/nav bars) al contenedor root
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val sys = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(sys.left, sys.top, sys.right, sys.bottom)
            insets
        }
    }
}
