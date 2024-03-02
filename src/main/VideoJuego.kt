package main
import kotlin.random.Random

fun main() {

    var selecPersonaje: Int? = 1
    var selecEnemigo: Int? = 1

    println("**************************************")
    println("***** Inicio del juego Telelocos *****")
    println("**************************************")

    print("\nIngresa tu nombre: ")
    val nombre = readLine().toString()
    println()

    var opcion: Int?

    do {
        imprimirMenuOpciones()
        opcion = readLine()?.toIntOrNull()

        when (opcion) {
            1 -> println("Bienvenido ${nombre.uppercase()}, al juego de los Telelocos\n")
            2 -> println("Instrucciones\n")
            3 -> imprimirDespedida()
            else -> println("Opción no válida\n")
        }

        if (opcion != 3) {


            do {
                imprimirTuPersonaje()
                selecPersonaje = readLine()?.toIntOrNull()


                when (selecPersonaje) {
                    1 -> {
                        println("Has seleccionado al Guerrero")
                        imprimirAsciiGuerrero()
                    }
                    2 -> {
                        println("Has seleccionado al Hechicero")
                        imprimirAsciiHechicero()

                    }
                    3 -> {
                        println("Has seleccionado a la Bruja")
                        imprimirAsciiBruja()
                    }
                    else -> println("Opción no válida\n")
                }
            } while (selecPersonaje !in 1..3)

            imprimirTuEnemigo()


            do {
                selecEnemigo = readLine()?.toIntOrNull()

                when (selecEnemigo) {
                    1 -> {
                        println("Tu enemigo es el Guerrero")
                        imprimirAsciiGuerrero()
                    }
                    2 -> {
                        println("Tu enemigo es el Hechicero")
                        imprimirAsciiHechicero()
                    }
                    3 -> {
                        println("Tu enemigo es la Bruja")
                        imprimirAsciiBruja()
                    }
                    else -> println("Opción no válida\n")
                }
            } while (selecEnemigo !in 1..3)
        }
    } while (opcion !in 1..3)

    if (selecPersonaje == 1 && selecEnemigo == 1){
        println("Has seleccionado al Guerrero")
        println("Tu enemigo es el Guerrero\n")

        val guerrero = Guerrero(nombre)
        val enemigo = Guerrero("Enemigo")

        escenario1(guerrero, enemigo)

    }else if (selecPersonaje == 1 && selecEnemigo == 2){
        println("Has seleccionado al Guerrero")
        println("Tu enemigo es el Hechicero")
    }else if (selecPersonaje == 1 && selecEnemigo == 3){
        println("Has seleccionado al Guerrero")
        println("Tu enemigo es la Bruja")
    }else if (selecPersonaje == 2 && selecEnemigo == 1){
        println("Has seleccionado al Hechicero")
        println("Tu enemigo es el Guerrero")
    }else if (selecPersonaje == 2 && selecEnemigo == 2){
        println("Has seleccionado al Hechicero")
        println("Tu enemigo es el Hechicero")
    }else if (selecPersonaje == 2 && selecEnemigo == 3){
        println("Has seleccionado al Hechicero")
        println("Tu enemigo es la Bruja")
    }else if (selecPersonaje == 3 && selecEnemigo == 1){
        println("Has seleccionado a la Bruja")
        println("Tu enemigo es el Guerrero")
    }else if (selecPersonaje == 3 && selecEnemigo == 2){
        println("Has seleccionado a la Bruja")
        println("Tu enemigo es el Hechicero")
    }else if (selecPersonaje == 3 && selecEnemigo == 3){
        println("Has seleccionado a la Bruja")
        println("Tu enemigo es la Bruja")
    }

}

fun imprimirMenuOpciones() {
    println("***** Selecciona una opción *****\n")
    println("1. Iniciar juego")
    println("2. Instrucciones")
    println("3. Salir")
}

fun imprimirSaludo(){
    println("\n**************************************")
    println("***** Inicio del juego Telelocos *****")
    println("**************************************")
}
fun imprimirDespedida() {
    println("**************************************")
    println("***** Gracias por jugar Telelocos *****")
    println("**************************************")
}

fun imprimirTuPersonaje() {
    println("***** Selecciona un personaje *****")
    println()
    println("1. Guerrero")
    println("2. Hechizero")
    println("3. Bruja")
}

fun imprimirTuEnemigo() {
    println("***** Selecciona tu enemigo *****")
    println()
    println("1. Guerrero")
    println("2. Hechizero")
    println("3. Bruja")
}

