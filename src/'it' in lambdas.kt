fun main(args: Array<String>) {

    var str = string()
    str.reverseAndDisplay("hello") { it.reversed() }
}

class string {

    fun reverseAndDisplay(str: String, myFunc: (String) -> String) {

        var result = myFunc(str)  // it.reversed() ==> str.reversed() ==> "hello".reversed() = "olleh"
        println(result)
    }

}