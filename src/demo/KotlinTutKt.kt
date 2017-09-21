package demo

fun main(args: Array<String>) {
    println("Hello World!")
    println(Int.MAX_VALUE)

    var number: Float = 1f
    number = 2.3f
    println(number)

    println("Equals A and A: ${"A".equals("A")}")

    var sqArray = Array(10, { x -> x * x })
    for (i in sqArray) {
        print("$i ")
        if (sqArray.lastIndex == sqArray.indexOf(i)) println()
    }
    println()

    var dynamicArray = arrayOf("Boci", 1, 2.6f, 'G', false)
    for (i in dynamicArray) print(" $i |")
    println()

    val alpha = 'A'..'Z'
    println("A in alpha: ${'A' in alpha}")
    println()

    println(10.downTo(1))
    println(2.rangeTo(20))
    println()

    dynamicArray.forEach { n -> println(n) }
}