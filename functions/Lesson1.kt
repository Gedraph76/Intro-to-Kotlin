package functions

import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope


//function is a block of code that executes a  specific task e,g println()
//fun name of function(parameter){
//    code to execute
//}
//
fun greetings(){
    println("Hello world")
}
//functions that takes an argument
//parameter: a variable passed into a function
fun greetings2(name:String){
    println("Hello $name")
}
fun greetings3(name:String,age:Int){
    println("Hi i am $name, am $age years old")
}
//fun area(radius:Int){
//    val area:Int
//    val radius:Int
//    val pie = 22/7
//    area = pie *radius *radius
//}
//fun count(name:String){
//    val majina= arrayOf("$name")
//
//    println("$name.length")
//}
//fun greetings4(num1:Int, num2:Int){
//    val num1:Int= 1
//    val num2:Int = 3
//    val sum:Int
//    sum= num1 + num2
//    println(sum)
//}
fun git(num:Int){
    println("Enter your Age :")
    val x:String = readLine()!!
    var y:Int = x.toInt()
    for (y in 0..100){
        if (y %2 == 0){
            println("$y is Even")
        }else{
            println("$y is odd")
        }
    }

}

//functions that returns a value
//A function that return  a value has to specify the return
//type(Int , String , Double, Boolean)
//A function can return a use full value or non use full value
//use full values are like Int, String , Double etc
// None use full values can be a bare string ie "hello world"
fun get_age():Int{
//    to return a value use the "return statement"
    return 23
}
fun sum_of_two(num1:Int, num2:Int):Int{
//    Int:return type
    val sum:Int = num1 + num2
    return sum
}
fun get_name(username:String) :String{
    return username
}
//returning non use full data: use Unit tyoe
fun sayHello():Unit{
    println("Hello World")
}
fun sayHello2(username:String):Unit{
    println("Hello world my name is $username")
}
fun sayHello3(username:String, age: Int):Unit{
    val sentence = "My name is $username and I am $age years old"
    println(sentence)
}

//functions wih default arguments
//DEfault arguements
fun getDetails(username: String, age:Int , province: String ="Wuhan"){
    println("Name :$username")
    println("Age :$age")
    println("Province :$province")//default args
}





fun main(args: Array<String>) {
//   to call a function use greetings
//    MUST be in the main function
    greetings()//argument is here
    println("Hello once again")
    greetings2("John") //John is an argument
    greetings3("James", 18)
//    area(7)

    get_age() //returns int 23 to variable my_age
     val My_age:Int = get_age()
    println(My_age)
    val results:Int = sum_of_two(2 , 3)
    println(results)
    val name:String = get_name("Michael")
    println(name)
    sayHello()
    sayHello2("Maya Bijou")
    sayHello3("James", 56)

    getDetails("Kira Kosarin", 23)
    getDetails("Kira Kosarin", 23,"Shanghai")
//    Named arguments
    getDetails(province = "Shanghai", username = "James May", age = 23)

}