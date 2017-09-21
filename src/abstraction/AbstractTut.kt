package abstraction

fun main(args: Array<String>) {
    val obj = MoreDerived()

    println(obj.x)
    obj.d()
    obj.f()
}

open class Base {
    open fun f() {
        println("Base")
    }

    val x = 10
}

abstract class Derived : Base() {
    override abstract fun f()

    open fun d() {
        println("abstract class d")
    }
}

class MoreDerived : Derived(), I {
    override fun e() {
        println("MoreDerived e")
    }

    override fun f() {
        super<I>.d()
    }

    override fun d() {
        println("MoreDerived d")
    }
}

interface I {
    fun d() {
        println("interface d")
    }

    fun e()
}