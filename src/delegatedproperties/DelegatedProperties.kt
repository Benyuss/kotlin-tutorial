package delegatedproperties

import kotlin.reflect.KProperty

/**
 * There are certain common kinds of properties, that, though we can implement them manually every time we need them,
 * would be very nice to implement once and for all, and put into a library. Examples include:
 *
 * -lazy properties: the value gets computed only upon first access;
 * -observable properties: listeners get notified about changes to this property;
 * -storing properties in a map, instead of a separate field for each property.
 *
 * @see "https://kotlinlang.org/docs/reference/delegated-properties.html"
 */
fun main(args: Array<String>) {
    val e = Example()
    e.p = "LOL"
    println(e.p)
}

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name} in $thisRef.'")
    }
}