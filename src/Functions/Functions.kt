package Functions

fun hello(): Unit{
    println("              ---Hello!---\n")
}

fun throwingException(): Nothing{
    throw Exception("This function throws an exception")
}

fun returnsAFour(): Int{
    return 4
}

fun takingString(name: String){
    println(name)
}

fun sum(x: Int, y: Int, z: Int = 0, w: Int = 0): Int{
    return x + y + z
}

fun printDetails(name: String,  email: String = "", phone: String){
    println("Name: $name \neMail: $email \nPhone: $phone")
}

fun printStrings(vararg strings: String){
    reallyPrintingStrings(*strings)
}

private fun reallyPrintingStrings(vararg strings: String) {
    for (string in strings) {
        println(string)
    }
}

fun main(args: Array<String>){
    hello()

    val value = returnsAFour()

    takingString("Kotlin Words: ${sum(x = 1, y = 2, z = 3)}\n\n")

    sum(1, 2, 3)
    sum(1, 2)

    printDetails("Kotlinhan", phone = "568546", email = "kotlindaroğlu@kotlingil.com")

    printStrings("\n1")
    printStrings("1   2")
    printStrings("1   2   3")
    printStrings("1   2   3   4")
    printStrings("1   2   3   4   5")
    printStrings("1   2   3   4")
    printStrings("1   2   3")
    printStrings("1   2")
    printStrings("1")
}