# ScalaExercises
Scala Exercises

Case1 : Go through the basic commands 
Case2 : 

 Write a class AccountInfo with methods deposit and withdraw, and a read-only property balance
 Write an object Conversions with methods inchestoFeet, milestoKms and poundsToKilos and invoke it’s methods from a class of your choice
 Extend the following BankAccount class to a CheckingAccount class that charges $1 for every deposit and withdrawal

Class
BankAccount (initBal: Double)
private var balance = initBal
def deposit (amo unt: Double) = { balance += amount; balance }
def withdraw (amount: Double) = { balance --= amount; balance}

 Write a Scala program to get the largest element of an array using reduceLeft
 Implement the factorial function using to and reduceLeft, without a loop or recursion
 Write a Scala code which reverses the lines of a file (makes the first line as the last one, and so on)
 Write a Scala code which reads a file and prints all words with more than 10 characters. Can you write all of it in a single line?
