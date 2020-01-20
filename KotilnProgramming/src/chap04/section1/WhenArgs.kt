package chap04.section1

fun main() {
    print("Enter the score: ")

    val score = readLine()!!.toDouble()
    var grade: Char = 'F'

    when (score) { // break 없어도 되는 switch
        in 90.0..100.0 -> grade = 'A'
        in 80.0..89.9 -> grade = 'B'
        in 70.0..79.9 -> grade = 'C'
        !in 70.0..100.0 -> grade = 'F' // 이런것도 됨
    }

    println("Score: $score, Grade: $grade")
}