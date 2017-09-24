package functions

fun main(args: Array<String>) {
    foo(baz = 1) // The default value bar = 0 is used

    foo(1) { println("hello") } // Uses the default value baz = 1
    foo { println("hello") }    // Uses both default values bar = 0 and baz = 1
}

/**
 * If a default parameter precedes a parameter with no default value,
 * the default value can be used only by calling the function with named arguments:
 */
fun foo(bar: Int = 0, baz: Int) { /* ... */ }

/**
 * But if a last argument lambda is passed to a function call outside the parentheses,
 * passing no values for the default parameters is allowed:
 */
fun foo(bar: Int = 0, baz: Int = 1, qux: () -> Unit) { qux.invoke() }