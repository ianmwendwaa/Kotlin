class safaristudents(val jina:String, val miaka:Int, val jinsia:String){


}

fun main(args: Array<String>) {
    val myObject=safaristudents("Ian",69,"Male")
    println("My name is ${myObject.jina}, " +
            "I am ${myObject.miaka} years old and" +
            " I am a ${myObject.jinsia} Kenyan youth")
    val myObject2=safaristudents("Riemann",55,"Male")
    println("${myObject2.jina} was a ${myObject2.jinsia} Prussian Mathematician" +
            "eho died aged ${myObject2.miaka} years old.")
}