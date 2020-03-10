package OOP

//parent class
//abstract class cannot be instantiated (you cannot create objects of an abstract but can
// inherit from them).
abstract class Player(open var name:String ,open var team:String,open var jazNum:Int){
//    open in class: means that the class can be inherited from
//    open in constructor:means variables ie name  club jazNum can be changed
//    var jina:String
//    var clab:String
//    var jezi:Int
//
//    init {
//        this.jina = name
//        this.clab = team
//        this.jezi = jazNum
//    }
// abstract methods do not have a body
    open fun run(){
        println("I can run very fast")
    }
     open fun dribble(){
        println("I am one of the best dribblers")
    }
    open fun printDetails(){
        println("This is ${name}")
        println("From ${team}")
        println("Jazz Number is Number ${jazNum}")
    }

}
//SoccerPlayer is a sub class inheriting from the parent class Player
class SoccerPlayer( override var name:String , override var team:String, override var jazNum:Int):Player(name,team, jazNum){
    override fun run (){
        println("I run as a soccer Player")
    }
}
class RugbyPlayer(override var name:String , override var team:String, override var jazNum:Int):Player(name,team, jazNum){
    override fun run (){
        println("I run as a Rugby Player")
    }
}

fun main(args: Array<String>) {
    val messi = SoccerPlayer("Lionel Messi","Barcelona", 10)
    val Ronaldo = SoccerPlayer("Christiano Ronaldo","Juventus", 7)
    val Nkindi = RugbyPlayer("Nkindi Mkambez","Kenya",23)

    messi.printDetails()
    Ronaldo.printDetails()
    messi.dribble()

    messi.run()
    messi.dribble()

    println("Rugby Players")
    Nkindi.printDetails()
    Nkindi.run()
}


