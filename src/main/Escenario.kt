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

            // Turno del jugador (guerrero)
            print("Selecciona tu acción (1. Atacar, 2. Poner escudo): ")
            val accionJugador = readLine()?.toIntOrNull() ?: 1

            when (accionJugador) {
                1 -> guerrero.atacar(enemigo)

                2 -> guerrero.ponerEscudo()
                else -> {
                    println("Opción no válida. Se realizará un ataque por defecto.")
                    guerrero.atacar(enemigo)
                }
            }

            if (enemigo.obtenerVida() < 1) {
                println("¡Has derrotado al enemigo! ¡Eres un gran guerrero!")
                break
            }

            // Turno del enemigo (guerrero)
            val accionEnemigo = Random.nextInt(1, 3) // 1 para atacar, 2 para poner escudo

            when (accionEnemigo) {
                1 -> {
                    println("El enemigo te ataca.\n")
                    enemigo.atacar(guerrero)
                }
                2 -> {
                    println("El enemigo se pone un escudo.\n")
                    imprimirAsciiEscudo()
                    enemigo.ponerEscudo()
                }
            }

            if (guerrero.obtenerVida() < 1) {
                println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
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

            // Turno del jugador (guerrero)
            print("Selecciona tu acción (1. Atacar, 2. Poner escudo): ")
            val accionJugador = readLine()?.toIntOrNull() ?: 1

            when (accionJugador) {
                1 -> guerrero.atacar(enemigo)

                2 -> guerrero.ponerEscudo()
                else -> {
                    println("Opción no válida. Se realizará un ataque por defecto.")
                    guerrero.atacar(enemigo)
                }
            }

            if (enemigo.obtenerVida() < 1) {
                println("¡Has derrotado al enemigo! ¡Eres un gran guerrero!")
                break
            }

            // Turno del enemigo (Hechicero)
            val accionEnemigo = Random.nextInt(1, 4) // 1 para atacar, 2 para poner escudo

            when (accionEnemigo) {
                1 -> {
                    println("El enemigo te ataca.\n")
                    imprimirAsciiAtacarHechicero()
                    enemigo.atacar(guerrero)
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

            if (guerrero.obtenerVida() < 1) {
                println("¡Has sido derrotado por el enemigo! ¡Mejor suerte la próxima vez!")
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

        // Turno del jugador (guerrero)
        print("Selecciona tu acción (1. Atacar, 2. Poner escudo): ")
        val accionJugador = readLine()?.toIntOrNull() ?: 1

        when (accionJugador) {
            1 -> guerrero.atacar(enemigo)

            2 -> guerrero.ponerEscudo()
            else -> {
                println("Opción no válida. Se realizará un ataque por defecto.")
                guerrero.atacar(enemigo)
            }
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

        // Turno del enemigo (Bruja)
        val accionEnemigo = Random.nextInt(1, 4) // 1 para atacar, 2 para poner escudo

        when (accionEnemigo) {
            1 -> {
                println("El enemigo te ataca.\n")
                imprimirAsciiAtacarBruja()
                enemigo.atacar(guerrero)
            }

            2 -> {
                println("El enemigo se pone un escudo.\n")
                imprimirAsciiEscudo()
                enemigo.ponerEscudo()
            }

            3 -> {
                println("El enemigo te tira veneno\n")
                imprimirAsciiVeneno()
                enemigo.veneno(enemigo, guerrero)
            }
        }

        // Verificar empate después de la acción del enemigo
        if (guerrero.obtenerVida() <  1 && enemigo.obtenerVida() < 1) {
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


