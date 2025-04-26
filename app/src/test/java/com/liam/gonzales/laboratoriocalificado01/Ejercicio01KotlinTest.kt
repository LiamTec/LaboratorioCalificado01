package com.liam.gonzales.laboratoriocalificado01
import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Test

class Ejercicio01KotlinTest {

    private val ejercicio = Ejercicio01Kotlin() // Crea una instancia de la clase que vamos a probar
    @Test                                      // Marca el siguiente método como un caso de prueba
    fun testListenSilent_esAnagrama() {        // Nombre descriptivo: prueba si "listen" y "silent" son anagramas
        val a = "listen"                       // Definimos la primera palabra de entrada
        val b = "silent"                       // Definimos la segunda palabra de entrada
        val resultado = ejercicio.verificarAnagrama(a, b) // Llamamos al método verificarAnagrama con las dos palabras y guardamos el Boolean resultante
        println("Entrada: \"$a\", \"$b\" → $resultado") // Imprimimos en consola el formato deseado: Entradas y el resultado true/false
        assertTrue(resultado)                  //  esperamos que resultado sea true (pase el test)
    }
    @Test
    fun testHelloWorld_noEsAnagrama() {        // Nombre descriptivo: prueba si "hello" y "world" NO son anagramas
        val a = "hello"                        // Definimos la primera palabra de entrada
        val b = "world"                        // Definimos la segunda palabra de entrada
        val resultado = ejercicio.verificarAnagrama(a, b) //  Llamamos al método verificarAnagrama y guardamos el Boolean resultante
        println("Entrada: \"$a\", \"$b\" → $resultado") // Imprimimos en consola el formato deseado: Entradas y el resultado true/false
        assertFalse(resultado)                 // Aserción: esperamos que resultado sea false (pase el test)
    }
}
