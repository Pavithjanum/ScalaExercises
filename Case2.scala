
class AccountInfo(val dep: Int, val withdrw: Int) {
  val balance = 0
  def deposit: Int = dep
  def withdraw: Int = withdrw
}

object Conversions extends App{
  var inches = 2
  var miles = 200
  var pounds = 50
  def inchestoFeet ={inches/12}
  def milestoKms ={1.609344*miles}
  def poundsToKilos={pounds/2.2046}
  println(inchestoFeet,milestoKms,poundsToKilos)
}

class BankAccount (initBal: Double) extends CheckingAccount{
private var balance = initBal
def deposit (amount: Double) = { balance += amount; balance+updates }
def withdraw (amount: Double) = { balance -= amount; balance+updates }
}

class CheckingAccount{
  def updates = 1
} 

object main1 extends App {
  val bal = new BankAccount(50000)
  val bal_amt = bal.deposit(40000)
  val withdrw_amt = bal.withdraw(2000)
  println(bal_amt,withdrw_amt)
}

object find_largest extends App{
var a=new Array[Int](10)
a = Array(10,9,89,67,567,789,543,234)
println(a.reduceLeft(_ max _))
}

object find_factorial extends App{
  var fact = 1
  def fact(num: Int) = {if (num>0) ((1 to num).reduceLeft (_ * _ )) else 0 }
  println(fact(5))
}

import scala.io.{Source,BufferedSource}
object manipulations extends App{
var s = "Hi\nHello"
println(s.reverse)
import scala.reflect.io.File
val path = File(".").toAbsolute
println(path)
var str=new Array[String](50)
Source.fromFile("data.txt").getLines.foreach { x => println(x) };
val source = Source.fromFile("data.txt")
val lines = source.getLines.toArray
val revLines = lines.reverse
println(revLines)
}

object fileoper extends App{
  val longWords = for(a <- io.Source.fromFile("data.txt").mkString.split(' ') if a.length >= 10) yield a
  println(longWords)
}

