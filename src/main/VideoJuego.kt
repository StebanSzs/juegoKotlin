package main.kotlin.videoJuego
fun main() {
    println("***** Inicio del juego Telelocos*****")
    println()
    println()

    val guerrero1=Guerrero("Atreyu")
    val hechizero1 = Hechizero("Merlin")
    val guerrero2=Guerrero("Goku")
    val hechizero2 = Hechizero("Diablo")

    guerrero1.atacar(guerrero2)
    guerrero1.atacar(guerrero2)
    println("Despues de el ataque")
    println(guerrero2.imprimirPersonaje())
    hechizero2.curar(guerrero2)
    println("Despues de curar")
    println(guerrero2.imprimirPersonaje())
}