//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//immutable
/*fun main() {
    //immutable
    val cities = listOf("New York","Durbon","Dublin","Pretoria")
    println(cities)
    //mutable
    val friends = mutableListOf("Hawa","Jane","Karen")
    println(friends)
    friends.add("Mark")
    friends.add("Anne")
    friends.add("k")
    friends.add("p")
    friends.addAll(listOf("Mark","Anne","k","p"))
    println(friends)
    friends.removeAt(2)
            println(friends)
    println(friends[2])
}

*/

//Write a function that takes in a list of 5 integers and returns
//the sum of th element at odd indices
/*

fun main() {
    println(numbers(20, 30, 40, 50, 60))
    println(add(mutableListOf(20, 30, 40, 50, 60)))
    println(element(mutableListOf(2, 3, 4, 5, 6, 7, 8)))
    calculate(mutableListOf(4, 4, 7))
    println(even(listOf("Kenya", "Monkey", "Fuel", "lamp", "kennel", "Judge", "crime", "city", "kales", "play")))
height(listOf(42,34,10,3,2))
}

fun numbers(num1: Int, num2: Int, num3: Int, num4: Int, num5: Int): Int {

    return mutableListOf(num1, num2, num3, num4, num5).sum()

}


fun add(list: MutableList<Int>): MutableList<Int> {
    return mutableListOf(list.sum())
}

fun element(list: MutableList<Int>): Int {
    var sum = 0
    //i = 0
    for (number in list.indices) {
        if (number % 2 != 0) {
            sum += list[number]

        }

    }
    return sum
}
//given a least of 10 strings .write a function that returns a least of the strings at even indices
fun even(list: List<String>):List<String> {
    var string: List<String>
    //i = 0
    for (word in list.indices) {
        if (word % 2 == 0) {
            list+=(list)
//println(sum)
        }
    }
    return list
    }
//Given a list of peoples height in meters. Write a function that returns the average height and total height
fun height(list: List<Any>):Int{
    var average = list.sumOf { list } list.size
    println(height)
    return average
}                sum += item

                fun calculate(nums: List<Int>): Int {
                    var sum = 0
                    nums.forEachIndexed { idx, item ->
                        if (idx % 2 != 0) {
            }
        }
        println(sum)
        return sum
    }

/*data class Person(val height:Double)
fun main() {
    val people = listOf(
        Person(1.75),
        Person(1.80),
        Person(1.65),
        Person(1.70)
    )

    val (averageHeight, totalHeight) = calculateHeightStats(people)
    println("Average height: $averageHeight meters")
    println("Total height: $totalHeight meters")
}

fun calculateHeightStats(people: List<Person>): Pair<Double, Double> {
    val totalHeight = people.sumOf { it.height }
    val averageHeight = totalHeight / people.size
    return Pair(averageHeight, totalHeight)
}*/
*/
/*fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)

    fun numbers(List<Int>) -> Int = fun(list: List<Int>): Int {
        var sum = 0
        for (number in list) {
            if (number % 2 != 0) {
                sum += number
            }
        }
        return sum
    }

    val oddSum = sumOfOdds(numbers)
    println("Original list of elements: $numbers")
    println("Sum of odd numbers: $oddSum")
}*/


//fun main() {
//   println( number(arrayListOf(1,2,3,4,5)))}

//fun number(list: List<Int>):Int {
//    var sum = 0
//    for(num in 0..5){
//        if(num % 2!= 0){
//            sum += 0
//        }
//    }
//    return sum
//}
//return nums[1]+nums[3]
//}

/*fun main() {
number(list = listOf(2,3,4,5,6,8))
}

fun number(list: List<Int>): Int {
    var a = list[1]
    var b = list[3]
    var c = list[4]

    var sum = a + b +c
    println(sum)
    return sum
}*/


/*fun main() {

}

fun mark(i:Int) {
if(i<= 60) {
    println("$i student has passed")
    }else{
        println("$i student has failed")
    }
}*/


/*fun main() {
    val people = listOf("Morris","Maureen","Mike","Mildred","Minnie")
   // people.sorted() call it to sort
    val pep = people.sorted()
    println(pep)
}*/

/*fun main() {
    val person1 = Person("Mary", 22)
    val person2 = Person("Joseph", 32)
    val person3 = Person("Janet", 12)
    val person4 = Person("Kris", 4)
    val person5 = Person("Harriet", 7)
    var people = listOf(person1, person2, person3, person4, person5)
    println(people)
    people = people.sortedBy { person -> person.name }
    println(people)
    people = people.sortedByDescending { person -> person.age }
    println(people)

    val nums = listOf(21, 5, 67, 21, 3, 67, 3)
    // if (5 in nums)
    //index of
    println(nums.contains(5))//true
    println(nums.contains(32))//false
    val children = nums.filter { num -> num < 18 }
    println(children)
    val adults = people.filter { person -> person.age >= 18 }
    println(adults)
}
data class Person(var name:String, var age:Int)


   // filter the pple list to fully remain with grown ups
*/
//Sortting list of words
/*fun main() {
    sort(listOf("eggs","soda","water","ant"))
}

fun sort(name:List<String>) {
    val vowels = listOf('a','e','i','o','u')
//val vowels = listOf("Ann","egg","insect","Cow","fish","monkey")


    val sortVowels = vowels.filter { vowel -> .f }
}
*/


/*data class product(var name: String, var category: Int, var price: Double, var quantity: Int)

fun main(list: List<String>) {
    product(listOf("groceries","hygiene"))
}

fun give():String {
  var produce =

}*/

//stars

