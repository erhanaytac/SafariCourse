package Main

open class Person{
    open fun validate(){

    }
}

open class customer: Person {
    final override fun validate(){
    }

    constructor(): super() {}

    }

class  SpecialCustomer: customer(){
}

data class CustomerEntity(val name: String): Person()

fun main(args: Array<String>){
    val Customer = customer()

    Customer.validate()
}