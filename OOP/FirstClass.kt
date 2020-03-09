package OOP

//to create a class use the "Class" keyword
//After the class keyword, add the name of the class with the starting
//letter in uppercase
//class == blueprint
class Car{
//    properties: kt variables
    var color:String = "Red"
    var num_sits:Int = 4
    var onGear: Boolean = false
    var wipers:Int = 2
    var rims:String = "Black Shiny"
    var handbreak:Boolean = true
    var exhaust:Int = 2
    var engine:String = "V12 Engine"
    val year_of_production:Int = 2007

//    method:Function inside a class
    fun printDetails():Unit{
        println("Color : $color")
        println("Number of seats : $num_sits")
        println("On Gear: $onGear")
        println("Wipers: $wipers")
        println("rims: $rims")
        println("hand Break: $handbreak")
        println("Exhaust: $exhaust")
        println("Type of Engine: $engine")
    }

//    methods that take arguments
    fun accelerate(speed:Int){
        println("This car has a top speed of $speed kmh")
    }

//    method that returns a value
    fun production_year():Int{
        return year_of_production
    }
}

fun main(args: Array<String>) {
//    object/instance: is an example of a
//    to create an object, declare if its val/var
//    then give a name , then assign it to the class == blueprint

    val car1 = Car()
    val car2 = Car()
//    car1: object/Instance
//    Car() : class/blueprint
//    accessing properties in an object and methods,
//    use the "."operator
//    a method is any normal function that is inside a class
//      calling a method
    println("Car1 Details")
    car1.printDetails()

    println("Car2 Details")
    car2.printDetails()

    car1.accelerate(200)
    car2.accelerate(260)


    car2.production_year()
//    1.Store the returned value in a variable and print
    val yop:Int = car1.production_year()
    println(yop)
//    2.Print results directly
    println(car1.production_year())

//    changing  object properties
//    refer to object , use the dot operator to change the property that needs change
    car2. color ="Green"
    car2. num_sits = 5
    car2. onGear = true
    car2. wipers = 2
    car2. rims = "Silver Shiny"
    car2. handbreak = false
    car2. exhaust = 4
    car2. engine = "W16 Engine"
}
