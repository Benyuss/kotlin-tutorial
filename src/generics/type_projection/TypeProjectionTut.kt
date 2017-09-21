package generics.type_projection

fun main(args: Array<String>) {
    var str = arrayOf<CharSequence>("element0", "element1")
    fill(str, "copied value")
    for (i in str.indices) {
        println(str[i])
    }
}

// corresponds to Java's Array<? extends Object>
fun copy(from: Array<out Any>, to: Array<Any>) {
    for (i in to.indices) {
        to[i] = from[i]
    }
}

// corresponds to Java's Array<? super String>
fun fill(dest: Array<in String>, value: String) {
    for (i in dest.indices) {
        dest[i] = value
    }
}