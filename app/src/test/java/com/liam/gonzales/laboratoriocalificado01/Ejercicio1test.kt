package com.liam.gonzales.laboratoriocalificado01 // Paquete de la aplicación

class Ejercicio1test { // Clase que contiene el test de anagramas

    companion object { // Objeto estático para contener el método main y la función
        @JvmStatic // Expone main como método estático para Java
        fun main(args: Array<String>) { // Punto de entrada al ejecutar la clase
            val palabra1 = "listen" // Define la primera palabra de prueba
            val palabra2 = "silent" // Define la segunda palabra de prueba
            println( // Imprime en consola...
                "Entrada: \"$palabra1\", \"$palabra2\" → Salida: " +
                        "${verificarAnagrama(palabra1, palabra2)}" // ...el resultado de la verificación
            )

            val palabra3 = "hello" // Define la tercera palabra de prueba
            val palabra4 = "world" // Define la cuarta palabra de prueba
            println( // Imprime en consola...
                "Entrada: \"$palabra3\", \"$palabra4\" → Salida: " +
                        "${verificarAnagrama(palabra3, palabra4)}" // ...el resultado de la verificación
            )
        }

        /**
         * Verifica si dos cadenas son anagramas:
         * contienen las mismas letras con la misma frecuencia
         */
        fun verificarAnagrama(s1: String, s2: String): Boolean { // Declaración de la función
            val str1 = s1
                .replace("\\s+".toRegex(), "") // Quita espacios de s1
                .lowercase()                   // Convierte s1 a minúsculas
            val str2 = s2
                .replace("\\s+".toRegex(), "") // Quita espacios de s2
                .lowercase()                   // Convierte s2 a minúsculas

            if (str1.length != str2.length) { // Si las longitudes no coinciden...
                return false                  // ...no pueden ser anagramas
            }

            val sorted1 = str1.toCharArray().sorted() // Ordena los caracteres de str1
            val sorted2 = str2.toCharArray().sorted() // Ordena los caracteres de str2

            return sorted1 == sorted2 // Devuelve true si ambas listas ordenadas son idénticas
        }
    }
}
