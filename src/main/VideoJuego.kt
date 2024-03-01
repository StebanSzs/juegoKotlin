package main

fun main() {
    println("***** Inicio del juego Telelocos *****")
    println()
    println()

    val guerrero1=Guerrero("Atreyu")
    val hechizero1 = Hechizero("Merlin")
    val guerrero2=Guerrero("Goku")
    val hechizero2 = Hechizero("Diablo")
    val bruja1 = Bruja("Grenilda")

    println("***** Selecciona una opción *****")
    println()
    println("1. Iniciar juego")
    println("2. Instrucciones")
    println("3. Salir")

    val opcion = readLine()?.toIntOrNull()

    when (opcion) {
        1 -> println("Seleccionaste el personaje guerrero")

        2 -> println("Seleccionaste el personaje Hechizero")

        3 -> println("Seleccionaste el personaje Bruja")

        else -> println("Opción no válida")
    }

    println("***** Selecciona un personaje *****")
    println()
    println("1. Guerrero")
    println("2. Hechizero")
    println("3. Bruja")


    val selecPersonaje = readLine()?.toIntOrNull()

    when (selecPersonaje) {
        1 -> println("Seleccionaste el personaje guerrero")

        2 -> println("Seleccionaste el personaje Hechizero")

        3 -> println("Seleccionaste el personaje Bruja")

        else -> println("Opción no válida")
    }


    /* guerrero1.atacar(guerrero2)
     guerrero1.atacar(guerrero2)
     println("${guerrero1.nombre} Ataca a ${guerrero2.nombre}")
     println(guerrero2.imprimirPersonaje())

     hechizero2.curar(guerrero2)
     println("${hechizero2.nombre} Cura a ${guerrero2.nombre}")
     println(guerrero2.imprimirPersonaje())

     guerrero2.atacar(guerrero1)
     println(guerrero1.imprimirPersonaje())

     bruja1.atacar(guerrero1)
     println(guerrero1.imprimirPersonaje())
 */
}