package controllers.Act2
import java.util.*

fun main() {
    val scanner = abrirScanner()
    val sala = Array(20) { Array(15) { '_' } }
    gestionarSala(sala, scanner)
    cerrarScanner(scanner)
}

/**
 * Abrir Scanner
 * @author Bryan
 * @version 1.2
 * @since 8-12-24
 *
 * @param scanner abrimos scanner
 * @return
 */
fun abrirScanner(): Scanner {
    val scanner = Scanner(System.`in`)
    return scanner
}
/**
 * Gestiona el menu
 * @param sala array que representa la sala de cine
 * @param scanner lee la entrada
 * @author Bryan
 * @version 1.0
 * @since 8-12-24
 */
fun gestionarSala(sala: Array<Array<Char>> , scanner: Scanner){
    var salir = false
    while (!salir) {
        when (mostrarMenu(scanner)) {
            1 -> vaciaSala(sala)
            2 -> verasientos(sala)
            3 -> reservaAsientos(sala, scanner)
            4 -> {
                salir = true
            } //committ
            else -> println("Vuelve a intentarlo -_-7.")
        }
    }
}

/**
 * Cierra Scanner
 * @author Bryan
 * @version 1.2
 * @since 8-12-24
 * @param scanner cerramos scanner
 */
fun cerrarScanner(scanner: Scanner) {
    scanner.close()
}
/**
 * Muestra el menú y devuelve la opción seleccionada.
 * @param scanner lee la entrada
 * @author Bryan
 * @version 1.0
 * @since 8-12-24
 * @return Devuelve opción seleccionada.
 */
fun mostrarMenu(scanner: Scanner): Int {
    println("Menú:")
    println("1) Vaciar sala")
    println("2) Asientos Disponibles")
    println("3) Reservar Asientos")
    println("4) Salir")
    print("Elige una opcion: ")
    return scanner.nextInt()
}

/**
 * Limpia la sala marcando todos los asientos como libres.
 * @author Bryan
 * @version 1.0
 * @since 8-12-24
 * @param sala Array que representa la sala de cine.
 *
 */
fun vaciaSala(sala: Array<Array<Char>>) {
    for (i in sala.indices) {
        for (j in sala[i].indices) {
            sala[i][j] = '_'
        }
    }
    println("Sala vaciada correctamente.")
}

/**
 * Muestra los asientos vacios
 * @author Bryan
 * @version 1.0
 * @since 8-12-24
 * @param sala Array que representa la sala de cine
 *
 */
fun verasientos(sala: Array<Array<Char>>) {
    println("Asientos de la sala:")
    for (fila in sala) {
        println(fila.joinToString(" "))
    }
}

/**
 * Permite reservar un asiento si está disponible.
 * @author Bryan
 * @version 1.0
 * @since 8-12-24
 * @param sala Array que representa la sala de cine.
 * @param scanner lee la entrada
 *
 */
fun reservaAsientos(sala: Array<Array<Char>>, scanner: Scanner) {
    print("Seleciona la fila (1-20): ")
    val fila = scanner.nextInt() - 1
    print("Seleciona la butaca (1-15): ")
    val butaca = scanner.nextInt() - 1

    if (fila in sala.indices && butaca in sala[fila].indices) {
        if (sala[fila][butaca] == '_') {
            sala[fila][butaca] = 'X'
            println("Asiento reservado.")
        } else {
            println("Asiento ya ocupado.")
        }
    } else {
        println("Error.")
    }
}