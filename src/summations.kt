class addition{

    //    data member
    var x:Int=65
    var y:Int=45

    //    member_function
    fun sum():Int{
        return x+y
    }
}

fun main(args: Array<String>) {
//    instance of my object
    val objSummation = addition()
    println(objSummation.sum())
}