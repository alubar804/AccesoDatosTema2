package ejemplos

import java.io.FileWriter

fun main(args: Array<String>) {
    val text = "Contingut per al fitxer. Ara ja sense por a caràcters especials: ç, à, ú, ..."
    val f_out = FileWriter ("texto5.txt")
    for (c in text) {
        f_out.write(c.code)
    }
    f_out.close()
}