package com.liam.gonzales.laboratoriocalificado01
class Ejercicio02Kotlin {
    fun contarVocales(texto: String): Int {
        var contador = 0                              // Inicializa el contador en 0
        for (c in texto.lowercase()) {                // Recorre cada carácter en minúscula
            if (c == 'a'                              // Si el carácter es 'a'
                || c == 'e'                              //    o es 'e'
                || c == 'i'                              //    o es 'i'
                || c == 'o'                              //    o es 'o'
                || c == 'u') {                           //    o es 'u'
                contador++                            // Aumenta el contador
            }
        }
        return contador                               // Devuelve el total de vocales
    }
}
