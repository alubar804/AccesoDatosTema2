package ejercicios

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class FitxerImatge(fEnt: File) {
    //54
    var f: File = File("")
    val f_in = FileInputStream(fEnt.name)

    init {
        if (fEnt.isFile && fEnt.name.contains(".bmp")){
            println("correcto")
            f = fEnt
        }else {
            println("error archivo no valido")
        }

        // Constructor
        // Control d'existència del fitxer i control de l'extensió .bmp (traure missatges d'error)
        // En cas que tot siga correcte, inicialitzar f amb fEnt

    }

    fun transformaNegatiu() {
        // Transformar a negatiiu i guardar en _n.bmp
        var f_out = FileOutputStream("penyagolosa_n.bmp")
        val f_in = FileInputStream(f.name)
        for(i in 0..53){
            f_out.write(f_in.read())
        }
        var b=f_in.read()
        while (b!=-1){
            f_out.write(255-b)
            b=f_in.read()
        }
        f_in.close();
        f_out.close();
    }

    fun transformaObscur() {
        // Transformar a una imatge més fosca i guardar en _o.bmp
        var f_out = FileOutputStream("penyagolosa_o.bmp")
        val f_in = FileInputStream(f.name)
        for(i in 0..53){
            f_out.write(f_in.read())
        }
        var b=f_in.read()
        while (b!=-1){
            f_out.write(b/2)
            b=f_in.read()
        }
        f_in.close();
        f_out.close();
    }


    fun transformaBlancNegre() {
        // Transformar a una imatge en blanc i negre i guardar en _bn.bmp
        var f_out = FileOutputStream("penyagolosa_bn.bmp")
        val f_in = FileInputStream(f.name)
        for(i in 0..53){
            f_out.write(f_in.read())
        }
        var b=f_in.read()
        var bn=0
        var abn=0
        while (b!=-1){
            bn=b
            for(j in 1..2)     {
                b=f_in.read()
                bn=bn+b
            }// bn 1 2 3
            abn=bn/3
            for(jj in 1..3)     {
                f_out.write(abn)
            }
            b=f_in.read()
        }
        f_in.close();
        f_out.close();
    }

}

