// Funcoes em Kotlin

fun getGreeting(): String = "Hello Kotlin!"

fun main() {
    val interestingThings = arrayOf("Java", "Kotlin", "Dart", "Others")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))
    println("Running loop")

    for (i: String in interestingThings) {
        println(i)
    }

    println()
    println("Using foreEach")

    interestingThings.forEach {
        println(it)
    }
    //Renaming "it"
    interestingThings.forEach { item ->
        println(item)
    }

    //Using indexed foreEach
    interestingThings.forEachIndexed { index, item ->
        println("[$index] -> $item")
    }
}