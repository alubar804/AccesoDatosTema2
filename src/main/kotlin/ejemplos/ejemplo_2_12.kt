import java.io.FileInputStream
import java.io.FileOutputStream

fun main(args: Array<String>) {
    val f_in = FileInputStream("texto2.txt")
    val f_out = FileOutputStream("texto4.txt")

    var buffer = ByteArray(30)
    var num = f_in.read(buffer)
    while (num != -1) {
        f_out.write(buffer)    // açò és un error
        num = f_in.read(buffer)
    }
    f_in.close();
    f_out.close();
}