fun imprimirAsciiBruja(){
    println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡆⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⡿⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⢀⣠⣾⣿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⣀⣀⣤⣴⣾⣿⣿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣤⣤⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⢀⣀⣠⣤⣶⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⣀⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠋⠁⠀⠀⠀⠀⠀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⢀⣴⠆⠀⠻⢦⣄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠈⠑⠶⢦⣤⡘⢿⣧⡀⠀⠀⠀⠀⠀⠀\n" +
            "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠛⠛⠛⠻⠿⠿⠿⠿⠿⠿⠿⠛⣻⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢻⣾⣿⣿⣇⠀⠀⠀⠀⠀\n" +
            "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀⠀⠀⠄⠀⠀⠀⢠⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢻⣿⣿⣿⡄⠀⠀⠀⠀\n" +
            "⢸⣿⣿⣿⣿⣿⣿⡿⠟⣿⣿⡿⠿⢿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⢤⣄⣠⣴⡶⠃⠀⣠⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⡇⠀⠀⠀⠀\n" +
            "⠸⠿⠿⠿⠟⠛⠉⠀⢠⡟⠁⠀⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣄⠀⠈⠉⠁⠀⠀⣴⣿⣿⣿⣿⡄⠀⠀⠢⢴⣶⣶⣄⠀⠀⠀⣸⣿⣿⣿⡇⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣇⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣦⣤⣤⣴⣾⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠈⠙⢿⣷⣤⣴⣿⣿⣿⣿⡇⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⢀⣀⣤⣤⣈⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠙⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀\n" +
            "⠀⠀⢀⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⣄⡀⠀⠈⠻⣿⣿⣿⣿⡇⠀⠀⠀⠀\n" +
            "⢠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀⣠⣿⣿⣿⣿⡇⠀⠀⠀⠀\n" +
            "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣼⣿⣿⣿⣿⣿⣇⠀⠀⠀⠀\n" +
            "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀\n" +
            "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣇⠀⠀⠀\n" +
            "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣆⠀⠀\n" +
            "⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀\n" +
            "⠸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧" +
            "\n")
}

fun imprimirAsciiGuerrero (){
    println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣶⣿⣿⣿⣶⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⡄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⢟⣭⣴⣶⡦⠍⠛⣿⣿⣿⣿⣿⠇⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠈⠳⣶⣤⣤⣶⣿⠿⢫⣾⣿⣿⠋⠀⠀⠀⠀⢸⣿⡟⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠈⠉⠉⠉⠁⣰⣿⣿⣿⠇⠀⢀⣀⣤⣴⣾⣧⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⡟⢠⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⣠⣿⣿⣿⡟⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⡀⠀⠀⠀⠀\n" +
            "⠀⠀⢀⣠⣶⣿⣿⡿⠋⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡷⠀⠀⠀⠀\n" +
            "⠉⠛⠛⠛⠛⠛⠉⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣛⣥⣶⣆⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⠏⣥⣤⡙⢟⣫⡴⠿⠿⠿⠷⠿⣷⡀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⡜⢿⡿⢃⣌⢻⣟⠛⠻⠶⠶⢶⣾⣿⡄\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⡄⣾⣿⣿⣷⡝⢿⣷⣶⣶⣦⡾⠟⠁\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣟⣛⣻⠿⠿⢧⢹⣿⣿⣿⣿⣦⡙⢷⡶⠋⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⣝⠻⣿⣿⣛⠷⠌⢿⣿⣿⣿⣿⣿⡆⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣮⣝⠻⣿⣶⣦⣤⣉⠛⠿⢿⠁⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠰⣾⣿⣿⣿⣿⣿⣿⣿⣿⣶⣭⣛⠿⢿⣧⢷⣤⡀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠛⠛⠿⣿⣿⣿⣿⣷⡦⠉⢿⣿⡷⠦⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠻⡿⠋⠀⠀⠈⠀⠀⠀⠀⠀⠀" +
            "\n")
}

