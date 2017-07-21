package Classes

enum class Priority(val value: Int){
    MINOR(-1){
        override fun text(): String {
            throw UnsupportedOperationException("Not Implemented.") //To change body of created functions use File - Settings - File Templates
        }
    },
    NORMAL(0){
        override fun text(): String {
            throw UnsupportedOperationException("Not Implemented.") //To change body of created functions use File - Settings - File Templates
        }
    },
    MAJOR(1){
        override fun text(): String{
            return "[MAJOR PRIORITY]"
        }

        override fun toString(): String {
            return " Major Priority"
        }
    },
    CRITICAL(10){
        override fun text(): String {
            throw UnsupportedOperationException("Not Implemented.") //To change body of created functions use File - Settings - File Templates
        }
    };
    abstract fun text(): String
}

fun main(args: Array<String>){
    val priority = Priority.MAJOR
    println(priority)
    println(priority.text())
}