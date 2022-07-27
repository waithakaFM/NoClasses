import java.io.FileReader
import java.io.IOException
import java.util.TreeMap

fun main(args: Array<String>) {
    println("Hello kotlin!")
    var q = Question()

    q.answer = "I don't know"
    println("Question: ${q.question}")
    q.display()

//    if(q.answer == q.correctAns){
//        println("Correct")
//    }else{
//        println("Try again")
//    }
    val message = if (q.answer == q.correctAns){
        "Correct"
    }else{
        "try again"
    }
    println(message)

    q.printResults()

//    extract int from string
    val number: Int? = try {
        Integer.parseInt(q.answer)
    } catch (e:NumberFormatException){
        null
    }

    println("Number is $number")

//    range of values
    for (i in 1..10){
        print(i)
    }
    print("\n")

    for (i in 10 downTo 1 step 2){
        print(i)
    }
    print("\n")

//    half closed range
    for (i in 1 until 12 step 3){
        print(i)
    }
    print("\n")

    myMap()
}

// using for loop in maps
fun myMap(){
    var ages = TreeMap<String, Int>()
    ages["Frank"] = 12
    ages["Johnny"] = 45
    ages["Nimoh"] = 90
    ages["Tom"] = 14

    for ((name, age) in ages){
        println("$name is $age")
    }

    val myList = listOf<String>("Johnny", "Mukami", "Ndegwa", "Kwenda")

    for ((index, element) in myList.withIndex()){
        println("$element at $index")
    }

}

// use catch exception
fun getReader(){
    var reader = FileReader("filename")

    try {
        reader.read()
    }catch (e: IOException){
        
    }finally {

    }
}

class Question{
//    answer also be null
    var answer: String? = null

    val correctAns = "42"
    val question: String = "What is the answer to life, universe and everything?"

    fun display(){
        println("You said $answer")
    }

    fun printResults(){
//        when is similar to switch statement
        when (answer) {
            correctAns -> {
                println("This is correct")
            }
            else -> {
                println("Wrong!!")
            }
        }
    }
}