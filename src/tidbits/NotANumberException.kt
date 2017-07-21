package tidbits

import java.io.BufferedReader
import java.io.FileReader

class NotANumberException: Throwable(){

}

fun chckIsNumber(obj: Any){
    when (obj){
        !is Int, Long, Float, Double -> throw NotANumberException()
    }
}

fun main(args: Array<String>){

    val buffer = BufferedReader(FileReader("input.txt"))
    val result = try{
        val chars = CharArray(30)
        buffer.read(chars, 0, 40)
    }   catch (e: IndexOutOfBoundsException){
        println("Exception handled")
        -1
    }   finally{
        println("Closing")
        buffer.close()
        -2
    }
    println(result)
}