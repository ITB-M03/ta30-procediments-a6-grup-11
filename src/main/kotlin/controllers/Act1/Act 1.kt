package controllers.Act1

import java.util.*

data class Punt (
    var x: Float,
    var y: Float,
)

fun main() {

}

/**
 * Abre una Scanner para leer la entrada del usuario.
 * @return
 */
fun abrirScanner(): Scanner {
    val scanner = Scanner(System.`in`)
    return scanner
}

/**
 * Cierra Scanner
 * @param scanner
 */
fun cerrarScanner(scanner: Scanner) {
    scanner.close()
}

fun menu(){
}