package demo

fun main(args: Array<String>) {
    val mult3 = makeMathFunc(3)
    println(mult3(5))
}

fun makeMathFunc(num1: Int): (Int) -> Int = {num2 -> num1 * num2}