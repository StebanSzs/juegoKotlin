package main

class Hechicero(nombreHechicero:String): Personaje(nombreHechicero) {
    private var magia = 20F
    private var fuerza = 12F

    fun modificarFuerza(incremento:Int){

        val nuevaMagia = magia+incremento

        if (nuevaMagia > 20){
            magia = 20F
        } else if(nuevaMagia < 20){
            magia = 0F
        }else{
            magia = nuevaMagia
        }
    }

    fun curarse(personaje: Hechicero){
        personaje.modificarVida(magia)
    }

    fun atacar(enemigo: Personaje): Boolean {
        if (enemigo.estaProtegido()) {
            enemigo.quitarEscudo()
            return false
        }
        enemigo.modificarVida(-fuerza)
        enemigo.quitarEscudo()
        return true
    }
}