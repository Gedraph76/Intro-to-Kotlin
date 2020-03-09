package OOP

//classes taht are passed in data just: like functions
//() constructors
class BenzS200(owner:String, number_plate:Int, val color:String){
    var mwenye_gari:String //empty to store incoming data
    var plati:Int //empty to store incoming data
    var origin : String = "Germany"
//    mwenye_gari: class property
//    plati: class property
    init {
        this.mwenye_gari = owner
        this.plati = number_plate
    }
    fun printDetails() : Unit{
        println("The owner is $mwenye_gari and the number plate is $plati")
    }
}

//assignment
class Calculator(var num1:Int , var num2:Int){
    fun sum_of_two(){
        var sum:Int = num1 + num2
        println("The sum of $num1 and $num2 is $sum")
    }
    fun minus(){
        val minus:Int = num1 - num2
        println("The subtraction of $num1 from $num2 is $minus")
    }
    fun multiplication(){
        val multi:Int = num1 * num2
        println("The multiplication of $num1 and $num2 is $multi")
    }
    fun division(){
        var divide:Int = num1 / num2
        println("The division of $num1 from $num2 is $divide")
    }

}


fun main(args: Array<String>) {
  val b1 = BenzS200("john",123 , "Blue")
    b1.printDetails()
  var b2 = Calculator(12 ,3)
    b2.sum_of_two()
    b2.minus()
    b2.multiplication()
    b2.division()
}

