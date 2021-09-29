package ejercicios

import java.io.File
import java.io.FileReader

fun main(args: Array<String>){
    val f = File("Penyagolosa.bmp")

    val fi = FitxerImatge(f)
    fi.transformaNegatiu()
    fi.transformaObscur()
    //voluntari
    fi.transformaBlancNegre()
}