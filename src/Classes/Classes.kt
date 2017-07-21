package Classes

import java.util.*

class Customer(val id: Int, var name: String, val yearOfBirth: Int) {

    /*init {
        name = name.toUpperCase()
    }*/

    val age: Int
    get() = Calendar.getInstance().get(Calendar.YEAR) - yearOfBirth

    var socialSecurityNumber: String = ""

    set(value){
        if (!value.startsWith("1234")){
            throw IllegalArgumentException("Social security should start with SN")
        }
        field = value
    }

    fun customerAsString(): String{
        return "ID: $id" +
                "\nName: $name"
    }
}

fun main(args: Array<String>){
    val customer = Customer(10, "Erhan", 1994)
    //val customer2 = Customer(10)

    customer.name
    customer.id
    customer.socialSecurityNumber = "1234"
    println(customer.customerAsString())
    //println(customer.name)
    println("Age: "+customer.age)
    println("SN(Security Number): "+customer.socialSecurityNumber)
}