/**
 * Sealed classes are used for representing restricted class hierarchies, when a value can have one of the types from a limited set, but cannot have any other type. They are, in a sense, an extension of enum classes: the set of values for an enum type is also restricted, but each enum constant exists only as a single instance, whereas a subclass of a sealed class can have multiple instances which can contain state.
 *
 * @see 'https://kotlinlang.org/docs/reference/sealed-classes.html'
 */
package sealedclass

fun main(args: Array<String>) {
    val const1 = Const(1.0)
    println(eval(const1)) // prints 1.0

    val const2 = Const(3.0)
    println(eval(Sum(const1, const2))) // prints 4.0

    println(eval(NotANumber)) // prints NaN
}

sealed class Expr
data class Const(val number: Double) : Expr()
data class Sum(val e1: Expr, val e2: Expr) : Expr()
object NotANumber : Expr()

fun eval(expr: Expr): Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
// the `else` clause is not required because we've covered all the cases
}