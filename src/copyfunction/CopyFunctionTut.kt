package copyfunction

data class User(val name: String = "", val age: Int = 0)

fun main(args: Array<String>) {
    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy()
    println(olderJack)

    val jane = User("Jane", 35)
    val (name, age) = jane // destructuring declaration
    println("$name, $age years of age") // prints "Jane, 35 years of age"
}