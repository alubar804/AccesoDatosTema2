package ejemplos

import java.io.FileWriter

import java.io.File

fun main() {
    val text = "Contingut per al fitxer. Ara ja sense por a caràcters especials: ç, à, ú, ..."
    File("f5.txt").writeText(text)
}