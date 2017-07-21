package Classes

abstract class StoredEntity{
    val isActive = true
    abstract fun store()
    fun status(): String{
        return isActive.toString()
    }
}

class Employee: StoredEntity(){
    override fun store(){
        throw UnsupportedOperationException("Not Implemented.") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>){
    val se = Employee()
    se.isActive
    se.status()
    //println(se.status())
}