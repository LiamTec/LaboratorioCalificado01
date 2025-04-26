package com.liam.gonzales.laboratoriocalificado01
import org.junit.Assert.assertEquals
import org.junit.Test

class Ejercicio02KotlinTest {
    // Instanciamos la clase que contiene la lógica de contar vocales
    private val ejercicio = Ejercicio02Kotlin()
    @Test
    fun testHolaMundo_cuentaVocales() {
        val entrada = "Hola mundo"                                      // Cadena de prueba
        val resultado = ejercicio.contarVocales(entrada)               // Llamada al método contarVocales
        println("Entrada: \"$entrada\" → $resultado")                  // Imprime en consola el formato deseado
        assertEquals("Debería contar 4 vocales en \"$entrada\"", 4, resultado)  // Comprueba que el resultado sea 4
    }
    @Test
    fun testKotlinEsGenial_cuentaVocales() {
        val entrada = "Kotlin es genial"                               // Segunda cadena de prueba
        val resultado = ejercicio.contarVocales(entrada)               // Llamada al método contarVocales
        println("Entrada: \"$entrada\" → $resultado")                  // Imprime en consola el formato deseado
        assertEquals("Debería contar 6 vocales en \"$entrada\"",
            6, resultado)  // Comprueba que el resultado sea 6
    }
}
