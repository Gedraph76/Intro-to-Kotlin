package operators

//Arithmetic ops
//(+,-,*,/,%)
fun main() {
    var sum:Int //declare empty variable
    var height:Int = 12
    val width:Int = 21
    sum = height + width //addition operator
    println(sum)
    //subtraction operator

    //comparison operator
//(< ,<= ,>= ,!= ,==) return value is always boolean(true or false)

    val isEqual:Boolean = height == width
    println(isEqual)//returns false
    if(height > width){
        println("$height is > than $width")
    }else{
        println("$height is < than $width")
    }

//    Assignment operators
//    (+= ,-= ,*= ,/= ,&=)
    val newHeight:Int = 23
    height *= newHeight
    println("Total height is $height")



}

