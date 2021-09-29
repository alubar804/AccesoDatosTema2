package ejercicios
import javax.swing.*
import java.awt.*
import java.io.*

class ejercicio2_2_pantalla : JFrame() {
    val et_f = JLabel("Fitxer:")
    val fitxer = JTextField(25)
    val obrir = JButton("Obrir")
    val guardar = JButton("Guardar")
    val et_a = JLabel("Contingut:")
    val area = JTextArea(10, 50)
    val scrollPane = JScrollPane(area)

    // en iniciar posem un contenidor per als elements anteriors
    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE

        setLayout(GridLayout(2, 1))
        setTitle("Editor de text")

        val panell1 = JPanel(GridLayout(0, 1))
        val panell1_1 = JPanel(FlowLayout())
        panell1.add(panell1_1)
        panell1_1.add(et_f)
        fitxer.text="texto.txt"
        panell1_1.add(fitxer)

        val panell1_2 = JPanel(FlowLayout())
        panell1.add(panell1_2)
        panell1_2.add(obrir)
        panell1_2.add(guardar)
        val panell2 = JPanel(GridLayout(0, 1))
        panell2.add(scrollPane)
        area.setEditable(true)

        add(panell1)
        add(panell2)
        pack()

        obrir.addActionListener {
            // Instruccions per a bolcar el contingut del fitxer en el JTextArea
            area.text =""
            if(fitxer.text!=null && !fitxer.text.equals("")){

                var fitxa = File(fitxer.text)
                if (fitxa.isFile){
                    val f_ent = BufferedReader(FileReader(fitxa))

                    var cad = f_ent.readLine();
                    var i = 0
                    while (cad != null) {
                        i++
                        area.text = area.text+(cad+"\n")
                        cad = f_ent.readLine()
                    }
//                    area.add(et_a)
                }else{
                    area.text = "archivo no valido"
//                    area.add(et_a)
                }

            }else{
                area.text = "introduce un archivo"
//                area.add(et_a)
            }
        }

        guardar.addActionListener {
            // Instruccions per a guardar el contingut del JTextArea al fitxer. area.text
            val f_out = PrintStream(FileOutputStream ("textoPantalla.txt"))
            f_out.print(area.text)
        }
    }
}

private fun crearMostrarFinestra() {

    val frame = ejercicio2_2_pantalla()
    frame.isVisible = true
}

fun main(args: Array<String>) {
    EventQueue.invokeLater(::crearMostrarFinestra)
}