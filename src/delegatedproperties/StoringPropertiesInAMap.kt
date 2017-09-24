package delegatedproperties

/**
 * One common use case is storing the values of properties in a map.
 * This comes up often in applications like parsing JSON or doing other “dynamic” things.
 * In this case, you can use the map instance itself as the delegate for a delegated property.
 *
 * @see "https://kotlinlang.org/docs/reference/delegated-properties.html#storing-properties-in-a-map"
 */
fun main(args: Array<String>) {
    println(user.name) // Prints "John Doe"
    println(user.age)  // Prints 25
}

val user = User(mapOf("name" to "John Doe", "age"  to 25))

class User(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}