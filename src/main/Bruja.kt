package main

class Bruja(nombreBruja:String): Personaje(nombreBruja) {
    private var poder = 15

    fun atacar(enemigo: Personaje): Boolean {
        if (enemigo.estaProtegido()) {
            enemigo.quitarEscudo()
            return false
        }
        enemigo.modificarVida(-poder)
        enemigo.quitarEscudo()
        return true
    }
}