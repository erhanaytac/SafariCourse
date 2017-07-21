package Null

class Service{
    fun evaluate(){

    }
}
class ServiceProvider{
    fun createServices(): Service {}
}

fun main(args: Array<String>){
    val message: String = "Message"

    val nullMessage: String? = null
    val inferredNull = null

    println(nullMessage!!.length)

    val sp = createServiceProvider()
    sp?.createServices()?.evaluate()
}

private fun createServiceProvider(): ServiceProvider? = ServiceProvider()