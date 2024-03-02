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

    fun veneno(personaje:Bruja, enemigo: Personaje){
        val vidaEnemigo = enemigo.obtenerVida()
        val veneno = vidaEnemigo / 4
        enemigo.modificarVida(veneno)
        personaje.modificarVida(-10)
    }
}