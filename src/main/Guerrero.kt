package main

class Guerrero(nombreGuerrero:String): Personaje(nombreGuerrero) {
    private var fuerza = 20

    fun modificarFuerza(incremento:Int){
        val nuevaFuerza = fuerza+incremento

        if (nuevaFuerza > 20){
            fuerza = 20
        } else if(nuevaFuerza < 0){
            fuerza = 0
        }else{
            fuerza = nuevaFuerza
        }
    }

    fun atacar(enemigo: Personaje): Boolean {
        if (enemigo.estaProtegido()) {
            enemigo.quitarEscudo()
            return false
        }
        enemigo.modificarVida(-fuerza)
        return true
    }



}