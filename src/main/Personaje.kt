package main

abstract class Personaje (val nombre:String){
    private var vida:Float = 100F
    private var escudo:Boolean= false
    private var resistencia:Int = 100
    private var posX:Int = 0
    private var posY:Int = 0
    private var fuerza:Int = 0

    fun transportar (destinoX:Int,destinoY:Int){
        posX = destinoX
        posY = destinoY
    }

    fun moverEnX(distancia:Int){
        posX += distancia
    }

    fun moverEnY(distancia:Int){
        posY += distancia
    }

    fun modificarVida(incremento:Float){
        val nuevaVida = vida+incremento

        if (nuevaVida > 100){
            vida = 100F
        } else if(nuevaVida < 0){
            vida = 0F
        }else{
            vida = nuevaVida
        }
    }

    fun quitarEscudo (){
        escudo = false
    }

    fun ponerEscudo(){
        escudo = true
    }

    fun imprimirPersonaje():String{
        return "nombre: $nombre, vida: $vida, escudo: $escudo" +
                " posicion: $posX, $posY"
    }

    fun estaProtegido():Boolean{
        return escudo
    }

    fun obtenerVida(): Float {
        return vida
    }

}