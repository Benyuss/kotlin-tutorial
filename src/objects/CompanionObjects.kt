package objects

/**
 * An object declaration inside a class can be marked with the companion keyword.
 *
 * A companion object is initialized when the corresponding class is loaded (resolved), matching the semantics of a Java static initializer.
 */
fun main(args: Array<String>) {

    // Members of the companion object can be called by using simply the class name as the qualifier:
    val instance = MyClass.create()

    val x = MyClass2.Companion.x
}

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

// The name of the companion object can be omitted, in which case the name Companion will be used:
class MyClass2 {
    companion object {
        val x = 1
    }
}

/////////////////////////////////////////////////////

interface Factory<T> {
    fun create(): T
}

//Note that, even though the members of companion objects look like static members in other languages, at runtime those are still instance members of real objects, and can, for example, implement interfaces:
class MyClass3 {
    companion object : Factory<MyClass> {
        override fun create(): MyClass = MyClass()
    }
}