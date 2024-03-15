fun main(args: Array<String>) {
    var myChar = 'a'
    when(myChar){
//        in 0..9 -> println("single digit number")
        'a' -> println("a is a vowel")
        'e' -> println("e is a vowel")
        'i' -> println("i is a vowel")
        'o' -> println("o is a vowel")
        'u' -> println("u is a vowel")

        else -> println("$myChar`is a consonant")
    }
}