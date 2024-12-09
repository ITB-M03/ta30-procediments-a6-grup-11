package controllers.Act1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.util.*

data class Punto(
 var x: Float,
 var y: Float
)
//no se puede hacer test porque no se puedo introducir ningun elemento por teclado
 class Act1_pedirXYTest {

@Test
 fun pedirXYTest() {
 val esperado = Punto(4.0f, 2.0f)
 assertEquals(esperado, pedirXY(scanner = Scanner(System.`in`)))
 }
}