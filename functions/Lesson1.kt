package functions


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
fun main(args: Array<String>) {
//   to call a function use greetings
//    MUST be in the main function
    greetings()//argument is here
    println("Hello once again")
    greetings2("John") //John is an argument
    greetings3("James", 18)
//    area(7)


}