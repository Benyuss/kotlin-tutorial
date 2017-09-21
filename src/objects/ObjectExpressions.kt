package objects

import java.awt.Frame
import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

/**
 * Sometimes we need to create an object of a slight modification of some class, without explicitly declaring a new subclass for it. Java handles this case with anonymous inner classes. Kotlin slightly generalizes this concept with object expressions and object declarations.
 *
 * Object expressions are executed (and initialized) immediately, where they are used.
 */
fun main(args: Array<String>) {

    var clickCount = 0
    var enterCount = 0
    val windows = Window(Frame())
    windows.addMouseListener(object : MouseAdapter() {
        override fun mouseEntered(e: MouseEvent) {
            enterCount++
        }

        override fun mouseClicked(e: MouseEvent) {
            clickCount++
        }
    })


    val ab: A = object : A(1), B {
        override fun signal() = "signaled!"

        override val y = 15
    }
    println("${ab.y} ${(ab as B).signal()}")

    foo()
}

//////////////////////////////////////////////
open class A(x: Int) {
    open val y: Int = x
}

interface B {
    fun signal(): String
}

//////////////////////////////////////////////
fun foo() {
    val adHoc = object {
        var x: Int = 0
        var y: Int = 0
    }
    print(adHoc.x + adHoc.y)
}

//////////////////////////////////////////////
class C {
    // Private function, so the return type is the anonymous object type
    private fun foo() = object {
        val x: String = "x"
    }

    // Public function, so the return type is Any
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x        // Works
        val x2 = publicFoo()/*.x*/  // ERROR: Unresolved reference 'x'
    }
}