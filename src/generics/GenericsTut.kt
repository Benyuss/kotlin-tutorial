package generics

class Box<T>(t: T) {
    var value = t
}

fun main(args: Array<String>) {
    val box: Box<Int> = Box<Int>(1)

    val box2 = Box(1) // 1 has type Int, so the compiler figures out that we are talking about Box<Int>
}