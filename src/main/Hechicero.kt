package main

class Hechicero(nombreHechicero:String): Personaje(nombreHechicero) {
    private var magia = 10

    fun modificarFuerza(incremento:Int){

        val nuevaMagia = magia+incremento

        if (nuevaMagia > 10){
            magia = 10
        } else if(nuevaMagia < 0){
            magia = 0
        }else{
            magia = nuevaMagia
        }
    }

    fun curar(amigo: Personaje){
        amigo.modificarVida(magia)
    }
}