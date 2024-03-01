package main.kotlin.videoJuego

import main.Bruja

fun main() {
    println("***** Inicio del juego Telelocos*****")
    println()
    println()

    val guerrero1=Guerrero("Atreyu")
    val hechizero1 = Hechizero("Merlin")
    val guerrero2=Guerrero("Goku")
    val hechizero2 = Hechizero("Diablo")
    val bruja1 = Bruja("Grenilda")

    guerrero1.atacar(guerrero2)
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

}