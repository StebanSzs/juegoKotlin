package main

import kotlin.random.Random

class Escenario {
}
fun escenario1(guerrero: Guerrero, enemigo: Guerrero) {
    println("Comienza la batalla!\n")

    while (guerrero.obtenerVida() > 0.9 && enemigo.obtenerVida() > 0.9) {
        println("Estado actual:")
        println("Tu vida: ${guerrero.obtenerVida()}")
        println("Vida del enemigo: ${enemigo.obtenerVida()}\n")

        print("Selecciona tu acción (1. Atacar, 2. Poner escudo): ")
        val accionJugador = readLine()?.toIntOrNull() ?: 1

        when (accionJugador) {
            1 -> guerrero.atacar(enemigo)
            2 -> guerrero.ponerEscudo()
            else -> guerrero.atacar(enemigo)
        }

        if (enemigo.obtenerVida() < 1) {
            println("¡Has derrotado al enemigo! ¡Eres un gran guerrero!")
            break
        }

        // Verificar empate después de la acción del jugador
        if (guerrero.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        val accionEnemigo = Random.nextInt(1, 3)

        when (accionEnemigo) {
            1 -> enemigo.atacar(guerrero)
            2 -> enemigo.ponerEscudo()
        }

        if (guerrero.obtenerVida() < 1) {
            println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
            break
        }

        // Verificar empate después de la acción del enemigo
        if (guerrero.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        println("\n--- Fin del turno ---\n")
    }
}


fun escenario2(guerrero: Guerrero, enemigo: Hechicero) {
    println("Comienza la batalla!\n")

    while (guerrero.obtenerVida() > 0.9 && enemigo.obtenerVida() > 0.9) {
        println("Estado actual:")
        println("Tu vida: ${guerrero.obtenerVida()}")
        println("Vida del enemigo: ${enemigo.obtenerVida()}\n")

        print("Selecciona tu acción (1. Atacar, 2. Poner escudo): ")
        val accionJugador = readLine()?.toIntOrNull() ?: 1

        when (accionJugador) {
            1 -> guerrero.atacar(enemigo)
            2 -> guerrero.ponerEscudo()
            else -> guerrero.atacar(enemigo)
        }

        if (enemigo.obtenerVida() < 1) {
            println("¡Has derrotado al enemigo! ¡Eres un gran guerrero!")
            break
        }

        // Verificar empate después de la acción del jugador
        if (guerrero.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        val accionEnemigo = Random.nextInt(1, 4)

        when (accionEnemigo) {
            1 -> {
                println("El enemigo te ataca.\n")
                enemigo.atacar(guerrero)
            }
            2 -> {
                println("El enemigo se pone un escudo.\n")
                enemigo.ponerEscudo()
            }
            3 -> {
                println("El enemigo se cura\n")
                enemigo.curarse(enemigo)
            }
        }

        if (guerrero.obtenerVida() < 1) {
            println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
            break
        }

        // Verificar empate después de la acción del enemigo
        if (guerrero.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        println("\n--- Fin del turno ---\n")
    }
}

fun escenario3(guerrero: Guerrero, enemigo: Bruja) {
    println("Comienza la batalla!\n")

    while (guerrero.obtenerVida() > 0.9 && enemigo.obtenerVida() > 0.9) {
        println("Estado actual:")
        println("Tu vida: ${guerrero.obtenerVida()}")
        println("Vida del enemigo: ${enemigo.obtenerVida()}\n")

        print("Selecciona tu acción (1. Atacar, 2. Poner escudo): ")
        val accionJugador = readLine()?.toIntOrNull() ?: 1

        when (accionJugador) {
            1 -> guerrero.atacar(enemigo)
            2 -> guerrero.ponerEscudo()
            else -> guerrero.atacar(enemigo)
        }

        // Verificar empate después de la acción del jugador
        if (guerrero.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        if (enemigo.obtenerVida() < 1) {
            println("¡Has derrotado al enemigo! ¡Eres un gran guerrero!")
            break
        }

        val accionEnemigo = Random.nextInt(1, 4)

        when (accionEnemigo) {
            1 -> {
                println("El enemigo te ataca.\n")
                enemigo.atacar(guerrero)
            }
            2 -> {
                println("El enemigo se pone un escudo.\n")
                enemigo.ponerEscudo()
            }
            3 -> {
                println("El enemigo te tira veneno\n")
                enemigo.veneno(enemigo, guerrero)
            }
        }

        // Verificar empate después de la acción del enemigo
        if (guerrero.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        if (guerrero.obtenerVida() < 1) {
            println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
            break
        }

        println("\n--- Fin del turno ---\n")
    }
}

fun escenario4(hechicero: Hechicero, enemigo: Guerrero) {
    println("Comienza la batalla!\n")

    while (hechicero.obtenerVida() > 0.9 && enemigo.obtenerVida() > 0.9) {
        println("Estado actual:")
        println("Tu vida: ${hechicero.obtenerVida()}")
        println("Vida del enemigo: ${enemigo.obtenerVida()}\n")

        print("Selecciona tu acción (1. Atacar, 2. Poner escudo, 3. Curarse): ")
        val accionJugador = readLine()?.toIntOrNull() ?: 1

        when (accionJugador) {
            1 -> hechicero.atacar(enemigo)
            2 -> hechicero.ponerEscudo()
            3 -> hechicero.curarse(hechicero)
            else -> hechicero.atacar(enemigo)
        }

        if (enemigo.obtenerVida() < 1) {
            println("¡Has derrotado al enemigo! ¡Eres un gran hechicero!")
            break
        }

        val accionEnemigo = Random.nextInt(1, 3)

        when (accionEnemigo) {
            1 -> {
                println("El enemigo te ataca.\n")
                imprimirAsciiAtacarGuerrero()
                enemigo.atacar(hechicero)
            }
            2 -> {
                println("El enemigo se pone un escudo.\n")
                imprimirAsciiEscudo()
                enemigo.ponerEscudo()
            }
        }

        if (hechicero.obtenerVida() < 1) {
            println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
            break
        }

        // Verificar empate después de la acción del enemigo
        if (hechicero.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        println("\n--- Fin del turno ---\n")
    }
}


fun escenario5(hechicero: Hechicero, enemigo: Hechicero) {
    println("Comienza la batalla!\n")

    while (hechicero.obtenerVida() > 0.9 && enemigo.obtenerVida() > 0.9) {
        println("Estado actual:")
        println("Tu vida: ${hechicero.obtenerVida()}")
        println("Vida del enemigo: ${enemigo.obtenerVida()}\n")

        print("Selecciona tu acción (1. Atacar, 2. Poner escudo, 3. Curarse): ")
        val accionJugador = readLine()?.toIntOrNull() ?: 1

        when (accionJugador) {
            1 -> hechicero.atacar(enemigo)
            2 -> hechicero.ponerEscudo()
            3 -> hechicero.curarse(hechicero)
            else -> hechicero.atacar(enemigo)
        }

        if (enemigo.obtenerVida() < 1) {
            println("¡Has derrotado al enemigo! ¡Eres un gran hechicero!")
            break
        }

        val accionEnemigo = Random.nextInt(1, 4)

        when (accionEnemigo) {
            1 -> {
                println("El enemigo te ataca.\n")
                imprimirAsciiAtacarHechicero()
                enemigo.atacar(hechicero)
            }
            2 -> {
                println("El enemigo se pone un escudo.\n")
                imprimirAsciiEscudo()
                enemigo.ponerEscudo()
            }
            3 -> {
                println("El enemigo se cura\n")
                imprimirAsciiPotion()
                enemigo.curarse(enemigo)
            }
        }

        if (hechicero.obtenerVida() < 1) {
            println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
            break
        }

        // Verificar empate después de la acción del enemigo
        if (hechicero.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        println("\n--- Fin del turno ---\n")
    }
}


fun escenario6(hechicero: Hechicero, enemigo: Bruja) {
    println("Comienza la batalla!\n")

    while (hechicero.obtenerVida() > 0.9 && enemigo.obtenerVida() > 0.9) {
        println("Estado actual:")
        println("Tu vida: ${hechicero.obtenerVida()}")
        println("Vida del enemigo: ${enemigo.obtenerVida()}\n")

        print("Selecciona tu acción (1. Atacar, 2. Poner escudo, 3. Curarse): ")
        val accionJugador = readLine()?.toIntOrNull() ?: 1

        when (accionJugador) {
            1 -> hechicero.atacar(enemigo)
            2 -> hechicero.ponerEscudo()
            3 -> hechicero.curarse(hechicero)
            else -> hechicero.atacar(enemigo)
        }

        // Verificar empate después de la acción del jugador
        if (hechicero.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        if (enemigo.obtenerVida() < 1) {
            println("¡Has derrotado al enemigo! ¡Eres un gran hechicero!")
            break
        }

        val accionEnemigo = Random.nextInt(1, 4)

        when (accionEnemigo) {
            1 -> {
                println("El enemigo te ataca.\n")
                imprimirAsciiAtacarBruja()
                enemigo.atacar(hechicero)
            }
            2 -> {
                println("El enemigo se pone un escudo.\n")
                imprimirAsciiEscudo()
                enemigo.ponerEscudo()
            }
            3 -> {
                println("El enemigo te tira veneno\n")
                imprimirAsciiVeneno()
                enemigo.veneno(enemigo, hechicero)
            }
        }

        // Verificar empate después de la acción del enemigo
        if (hechicero.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        if (hechicero.obtenerVida() < 1) {
            println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
            break
        }

        println("\n--- Fin del turno ---\n")
    }
}


fun escenario7(bruja: Bruja, enemigo: Guerrero) {
    println("Comienza la batalla!\n")

    while (bruja.obtenerVida() > 0.9 && enemigo.obtenerVida() > 0.9) {
        println("Estado actual:")
        println("Tu vida: ${bruja.obtenerVida()}")
        println("Vida del enemigo: ${enemigo.obtenerVida()}\n")

        print("Selecciona tu acción (1. Atacar, 2. Poner escudo, 3. Tirar veneno): ")
        val accionJugador = readLine()?.toIntOrNull() ?: 1

        when (accionJugador) {
            1 -> bruja.atacar(enemigo)
            2 -> bruja.ponerEscudo()
            3 -> bruja.veneno(bruja, enemigo)
            else -> bruja.atacar(enemigo)
        }

        if (enemigo.obtenerVida() < 1) {
            println("¡Has derrotado al enemigo! ¡Eres un gran hechicero!")
            break
        }

        val accionEnemigo = Random.nextInt(1, 3)

        when (accionEnemigo) {
            1 -> {
                println("El enemigo te ataca.\n")
                imprimirAsciiAtacarBruja()
                enemigo.atacar(bruja)
            }
            2 -> {
                println("El enemigo se pone un escudo.\n")
                imprimirAsciiEscudo()
                enemigo.ponerEscudo()
            }

        }

        if (bruja.obtenerVida() < 1) {
            println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
            break
        }

        // Verificar empate después de la acción del enemigo
        if (bruja.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        println("\n--- Fin del turno ---\n")
    }
}


fun escenario8(bruja: Bruja, enemigo: Hechicero) {
    println("Comienza la batalla!\n")

    while (bruja.obtenerVida() > 0.9 && enemigo.obtenerVida() > 0.9) {
        println("Estado actual:")
        println("Tu vida: ${bruja.obtenerVida()}")
        println("Vida del enemigo: ${enemigo.obtenerVida()}\n")

        print("Selecciona tu acción (1. Atacar, 2. Poner escudo, 3. Veneno): ")
        val accionJugador = readLine()?.toIntOrNull() ?: 1

        when (accionJugador) {
            1 -> bruja.atacar(enemigo)
            2 -> bruja.ponerEscudo()
            3 -> bruja.veneno(bruja, enemigo)
            else -> bruja.atacar(enemigo)
        }

        if (enemigo.obtenerVida() < 1) {
            println("¡Has derrotado al enemigo! ¡Eres una gran bruja!")
            break
        }

        val accionEnemigo = Random.nextInt(1, 4)

        when (accionEnemigo) {
            1 -> {
                println("El enemigo te ataca.\n")
                imprimirAsciiAtacarHechicero()
                enemigo.atacar(bruja)
            }
            2 -> {
                println("El enemigo se pone un escudo.\n")
                imprimirAsciiEscudo()
                enemigo.ponerEscudo()
            }
            3 -> {
                println("El enemigo se cura\n")
                imprimirAsciiPotion()
                enemigo.curarse(enemigo)
            }
        }

        if (bruja.obtenerVida() < 1) {
            println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
            break
        }

        // Verificar empate después de la acción del enemigo
        if (bruja.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        println("\n--- Fin del turno ---\n")
    }
}


fun escenario9(bruja: Bruja, enemigo: Bruja) {
    println("Comienza la batalla!\n")

    while (bruja.obtenerVida() > 0.9 && enemigo.obtenerVida() > 0.9) {
        println("Estado actual:")
        println("Tu vida: ${bruja.obtenerVida()}")
        println("Vida del enemigo: ${enemigo.obtenerVida()}\n")

        print("Selecciona tu acción (1. Atacar, 2. Poner escudo, 3. Veneno): ")
        val accionJugador = readLine()?.toIntOrNull() ?: 1

        when (accionJugador) {
            1 -> bruja.atacar(enemigo)
            2 -> bruja.ponerEscudo()
            3 -> bruja.veneno(bruja, enemigo)
            else -> bruja.atacar(enemigo)
        }

        // Verificar empate después de la acción del jugador
        if (bruja.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        if (enemigo.obtenerVida() < 1) {
            println("¡Has derrotado al enemigo! ¡Eres una gran bruja!")
            break
        }

        val accionEnemigo = Random.nextInt(1, 4)

        when (accionEnemigo) {
            1 -> {
                println("El enemigo te ataca.\n")
                imprimirAsciiAtacarBruja()
                enemigo.atacar(bruja)
            }
            2 -> {
                println("El enemigo se pone un escudo.\n")
                imprimirAsciiEscudo()
                enemigo.ponerEscudo()
            }
            3 -> {
                println("El enemigo te tira veneno\n")
                imprimirAsciiVeneno()
                enemigo.veneno(enemigo, bruja)
            }
        }

        // Verificar empate después de la acción del enemigo
        if (bruja.obtenerVida() < 1 && enemigo.obtenerVida() < 1) {
            println("¡Ambos han muerto! ¡Es un empate!")
            break
        }

        if (bruja.obtenerVida() < 1) {
            println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
            break
        }

        println("\n--- Fin del turno ---\n")
    }
}








