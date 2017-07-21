package Customer

import Classes.Employee
import Main.customer

interface CustomerRepository{
    val isEmpty: Boolean
    get() = true
    fun store(obj: customer){
        //Implement code to store
    }
    fun getById(Id: Int): customer
}

interface EmployeeRepository{
    fun store(obj: Employee){

    }
    fun getById(id: Int): Employee
}
class SQLCustomerRepository: CustomerRepository {
    override fun getById(id: Int): customer {
        return customer()
    }

    override fun store(obj: customer){
        //super.store(obj)
    }

    override val isEmpty: Boolean
        get() = false
}

interface Interface1 {
    fun funA(){
        println("Fun a from Interface 1")
    }
}

interface Interface2 {
    fun funA(){
        println("Fun a from Interface 2")
    }
}

class Class1And2: Interface1, Interface2 {
    override fun funA(){
        super<Interface2>.funA()
    }
}

fun main(args: Array<String>){
    val c = Class1And2()
    c.funA()
}