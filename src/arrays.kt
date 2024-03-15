fun main(args: Array<String>) {
    var myArray= arrayOf("Ian","Zhabotinsky","Belousouv",true,78,67,98f,'e')
    myArray[1]="Sabattier"
    println("My name is ${myArray[1]}")

    var myintArray= arrayOf <Int>(12,56,0,3,1010)
    println(myintArray.sorted())

    var myfloatArray= arrayOf<Float>(0.4f,0.8f,0.6f,0.2f)
    println(myfloatArray.sorted())

    var mystringArray= arrayOf<String>("Cannabidiol","Trinitrotoluene","Dichlorophenol indophenol","Azidoazide azide")
    println(mystringArray[0])
}