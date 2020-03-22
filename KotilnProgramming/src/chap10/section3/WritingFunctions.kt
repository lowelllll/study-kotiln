package chap10.section3

import java.io.File
import java.io.FileWriter
import java.io.PrintWriter

fun main() {
    val outString = "안녕하세요\tHello"
    val path = "/Users/yejin/kotiln-io-test.txt"

    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString) // 파일에 쓰기
    printWriter.close()

    File(path).printWriter().use { out -> out.println(outString) }

    /*
        bufferedWriter
        버퍼를 사용함
        내용을 메모리에 특정 공간에 저장한 뒤 파일로 다시 쓰여짐.
     */
    File(path).bufferedWriter().use { it.write(outString) }

    File(path).run {
        writeText(outString)
        appendText("Do great Work!")
    }

    FileWriter(path, true).use { it.write(outString) }
    
}