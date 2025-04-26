package com.liam.gonzales.laboratoriocalificado01

import org.junit.Assert.*
import org.junit.Test

class Ejercicio01KotlinTest {

    @Test
    fun testListenSilent_esAnagrama() {
        // Comentario que queremos que salga sí o sí en el log
        val comentario1 = "true"
        println(comentario1)  // <— lo imprimimos en stdout
        assertTrue(
            comentario1,
            Ejercicio01Kotlin.verificarAnagrama("listen", "silent")
        )
    }

    @Test
    fun testHelloWorld_noEsAnagrama() {
        // Comentario que queremos que salga sí o sí en el log
        val comentario2 = "false"
        println(comentario2)  // <— lo imprimimos en stdout
        assertFalse(
            comentario2,
            Ejercicio01Kotlin.verificarAnagrama("hello", "world")
        )
    }
}
