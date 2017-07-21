package tidbits

open class Person {

}

class Employee: Person() {
    fun vacationDays(days: Int){
        if (days<60){
            println("You need mor vacation.")
        }
    }
}

class Contractor: Person() {

}

var input: Any = 10

fun main(args: Array<String>){
    val str = input as? String
}