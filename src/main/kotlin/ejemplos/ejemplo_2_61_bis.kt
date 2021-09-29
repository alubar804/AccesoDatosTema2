package ejemplos

import java.io.InputStreamReader
import java.io.FileInputStream
import java.io.OutputStreamWriter
import java.io.FileOutputStream

import java.io.File

fun main() {
    File("f5_2.txt").writeText(File("f5.txt").readText(), Charsets.ISO_8859_1)
}