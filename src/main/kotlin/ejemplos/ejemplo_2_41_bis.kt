package ejemplos
import java.io.File

fun main() {
    val f_out = File("f6.txt").printWriter()

    val a = 5.25.toFloat()
    val b = "Hola."
    f_out.print(b)
    f_out.println("Què tal?")
    f_out.println(a + 3)
    f_out.printf("El número %d en hexadecimal és %x", 27, 27)

    f_out.close();
}