package Lesson1.lesson1
//kotlin code gets executed only in the main function
//main() function defines where kotlin code gets executed
//the {} defines the scope of your executable code
fun main() {
//    println(): prints content with a new line at the end
//    Print(): prints content with a continuous line
    println("hello world")
    println("hello world")
    print("Hello world")
    print("Hello world")
    println()
//    Explicitly defining the tpe of variable
    val country:String= "Kenya"//Constant
    var county:String= "Nairobi"
    var age:Int= 23
    var gender:String
    gender ="Male"

    println(country)
    println(county)
    println(age)

//implicitly defining the type of variables
    val name =" John Doe"
    var language=" kotlin"
    println(name)
    println(language)

//    Kotlin data types
//   1.Numbers
//        1.1 Integers: non-decimal numbers
            var my_age:Int = 23
            println(my_age)
            my_age = my_age + 10
            println(my_age)
//        1.2 Floats:Integers:decimal numbers
            val height = 3.56F
            println(height)
//   2.Boolean: states True or false
        val isLoggedin :Boolean = true
        val isLoggedout :Boolean = false
//   3.Strings
    var length:Int = 25
    var ruler:String = "Oxford"

    println("The length of an " +ruler+ " ruler is " +length+ " cm")
    println("The length of an $ruler ruler is $length cm")
    //    already seen up there
//   4.Characters: declared using single quotes
        val first_letter ='J'

//    assignment create two variables num1 and num2 storing 10 and 20 respectively and
//    calculate the sum of the two numbers
    val num_1:Int = 10
    val num_2:Int = 20
    val sum:Number = num_1 + num_2
    println(num_1)
    println(num_2)
    println(sum)
//   5.Arrays

}

