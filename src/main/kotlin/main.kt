fun say(first: String, number: Int) {
    println("$first - $number")
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun saySome(first: Boolean): String = "Hello World $first"

fun main() {
    say("Hello", 45)
    var result = add(5, 10)
    println(result)
    println(saySome(true))
}