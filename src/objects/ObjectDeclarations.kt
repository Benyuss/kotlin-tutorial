package objects

/**
 * Object declaration aka singleton.
 *
 * Object declarations are initialized lazily, when accessed for the first time.
 */
fun main(args: Array<String>) {
    SignalGeneration.signal("SOFT")
    println(SignalGeneration.typeOfSignal)

    // singleton test
    SignalGeneration.typeOfSignal = "asd"
    println(SignalGeneration.typeOfSignal)  // prints asd

    val obj = SignalGeneration
    SignalGeneration.typeOfSignal = "changed"
    println(obj.typeOfSignal)  // prints changed

    val generatorObj = Generator(name = "Hahaa")
    println(generatorObj.version) // prints 1
}

/**
 * This is a singleton class. It holds the same value in every scope, and cannot be instantiated!
 */
object SignalGeneration : Generator(name = "The Big Machine") {
    fun signal(kindOfSignal: String) {
        println("signaled: $kindOfSignal")
    }

    var typeOfSignal: String = "V2.0"
        get() = field
        set(value) {
            field = value
        }
}

/**
 * This is just an example class to illustrate that singleton object declarations can also extend other classes.
 */
open class Generator constructor(val version: Int) {
    constructor(name: String) : this(1)

    val type = "BG_V11.0"
}