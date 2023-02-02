fun main(args: Array<String>) {
    //Assigning Variables and Giving Values to Them

    val isAKenyaCitizen = true

    var studentsNumbers = arrayOf(757197885, 21601652, 14760390)
    var studentsages = arrayOf(21, 23, 25)
    var studentsweights = arrayOf(50, 60, 65)

    val student1 = arrayOf("Esther Kanoro", studentsNumbers[0], studentsages[0], studentsweights[0], isAKenyaCitizen)
    println(student1.contentToString())
    val student2 = arrayOf("Veronica Ndemo", studentsNumbers[1], studentsages[1], studentsweights[1], !isAKenyaCitizen)
    println(student2.contentToString())
    val student3 = arrayOf("Alvin Waweru", studentsNumbers[2], studentsages[2], studentsweights[2], isAKenyaCitizen)
    println(student3.contentToString())



}