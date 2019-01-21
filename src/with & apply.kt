fun main(args: Array<String>) {

    var person = Person()

    with(person) {
        name = "Mayank"
        age = 23
    }

    person.apply {
        name = "Mayank"
        age = 23
    }.startRun()

    println(person.name)
    println(person.age)

}


class Person {

    var name: String = ""
    var age: Int = -1

    fun startRun() {
        println("now i am ready to run")
    }
}