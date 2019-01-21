fun main(args: Array<String>) {

    val program = Program()
    var result = 0          // outside variable or closure

    //val myLambda: (Int, Int) -> Int = { x, y -> x + y }    // Lambda Expression [ Function ]
    //program.addTwoNumbers(2, 7, { x, y -> x + y })     // inside parenthesis
    program.addTwoNumbers(2, 7) { x, y -> result = x + y }     // outside parenthesis
    println(result)
}

class Program {

    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Unit) {    // High level Function with Lambda as Parameter

        action(a, b)  // result = x + y = a + b = 2 + 7 = 9

    }

}



