import Classes.Customer

class CustomerGenericRepository<I>: Repository<I>{
    override fun getById(id: Int): I{
        throw UnsupportedOperationException("Not Implemented!\n\nCRITICAL PRIORITY!\n")
    }
        override fun getAll(): List<I>{
            throw UnsupportedOperationException("Not Implemented")
        }
    }

interface Repo{
    fun <I> getById(id: Int): I
    fun <E> getAll(): List<E>
}

class MyRepo: Repo{
    override fun <I> getById(id: Int): I {
        throw UnsupportedOperationException("Not Implemented")
    }

    override fun <I> getAll(): List<I>{
        throw UnsupportedOperationException("Not Implemented")
    }
}
interface Repository<I>{
    fun getById(id: Int): I
    fun  getAll(): List<I>
}

fun main (args: Array<String>){

    val customerRepo = CustomerGenericRepository<Customer>()

    val customer = customerRepo.getById(2)
    val customers = customerRepo.getAll()

    //println(customer)
    //println(customers)
}