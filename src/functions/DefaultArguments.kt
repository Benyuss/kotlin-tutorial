package functions

fun main(args: Array<String>) {
    read(b = arrayOf<Byte>(1,127), len = 8) // We can omit parameters with default values, or "override" them!
}

/**
 * Function parameters can have default values, which are used when a corresponding argument is omitted.
 * This allows for a reduced number of overloads compared to other languages:
 */
fun read(b: Array<Byte>, off: Int = 0, len: Int = b.size) {
    //...
}
