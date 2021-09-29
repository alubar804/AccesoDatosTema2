package ejemplos
import java.io.FileInputStream

fun main(args: Array<String>){
    val f_in = FileInputStream("texto.txt")
    var c = f_in.read()
    while (c!=-1){
        println(c.toChar())
        c = f_in.read()
    }
    f_in.close()
}
