package main

class Bruja(nombreBruja:String): Personaje(nombreBruja) {
    private var poder = 15F

    fun atacar(enemigo: Personaje): Boolean {
        if (enemigo.estaProtegido()) {
            enemigo.quitarEscudo()
            return false
        }
        enemigo.modificarVida(-poder)
        enemigo.quitarEscudo()
        return true
    }

    fun veneno(personaje:Personaje, enemigo: Personaje){
        val vidaEnemigo = enemigo.obtenerVida()
        val veneno = vidaEnemigo / 3
        enemigo.modificarVida(-veneno)
        personaje.modificarVida(-veneno/2)
    }
}