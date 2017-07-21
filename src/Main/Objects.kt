package Main

object Global{
    val PI = 3.14
}

fun main(args: Array<String>){

    val localObject = object {
        val PI = 3.14159
    }
    println(Global.PI)
    println(localObject.PI)
    println(Global.PI)
}