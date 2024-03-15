open class monpara{

    var monpapa="He likes watching football"
    var monmama="She likes cooking"

}

class fille:monpara(){
    fun cookinginheritance(){
        println(monmama)
    }

}

class boy:monpara(){
    fun footballinheritance(){
        println(monpapa)
    }
}

fun main(args: Array<String>) {
    val obj1=fille()
    obj1.cookinginheritance()
    val obj2=boy()
    obj2.footballinheritance()
}