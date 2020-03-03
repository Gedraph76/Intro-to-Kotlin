package conditions

fun main(args: Array<String>) {
    val x:Int = 3
    val y:Int = 5
//1.if
    if(x < y){
        println("$x is less than $y")
    }
//2.if ..else..
    if(x > y){
        println("$x is greater than $y")
    }else{
        println("$x is less than $y")
    }
//3.if... elseif.. else
    if(x > y){
        println("$x is greater than $y")
    }else if(y >= 5){
        println("$y is greater than or equal to 5")
    }else{
        println("Closing the program")
    }

//    if statements as an expression
    val results =  if(x == 3){
        println("$x is equals to 3")
    }else if(y >= 5){
        println("$y is greater than or equal to 5")
    }else{
        println("Closing the program")
    }
    println(results)

//    when statement
//    when(state){
//        state1 -> println("Hello world")
//        state2 -> println("Hello world")
//        state3 -> println("Hello world")
//        state4 -> println("Hello world")
//    }
    println("Enter your Age :")
    val myAge:String = readLine()!!//ask user to enter the age
//    val age: Int = 17
    var age_as_int:Int = myAge.toInt()
    when (age_as_int ){
        12 -> println("Join class 6")
        13 -> println("Join class 7")
        14 -> println("Join class 8")
        15 -> println("Join form 1")
        16 -> println("Join form 2")
        17 -> println("Getting an ID soon")
    }
//    qiuz
    println("Enter your age:")
    var maika:String = readLine()!!
    var miaka_age:Int = maika.toInt()
    when(miaka_age % 2 == 0){
        true -> println("$miaka_age is even")
        false -> println("$miaka_age is odd")
    }




}

