package com.liam.gonzales.laboratoriocalificado01

/**
 * Contiene el algoritmo para verificar anagramas.
 */
object Ejercicio01Kotlin {
    /**
     * Verifica si dos palabras son anagramas:
     *  - Quita espacios
     *  - Unifica a minúsculas
     *  - Ordena caracteres y compara
     */
    fun verificarAnagrama(s1: String, s2: String): Boolean {
        // 1. Eliminar espacios en blanco
        val str1 = s1.replace("\\s+".toRegex(), "")
        val str2 = s2.replace("\\s+".toRegex(), "")
        // 2. Pasar todo a minúsculas
        val low1 = str1.lowercase()
        val low2 = str2.lowercase()
        // 3. Si las longitudes difieren, no es anagrama
        if (low1.length != low2.length) return false
        // 4. Ordenar los caracteres de cada palabra
        val sorted1 = low1.toCharArray().sorted()
        val sorted2 = low2.toCharArray().sorted()
        // 5. Comparar listas ordenadas
        return sorted1 == sorted2
    }
}
