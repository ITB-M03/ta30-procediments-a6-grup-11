package controllers.Act2
import java.util.*

fun main() {
    val scanner = abrirScanner()
    val sala = Array(20) { Array(15) { '_' } }

    var salir = false
    while (!salir) {
        when (mostrarMenu(scanner)) {
            1 -> buidarSala(sala)
            2 -> visualitzarSeients(sala)
            3 -> reservaSeients(sala, scanner)
            4 -> {
                salir = true
            }
            else -> println("Vuelve a intentarlo -_-.")
        }
    }

    cerrarScanner(scanner)
}

/**
 * Muestra el menú y devuelve la opción seleccionada.
 * @param scanner Instancia del Scanner para leer la entrada del usuario.
 * @return La opción seleccionada por el usuario.
 */
fun mostrarMenu(scanner: Scanner): Int {
    println("Menú:")
    println("1) Buidar sala")
    println("2) Visualitzar seients disponibles")
    println("3) Reserva de seients")
    println("4) Sortir")
    print("Seleccioneu una opció: ")
    return scanner.nextInt()
}

/**
 * Limpia la sala marcando todos los asientos como libres.
 * @param sala Array bidimensional que representa la sala de cine.
 */
fun buidarSala(sala: Array<Array<Char>>) {
    for (i in sala.indices) {
        for (j in sala[i].indices) {
            sala[i][j] = '_'
        }
    }
    println("Sala vaciada correctamente.")
}

/**
 * Muestra los asientos vacios
 * @param sala Array que representa la sala de cine
 */
fun visualitzarSeients(sala: Array<Array<Char>>) {
    println("Asientos de la sala:")
    for (fila in sala) {
        println(fila.joinToString(" "))
    }
}

/**
 * Permite reservar un asiento si está disponible.
 * @param sala Array que representa la sala de cine.
 */
fun reservaSeients(sala: Array<Array<Char>>, scanner: Scanner) {
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

/**
 * Abre una Scanner para leer la entrada del usuario.
 * @return
 */
fun abrirScanner(): Scanner {
    return Scanner(System.`in`)
}

/**
 * Cierra Scanner
 * @param scanner
 */
fun cerrarScanner(scanner: Scanner) {
    scanner.close()
}
