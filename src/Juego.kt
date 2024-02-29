import java.io.File
import java.util.*

class Juego {

    var errores = 0
    companion object{
        val workingDirectory = System.getProperty("user.dir")
    }

    fun iniciarJuego(){
        val workingDirectory = System.getProperty("user.dir")
        val palabraDelDia = obtenerPalabraAleatoriaDeArchivo(workingDirectory+"/palabras.txt")

        var intento :String

        println("Adivina la palabra de 6 letras.")

        while (true) {
            println("Introduce una palabra de 6 letras:")
            intento = readln()

            if (intento.length != 6) {
                println("La palabra debe tener 6 letras.")
                continue
            }

            if (intento == palabraDelDia) {
                println("¡Correcto! La palabra es $intento")
                break

            } else {
                println()
            }
        }
    }


    fun obtenerPalabraAleatoriaDeArchivo(nombreArchivo: String): String {
        val palabras = File(nombreArchivo).useLines { it.toList() }
        return palabras.random()
    }
}