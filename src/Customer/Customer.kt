package Customer

data class CustomerKot(var ID: Int, var Name: String, var eMail: String)

fun main(args: Array<String>){

    val customer1 = CustomerKot(1, "Erhan", "abc@dasldssa.com")
    val customer2 = CustomerKot(2, "Veli", "DASJKDJ@gmail.com")

    val customer3 = customer1

    if(customer1 == customer2){
        println("They are the same!")
    }

    val customer4 = customer2.copy(eMail  = "dkassdkas@gmcil.com")

    println(customer3.ID)
    println(customer1.Name)
    println(customer4.eMail)
}