/*fun main() {
    stars()
   //pyramid()
}

fun stars() {
    //var r = 5
for (i in 0..4) {
    for (j in 1..i + 1){
        print("* ")
    }
    println()
}

}*.
/*
fun pyramid() {
  //  var r = 5
    for (i in 0..5) {
        for (j in 0..i + 1) {
            //println("")
        }
        for (k in 0..i +2) {
            print("* ")
        }
        println("")
    }
}
*/*/

/*data class Person(var name: String, var age: Int)

fun main() {
    val people = listOf(
        Person("Alice", 30),
        Person("Bob", 25),
        Person("Charlie", 35)
    )

    // Using maxByOrNull to find the person with the maximum age
    val maxAgePerson = people.maxByOrNull { it.age }
    println("Person with maximum age: $maxAgePerson")
}*/

/*Question 1: Employee Management System
Scenario: You are developing an Employee Management System. Create a
data class Employee that contains the following properties: id (Int), name (String),
position (String), and salary (Double). Write a function that takes a list
of Employee objects and returns a list of employees who earn more
 than the average salary.*/

/*data class Employees(
    val id: Int,
    val name:String,
    val position:String,
    val salary:Double

)

fun main() {
    employ(listOf(
       Employees(1, "wayne", "42", 40.3),
       Employees(2, "lawrence", "03", 60.7),
      Employees(3, "Ken", "56", 20.0))
    )
}
    fun employ(list: List<Employees>): List<Employees> {
      var average = list.sumOf { it.salary } / list.size
        println(average)
      var give = list.filter { it.salary > average }
    println(give)
        return give
    }
*/
//fun pos(list: List<Employees>): Int {
//    var posi = list.indexOf("wayne")
//    return posi
//}

/*Question 2: Student Performance Analysis
Scenario: You are analyzing student performance data.
Create a data class Student with properties name (String),
 grade (Int), and subject (String). Write a function that takes
  a list of Student objects and returns a map where the keys are
   subjects and the values are lists of students who have the
   highest grade in that subject.*/
/*
data class Students(
    val name:String,
    val grade:Int,
    val subject:String
)
fun main() {
    var students = listOf(
        Students("Anne",390, "Math")
    )
}*/


/*Question 3: Inventory Management
Scenario: You are managing an inventory system.
Create a data class Product with properties id (Int),
name (String), price (Double), and quantity (Int).
 Write a function that takes a list of Product objects
  and returns a map where the keys are product names and
  the values are the total quantity of each product in stock.*/

/*Question 4: Travel Planner
Scenario: You are developing a travel planner application. Create
a data class Destination with properties city (String), country (String),
 and visitDate (LocalDate). Write a function that takes a list of Destination
 objects and returns a map where the keys are countries and the values are lists
 of cities visited in that country, sorted by the visit date.

/*These questions cover a variety of scenarios and operations you might encounter
when working with data classes in Kotlin, including filtering, grouping, and sorting
 collections. They are designed to challenge your understanding of Kotlin's collection
  functions and data classes, encouraging you to think creatively about how to solve problems
  with these tools.*/
 */













//Psuedocode
//Input a data class for employees in  a list
//Find the average  of the employee's salary and divide it by the length of the objects
//
//Filter the list to get only the salary
//If the average is salary than the average
//Print out the salary.
//If its not greater then don’t print it out


Input  a word
Initialize a counter to 0
Iterate through each word
If the word is lower case convert all the words to lowercase
Increment the counter by 1
Print out the number of  of the word














/*fun main(){
 workers(
     work(listOf("Jane","Anne",12)
    work(listOf("Jane","Anne",34)))
 )   
}

fun work(people: List<Any>): work {

}


data class work(
    val people: List<Any>
        var target: Double
        )

fun workers(work: work) {
   var wor = work.
}*/

/*An array ,hours represents the number of hours worked by
each employee in a company.Give a target t.Write a function that takes the hours array */

/*fun main(){
    (numberOfWorkers(arrayOf(36,48,40,45,62,25,38,40),40))
}
fun numberOfWorkers(hours:Array<Int>,t:): Int {

    var numberOfEmployeea = 0
    for (hour in hours){
        if (hour >= t){
            numberOfEmployeea ++
        }

    }
    println(numberOfEmployeea.toString())
    return numberOfEmployeea
}

*/
//fun main(){
//    println(name(listOf("Jane","Anne of","Helpless community")))
//}
//fun name(list: List<String>): List<String> {
//
////    var name1 = ""
//    var count = 0
//    var m = list.forEach { it.count() }
//    for (k in list){
//        if (k = m[count]) {
//
//            k += list[count]
//            count++
//        }
//    }
//
//return list
//}


//write a program that enables you to add a number  in a contact list.
//you have contact list that you can be able to add or remove elements from the list





///**Create a system that is known as weatherfocust and has a city temperatur name and description
// *  be able to add a city on this  and printit out */

data class CityWeather(val name: String,
                       val temperature: Double,
                       val description: String)

class WeatherFocus {
    val cities = mutableListOf<CityWeather>()

    fun addCity(city: CityWeather) {
        cities.add(city)
    }

    fun printCities() {
        cities.forEach { println("${it.name}: ${it.temperature}°C, ${it.description}") }
    }
}

fun main() {
    val weatherFocus = WeatherFocus()
    weatherFocus.addCity(CityWeather("New York", 20.5, "Sunny"))
    weatherFocus.addCity(CityWeather("London", 15.0, "Cloudy"))
    weatherFocus.printCities()
}


//Psuedocode
//
//Have a dictionary containing the pages and showing them.
//For each list, track how many times it occurs, initializing it to zero
//And group the pages together
//Sort according to the order
//If the pages is among the five appearing most print out
//Else do not print it

