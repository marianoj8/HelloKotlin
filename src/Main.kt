// Funcoes em Kotlin

fun getGreeting(): String = "Hello Kotlin!"

fun seyHelloTo(message: String) = "Hello $message"

fun seyHello() {
    println(getGreeting())
}

fun main() {
    println(getGreeting())
    seyHello()
    println(seyHelloTo("Mariano"))
}