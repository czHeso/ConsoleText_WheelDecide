fun main(args: Array<String>) {
    println("Welcome to Console version of the Wheel Decide!")
    println("Please enter the single word names you would like to select from (separate with commas without spaces)")
    var options: String = "Test"
    options = readLine().toString()
    val optionsArray = options.split(',').map { it.trim() }
    val optionsList = ArrayList(optionsArray)

    optionsList.shuffle()
    println("I'm slowly mixing the options \n")
    Thread.sleep(5000)
    println("I randomly picked the following:")
    println(optionsList[0])


}