fun imprimirAsciiHechicero (){
    println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣤⣤⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣶⠟⠛⠉⠉⠉⠛⠻⢿⣶⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⣍⠻⢿⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢧⣄⠛⢿⣶⣄⣠⡾⣧⡀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣷⣦⡉⠻⣫⣾⡽⣷⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠇⠀⠀⣀⣀⡀⠀⠀⠀⠀⣀⣀⡀⠀⠸⣿⠻⣿⣾⡿⠃⠹⣿⣷⡀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⣿⠟⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠻⣿⣇⠀⠉⠀⠀⠀⠈⠛⠛⠒⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⠃⢀⣀⣠⣤⣤⣤⣤⣤⣤⣤⣤⣤⣤⣀⡀⠘⣿⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣶⡿⠿⠟⠋⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠈⠉⠉⠙⠛⠿⢿⣶⣦⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⢀⣠⣴⣾⠿⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠿⣷⣦⣄⡀⠀⠀⠀⠀\n" +
            "⠀⣀⣴⣾⣿⣛⣁⣤⣤⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣠⣤⣌⣛⣿⣷⣦⣀⠀\n" +
            "⣼⡿⣿⣿⣿⣿⣿⣿⠋⠉⢹⡿⠻⣿⣿⡶⠒⠒⠲⣶⣶⣶⣶⣶⣶⡶⠖⠒⠲⢾⣿⣿⠟⢿⡏⠉⠙⣿⣿⣿⣿⣿⣿⢿⣷\n" +
            "⢹⣷⡙⢿⣿⣿⠾⠍⠁⠀⣾⠇⠀⢻⠀⢈⣻⣷⣶⣤⣤⡽⠟⢯⣤⣤⣴⣾⣿⡁⠀⡟⠀⠘⣷⠀⠈⠩⠷⣿⣿⡿⢋⣾⡟\n" +
            "⠀⠙⢿⣶⣭⣛⡿⠷⠤⣼⠏⢠⢶⣾⠀⠀⠙⠓⢦⣼⣿⡇⠀⢸⣿⣧⣴⠟⠋⠀⠀⣿⡄⡄⠹⣧⠤⠾⠿⣛⣭⣴⡿⠋⠀\n" +
            "⠀⠀⠀⠈⠛⠻⠿⣷⣶⠟⢰⡏⢸⣇⠀⠀⠀⠈⠉⢉⣹⠇⠀⠘⣏⡉⠉⠁⠀⠀⠀⢸⡇⢹⡆⠻⣶⣾⠿⠟⠛⠉⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⢠⡏⢠⡟⠀⣼⣿⣄⠀⠀⠀⡼⠋⠻⠀⠀⠀⠾⠉⢳⡀⠀⠀⣠⣿⣷⠀⢹⡄⢹⣆⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⢀⣟⣠⡿⢀⣼⡇⢹⣝⡷⣤⣼⣳⠴⠛⠳⠤⠔⠛⠦⣞⣷⣤⢴⣫⡟⠸⣷⡀⢿⣄⣻⡀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠸⢋⣿⠁⣼⢹⣆⠀⠉⠛⠛⠉⠁⠀⠀⣀⣿⣄⠀⠀⠀⠉⠛⠛⠉⠀⢠⡏⢧⠀⢿⡝⠇⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⣼⡇⣰⠃⠈⢿⣦⣄⣀⣀⣀⣤⡴⠞⠋⠉⠉⠳⢦⣤⣀⣀⣀⣠⣴⡿⠁⠘⣦⢸⣷⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⢿⣿⡏⢠⠄⢸⣧⠉⠉⢻⣀⣠⡶⠞⠛⠉⠛⠳⢶⣤⣀⡟⠉⠉⢸⡇⠀⡄⢹⡿⠟⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⢸⣡⡏⠀⡄⢿⡀⠀⠀⠛⠉⠀⠀⠀⠀⠀⠀⠀⠉⠛⠁⠀⢀⡿⢡⡀⢹⣬⡇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠸⡿⣇⢸⣿⢸⣷⣼⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣧⣾⡇⣼⣧⣸⢻⡇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣿⠹⣿⡏⡿⣧⣤⠀⠀⠀⠀⠀⠀⠀⠀⠀⣤⣾⣿⠻⣿⠏⢿⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠁⠀⠻⣿⣦⣾⠀⠀⠀⠀⠀⣶⣤⡟⠟⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⢻⣧⡀⠀⠀⣼⡿⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⣦⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀")
}

fun escenario1(guerrero: Guerrero, enemigo: Guerrero) {
    println("Comienza la batalla!\n")

    while (guerrero.obtenerVida() > 0 && enemigo.obtenerVida() > 0) {
        println("Estado actual:")
        println("Tu vida: ${guerrero.obtenerVida()}")
        println("Vida del enemigo: ${enemigo.obtenerVida()}\n")

        // Turno del jugador (guerrero)
        print("Selecciona tu acción (1. Atacar, 2. Poner escudo): ")
        val accionJugador = readLine()?.toIntOrNull() ?: 1

        when (accionJugador) {
            1 -> guerrero.atacar(enemigo)

            2 -> guerrero.ponerEscudo()
            else -> {
                println("Opción no válida. Se realizará un ataque por defecto.")
                guerrero.atacar(enemigo)
            }
        }

        if (enemigo.obtenerVida() <= 0) {
            println("¡Has derrotado al enemigo! ¡Eres un gran guerrero!")
            break
        }

        // Turno del enemigo (guerrero)
        val accionEnemigo = Random.nextInt(1, 3) // 1 para atacar, 2 para poner escudo

        when (accionEnemigo) {
            1 -> {
                println("El enemigo te ataca.\n")
                enemigo.atacar(guerrero)
            }
            2 -> {
                println("El enemigo se pone un escudo." +
                        "         \n" +
                        "   |\\                     /)\n" +
                        " /\\_\\\\__               (_//\n" +
                        "|   `>\\-`     _._       //`)\n" +
                        " \\ /` \\\\  _.-`:::`-._  //\n" +
                        "  `    \\|`    :::    `|/\n" +
                        "        |     :::     |\n" +
                        "        |.....:::.....|\n" +
                        "        |:::::::::::::|\n" +
                        "        |     :::     |\n" +
                        "        \\     :::     /\n" +
                        "         \\    :::    /\n" +
                        "          `-. ::: .-'\n" +
                        "           //`:::`\\\\\n" +
                        "          //   '   \\\\\n" +
                        "         |/         \\\\" +
                        "\n" )
                enemigo.ponerEscudo()
            }
        }

        if (guerrero.obtenerVida() <= 0) {
            println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
            break
        }

        println("\n--- Fin del turno ---\n")
    }
}
