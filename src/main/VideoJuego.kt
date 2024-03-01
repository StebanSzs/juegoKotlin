package main

fun main() {

    println("**************************************")
    println("***** Inicio del juego Telelocos *****")
    println("**************************************")

    print("\nIngresa tu nombre: ")
    val nombre = readLine()
    println()

    var opcion: Int?

    do {
        imprimirMenuOpciones()
        opcion = readLine()?.toIntOrNull()

        when (opcion) {
            1 -> println("Bienvenido ${nombre.uppercase()} Al juego de los Telelocos\n")
            2 -> println("Seleccionaste el personaje Hechizero\n")
            3 -> println("Seleccionaste el personaje Bruja\n")
            else -> println("Opción no válida\n")
        }

    } while (opcion !in 1..3)

    var selecPersonaje: Int?

    do {
        imprimirTuPersonaje()
        selecPersonaje = readLine()?.toIntOrNull()

        when (selecPersonaje) {
            1 -> println("Seleccionaste el personaje guerrero\n")
            2 -> println("Seleccionaste el personaje Hechizero\n")
            3 -> imprimirAsciiBruja()
            else -> println("Opción no válida\n")
        }

    } while (selecPersonaje !in 1..3)

    var selecEnemigo: Int?

    do {
        imprimirTuEnemigo()
        selecEnemigo = readLine()?.toIntOrNull()

        when (selecEnemigo) {
            1 -> println("Tu enemigo es el personaje guerrero")
            2 -> println("Tu enemigo es el personaje Hechizero")
            3 -> println("Tu enemigo es el personaje Bruja")
            else -> println("Opción no válida\n")
        }

    } while (selecEnemigo !in 1..3)


    /* guerrero1.atacar(guerrero2)
     guerrero1.atacar(guerrero2)
     println("${guerrero1.nombre} Ataca a ${guerrero2.nombre}")
     println(guerrero2.imprimirPersonaje())

     hechizero2.curar(guerrero2)
     println("${hechizero2.nombre} Cura a ${guerrero2.nombre}")
     println(guerrero2.imprimirPersonaje())

     guerrero2.atacar(guerrero1)
     println(guerrero1.imprimirPersonaje())

     bruja1.atacar(guerrero1)
     println(guerrero1.imprimirPersonaje())
 */
}
fun imprimirMenuOpciones() {
    println("***** Selecciona una opción *****")
    println()
    println("1. Iniciar juego")
    println("2. Instrucciones")
    println("3. Salir")
}

fun imprimirTuPersonaje() {
    println("***** Selecciona un personaje *****")
    println()
    println("1. Guerrero")
    println("2. Hechizero")
    println("3. Bruja")
}

fun imprimirTuEnemigo() {
    println("***** Selecciona un enemigo *****")
    println()
    println("1. Guerrero")
    println("2. Hechizero")
    println("3. Bruja")
}

fun imprimirAsciiBruja(){
    println("Seleccionaste el personaje Bruja\n" +
            "|||||||||||||||||||||||\n" +
            "    |||||||||||||||||||||||\n" +
            "    |||||||||||||||||||||||\n" +
            "    |||||||||||||||||||||||\n" +
            "    ||||||||||||||||||||||| _._\n" +
            "    |||||||||||||||||||||||/  _`\\\n" +
            "    ||||||||||||||||||||||;  /  `\n" +
            "    |||||||||||||||||||||/   |\n" +
            "    ||||||||||||||||||||/     \\\n" +
            "    |||||||||||||||||||/       ;\n" +
            "    |=================;        |\n" +
            "    |                 |         \\\n" +
            "    ;-----------------;          \\\n" +
            "    \\\\\\||||||||||||||/           `\\\n" +
            "     \\\\\\||||||||||||/              '.\n" +
            "      ':\\\\||||||||.'                 `\\\n" +
            "        `-=;;||||/                     \\\n" +
            "             _|_/_                      ;\n" +
            "     __.--\"\"`     ``'-.                 |\n" +
            "     '.______          `'-._            \\\n" +
            "            /```--.._       '._          |\n" +
            "            | )))    `-.       `'._      \\\n" +
            "            |/_\\`'.     `;-.       '._    ;\n" +
            "            _)o/_.'       \\\\\\-.       '.  |\n" +
            "          .'               \\\\\\\\\\;_      '.|\n" +
            "        _/                 )))))));-._    ``'--._,\n" +
            "      (`                  ////////////;-..._____.'\n" +
            "       \\__.-._)          ((((((((((((((((((\\,\n" +
            "             \\            \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\,\n" +
            "             (__.-'        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" +
            "              (_.           )))))))))))))))))))))\n" +
            "               | `\\        (((((((((((((((((((((\n" +
            "               |  |\\        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" +
            "               |  | '.__     \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" +
            "               |  |     '.__/ )))))))))))))))))))))\n" +
            "               |  |        ) (((((((((((((((((((((\n" +
            "               |  |      .'   \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\" +
            "\n")
}