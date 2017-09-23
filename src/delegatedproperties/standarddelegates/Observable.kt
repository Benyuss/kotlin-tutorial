package delegatedproperties.standarddelegates

import kotlin.properties.Delegates

/**
 * @see "https://kotlinlang.org/docs/reference/delegated-properties.html#observable"
 */
fun main(args: Array<String>) {
    val user = User()
    user.name = "first"
    user.name = "second"
}

/**
 * [Delegates.observable] takes two arguments: the initial value and a handler for modifications.
 * The handler gets called every time we assign to the property (after the assignment has been performed).
 * It has three parameters: a property being assigned to, the old value and the new one:
 */
class User {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }
}