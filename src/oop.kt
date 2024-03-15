class safari{

//    data member
    var nambari:Int=9

//    member_function
    fun square():Int{
        return nambari*nambari
    }
}

fun main(args: Array<String>) {
//    instance of my object
    val myObject = safari()
    println(myObject.square())
}


