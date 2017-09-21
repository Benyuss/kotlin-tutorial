package nestedclasses

import java.awt.event.ActionListener

fun main(args: Array<String>) {
    val demo = Outer().Inner().foo() // == 1
    val demo2 = Outer2.Nested().foo() // == 2
}

class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}

class Outer2 {
    private val bar: Int = 1
    class Nested {
        fun foo() = 2
    }
}