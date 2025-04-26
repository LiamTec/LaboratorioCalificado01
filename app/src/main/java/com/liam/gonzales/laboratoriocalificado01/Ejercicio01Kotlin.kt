package com.liam.gonzales.laboratoriocalificado01  // Declara el paquete de la aplicación

class Ejercicio01Kotlin {  // Define la clase que contiene el algoritmo de anagramas
    fun verificarAnagrama(s1: String, s2: String): Boolean {  // Método que recibe dos cadenas y devuelve si son anagramas
        val sorted1 = s1
            .filterNot { it.isWhitespace() }  // 1. Elimina todos los espacios de s1
            .lowercase()                      // 2. Convierte s1 a minúsculas
            .toCharArray()                    // 3. Transforma s1 en un arreglo de caracteres
            .sorted()                         // 4. Ordena alfabéticamente los caracteres de s1
        val sorted2 = s2
            .filterNot { it.isWhitespace() }  // 1. Elimina todos los espacios de s2
            .lowercase()                      // 2. Convierte s2 a minúsculas
            .toCharArray()                    // 3. Transforma s2 en un arreglo de caracteres
            .sorted()                         // 4. Ordena alfabéticamente los caracteres de s2
        return sorted1 == sorted2            // 5. Compara ambas listas ordenadas; true si son idénticas
    }
}
