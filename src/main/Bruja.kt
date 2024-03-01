package main

class Bruja(nombreBruja:String): Personaje(nombreBruja) {
    private var poder = 10
    fun atacar (enemigo: Personaje):String{
        enemigo.modificarVida(-poder)
        return "Bruja a atacado a $enemigo"
    }
}