package arrays

fun main(args: Array<String>) {
    //Arrays ia a collection of similar dta types either of
//Int, String etc. Array in Kotlin is mutable in
//nature with fixed size which means we can perform
//both read and write operations on elements of array.
//You can declare an array explicitly and implicitly
//use the array function to create an array

//Declaring an array implicitly
    val country = "Kenya"//array declaration implicit dec
    val numbers = arrayOf(1,2,3,4,5,6,7,8)
    val names = arrayOf("John", "Mary", "Paul", "Mike")

//Declaring an array explicitly
    val county = "Nai"//array declaration implicit dec
    val nums = arrayOf<Int>(1,2,3,4,5,6,7,8)
    val majina = arrayOf<String>("John", "Mary", "Paul", "Mike","Henderson","Samuel")

//accessing array items
// 1.   use index numbers
    println(numbers[0])
//    2.use get(), takes the index numbers as an argument
    println(majina.get(2))

//    creating an array using factory functions
    val cars = intArrayOf(1,2,3,4,5,6,7,8)
    val isTrue = booleanArrayOf(true,false)

//    changing array values : use set() method
//    set() method takes two argument: One is the index of the
//    value you want to change, the otherargument is the value
//    to replace with
    majina.set(1,"Konny")
    println(majina.get(1))

    val num_names:Int = majina.size
    println(num_names)


//looping through an array
    for (i in 0..num_names-1){
        println(majina.get(i))
        println(majina[i])
    }
    println(majina[1].length)//get length of characters in a string
    for (x in 0..num_names-1){
        if ((majina[x].length) > 5){
            println("More than 5")
        }else{
            println("Hello world")
        }
    }





}