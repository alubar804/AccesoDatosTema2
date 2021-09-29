package ejemplos
import java.io.FileReader

fun main(args: Array<String>){
    val f_in = FileReader("texto.txt")
    var c = f_in.read()
    while (c!=-1){
        println(c.toChar())
        c = f_in.read()
    }
    f_in.close()
}