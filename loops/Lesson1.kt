package loops

import java.util.*

//for loops
//syntax
fun main(args: Array<String>) {

//    incrementing by2
    for (i in 0..20 step 2){
        if (i == 4){
            println("$i is equal to 4")
        }else{
            println("$i is not equal to 4")
        }
    }
//    printing in reverse order
    for(i in 20 downTo 1){
        println(i)
    }
//    while loops
    var a = 0
    while (a < 10){
        println(a)
        a++
    }
    var b = 1
    do{
      println(b)
        b++
    }while (b > 10)
//    assignment :FIZZBUZZ
//3 fizz
//5 buzz
//3 and 5 fizzbuzz
    for (l in 1..100){
        val x:Int =3
        val y:Int = 5
        if(l %15 ==0){
              println("$l is Fizzbuzz")
        }else if (l % 5 ==0){
            println("$l is Buzz")
        }else if(l %3 == 0){
            println("$l is Fizz")
        }else{
            println("$l is not divisible by either 3 or 5")
        }
    }
//    Arrays
//    Functions

}