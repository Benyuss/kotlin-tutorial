package delegation

import abstraction.Derived

/**
 * The Delegation pattern has proven to be a good alternative to implementation inheritance,
 * and Kotlin supports it natively requiring zero boilerplate code.
 *
 * Note about delegation: When you want to "copy"/Expose the base class' API, you use inheritance.
 *                        When you only want to "copy" functionality, use delegation.
 *
 * @see "https://stackoverflow.com/questions/832536/when-to-use-delegation-instead-of-inheritance"
 */
fun main(args: Array<String>) {
    val b = BaseImpl(10)
    Derived(b).print() // prints 10
}

interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

/**
 * A class Derived can inherit from an interface Base and delegate all of its public methods to a specified object:
 *
 * The by-clause in the supertype list for Derived indicates that b will be stored internally in objects of Derived
 * and the compiler will generate all the methods of Base that forward to b.
 */
class Derived(b: Base) : Base by b