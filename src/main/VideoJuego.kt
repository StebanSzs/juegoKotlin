package main

fun main() {
    println("***** Inicio del juego Telelocos *****")
    println()
    println()

    val personajes = listOf(Guerrero("Atreyu"), Hechizero("Merlin"), Guerrero("Goku"), Hechizero("Diablo"), Bruja("Grenilda"))

    println("***** Selecciona una opción *****")
    imprimirOpciones("Opciones", listOf("Iniciar juego", "Instrucciones", "Salir"))

    val opcion = readLine()?.toIntOrNull() ?: 0

    when (opcion) {
        1 -> println("Seleccionaste el personaje guerrero")
        2 -> println("Seleccionaste el personaje Hechizero")
        3 -> println("Seleccionaste el personaje Bruja")
        else -> println("Opción no válida")
    }

    println("***** Selecciona un personaje *****")
    val personajeSeleccionado = seleccionarPersonaje("Personajes")

    when (personajeSeleccionado) {
        is Guerrero -> println("Seleccionaste el personaje Guerrero")
        is Hechizero -> println("Seleccionaste el personaje Hechizero")
        is Bruja -> println("Seleccionaste el personaje Bruja")
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
fun imprimirOpciones(titulo: String, opciones: List<String>) {
    println("***** $titulo *****")
    println()
    opciones.forEachIndexed { index, opcion ->
        println("${index + 1}. $opcion")
    }
}

fun seleccionarPersonaje(titulo: String): Personaje? {
    imprimirOpciones(titulo, personajes.map { it.nombre })
    val seleccion = readLine()?.toIntOrNull()
    return personajes.getOrNull(seleccion?.minus(1) ?: -1)
}
