package main

class Guerrero(nombreGuerrero:String): Personaje(nombreGuerrero) {
    private var fuerza = 10

    fun modificarFuerza(incremento:Int){
        val nuevaFuerza = fuerza+incremento

        if (nuevaFuerza > 10){
            fuerza = 10
        } else if(nuevaFuerza < 0){
            fuerza = 0
        }else{
            fuerza = nuevaFuerza
        }
    }

    fun atacar (enemigo: Personaje):Boolean{
        if (enemigo.estaProtegido())
            return false
        enemigo.modificarVida(-fuerza)
        return true
    }
}