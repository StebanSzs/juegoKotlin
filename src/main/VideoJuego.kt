package main
import kotlin.random.Random

fun main() {

    var selecPersonaje: Int? = 1
    var selecEnemigo: Int? = 1

    imprimirSaludo()

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

        val guerrero = Guerrero(nombre)
        val enemigo = Hechicero("Enemigo")

        escenario2(guerrero, enemigo)

    }else if (selecPersonaje == 1 && selecEnemigo == 3){
        println("Has seleccionado al Guerrero")
        println("Tu enemigo es la Bruja")

        val guerrero = Guerrero(nombre)
        val enemigo = Bruja("Enemigo")

        escenario3(guerrero, enemigo)

    }else if (selecPersonaje == 2 && selecEnemigo == 1){
        println("Has seleccionado al Hechicero")
        println("Tu enemigo es el Guerrero")

        val hechicero = Hechicero(nombre)
        val enemigo = Guerrero("Enemigo")

        //escenario4(hechicero, enemigo)

    }else if (selecPersonaje == 2 && selecEnemigo == 2){
        println("Has seleccionado al Hechicero")
        println("Tu enemigo es el Hechicero")

        val hechicero = Hechicero(nombre)
        val enemigo = Hechicero("Enemigo")

        //escenario5(hechicero, enemigo)

    }else if (selecPersonaje == 2 && selecEnemigo == 3){
        println("Has seleccionado al Hechicero")
        println("Tu enemigo es la Bruja")

        val hechicero = Hechicero(nombre)
        val enemigo = Bruja("Enemigo")

        //escenario6(hechicero, enemigo)

    }else if (selecPersonaje == 3 && selecEnemigo == 1){
        println("Has seleccionado a la Bruja")
        println("Tu enemigo es el Guerrero")

        val bruja = Bruja(nombre)
        val enemigo = Guerrero("Enemigo")

        //escenario7(bruja, enemigo)

    }else if (selecPersonaje == 3 && selecEnemigo == 2){
        println("Has seleccionado a la Bruja")
        println("Tu enemigo es el Hechicero")

        val bruja = Bruja(nombre)
        val enemigo = Hechicero("Enemigo")

        //escenario8(bruja, enemigo)

    }else if (selecPersonaje == 3 && selecEnemigo == 3){
        println("Has seleccionado a la Bruja")
        println("Tu enemigo es la Bruja")

        val bruja = Bruja(nombre)
        val enemigo = Bruja("Enemigo")

        //escenario9(bruja, enemigo)

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

