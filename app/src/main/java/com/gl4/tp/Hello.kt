package com.gl4.tp

fun main(args: Array<String>) {
    var hello = "Hello"
    hello = "Hello world!"

    println(hello)

    var toto:String = "Toto"

    println(toto)

    var message: String? = "I’m learning Kotlin!"
    message = null
    println(message?.toString())

    //fonction qui prend 2 valeurs en paramètres et retourne leurs somme
    fun addition(x:Int, y:Int) = x+y

    //correction de la fonction sayMyName
    fun sayMyName(name: String) { println(" $name ") }

    //Simplification de la fonction sayHello
    fun sayHello() = "Hello"

    //Affichage des element de la liste
    fun showList(list: List<String>){
        list.forEach { print(" $it ") }
    }

    //Afficher les nombres imairs jusqu'à 10
    fun oddNumbersTo10(){
        for(i in 0..10){
            if(i%2 == 1) print(" $i ")
        }
    }

    //Fonction operation ( +, -, /,*, %)
    fun operation(a: Int, b: Int, op: Char) :Int{
        when(op){
            '+' -> return a+b
            '-' -> return a-b
            '/' -> return a/b
            '*' -> return a*b
            '%' -> return a%b
            else -> print("L'operateur n'existe pas")
        }
        return 0
    }

    println("Languages :")
    showList(languages)
    println("Odd Numbers to 10 :")
    oddNumbersTo10()
    println(operation(2,2,'*'))
}
private val languages = listOf<String>("Java", "Kotlin", "Swift", "C", "Dart")