package main

class Hechicero(nombreHechicero:String): Personaje(nombreHechicero) {
    private var magia = 20
    private var fuerza = 12

    fun modificarFuerza(incremento:Int){

        val nuevaMagia = magia+incremento

        if (nuevaMagia > 20){
            magia = 20
        } else if(nuevaMagia < 20){
            magia = 0
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