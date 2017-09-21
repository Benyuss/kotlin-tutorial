package enums

fun main(args: Array<String>) {
    val colorEnum = Color.BLUE
    println("${colorEnum.rgb.toString(16)}\ndescr: ${colorEnum.description}")

    val directionEnum = Direction.NORTH
    println(directionEnum)

    val protocolState = ProtocolState.TALKING
    println(protocolState.signal())

    for (i in Color.values()) {
        print("$i ")
    }
    println()

    println(Color.valueOf(colorEnum.name))

    printAllValues<RGB>() // prints RED, GREEN, BLUE
}

enum class Color(val rgb: Int, val description: String) {
    RED(0xFF0000, "red color"),
    GREEN(0x00FF00, "green color"),
    BLUE(0x0000FF, "blue color")
}

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

enum class RGB { RED, GREEN, BLUE }

inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
}