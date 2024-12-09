package controllers.Act1

import java.util.*

data class Punt (
    var x: Float,
    var y: Float,
)

fun main() {
    val scanner = abrirScanner()
    val punto = pedirXY(scanner)  // Obtenemos las coordenadas del usuario y las asignamos a un Punto.

    // Llamadas a las funciones adicionales
    mostrarPuntos(punto)  // Mostrar el punto
    sumarPuntos(scanner, punto)  // Sumar coordenadas al punto
    escalarPuntos(scanner, punto)  // Escalar el punto por un valor
    comparaPuntos(scanner, punto)  // Comparar el punto con otro

    cerrarScanner(scanner)
}

/**
 * Abre una Scanner para leer la entrada del usuario.
 * @return un objeto Scanner
 */
fun abrirScanner(): Scanner {
    return Scanner(System.`in`)
}

/**
 * Cierra Scanner
 * @param scanner el scanner que se debe cerrar
 */
fun cerrarScanner(scanner: Scanner) {
    scanner.close()
}

/**
 * Función para pedir las coordenadas (x, y) del punto.
 * @param scanner el scanner para leer la entrada del usuario
 * @return el punto creado con las coordenadas dadas
 */
fun pedirXY(scanner: Scanner): Punt {
    val x = scanner.nextFloat()
    val y = scanner.nextFloat()
    return Punt(x, y)
}

/**
 * Función para mostrar un punto con 6 decimales.
 * @param punto el punto que se desea mostrar
 */
fun mostrarPuntos(punto: Punt) {
    println("${String.format(Locale.UK, "%.6f", punto.x)} ${String.format(Locale.UK, "%.6f", punto.y)}")
}

/**
 * Función para sumar valores a las coordenadas del punto.
 * @param scanner el scanner para leer la entrada del usuario
 * @param punto el punto al que se le sumarán las coordenadas
 */
fun sumarPuntos(scanner: Scanner, punto: Punt) {
    val a = scanner.nextFloat()
    val b = scanner.nextFloat()
    println("${punto.x + a} ${punto.y + b}")
}

/**
 * Función para escalar las coordenadas del punto.
 * @param scanner el scanner para leer la entrada del usuario
 * @param punto el punto a escalar
 */
fun escalarPuntos(scanner: Scanner, punto: Punt) {
    val a = scanner.nextFloat()
    println("${punto.x * a} ${punto.y * a}")
}

/**
 * Función para comparar un punto con otro.
 * @param scanner el scanner para leer la entrada del usuario
 * @param punto el punto a comparar
 */
fun comparaPuntos(scanner: Scanner, punto: Punt) {
    val x2 = scanner.nextFloat()
    val y2 = scanner.nextFloat()
    if (punto.x == x2 && punto.y == y2) {
        println("Els dos punts són iguals")
    } else {
        println("Els dos punts no són iguals")
    }
}
