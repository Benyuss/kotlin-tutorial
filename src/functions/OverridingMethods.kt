package functions

import objects.foo

fun main(args: Array<String>) {
    foo() // No arguments were passed, so default value for i is 10!
}

open class A {
    open fun foo(i: Int = 10) { /*...*/ }
}

/**
 * Overriding methods always use the same default parameter values as the base method.
 * When overriding a method with default parameters values, the default parameter values must be omitted from the signature:
 */
class B : A() {
    override fun foo(i: Int) { /*...*/ }  // no default value allowed
}