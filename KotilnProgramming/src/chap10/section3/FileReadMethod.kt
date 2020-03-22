package chap10.section3

import javafx.beans.binding.StringBinding
import jdk.internal.util.xml.impl.Input
import java.io.*
import java.lang.StringBuilder

fun main() {
    val path = "/Users/yejin/kotlin-io-test.txt"

//    val file = File(path)
//    val inputStream: InputStream = file.inputStream()
//    val inputStreamReader = InputStreamReader(inputStream)
//    val sb = StringBuilder()
//    var line: String?
//
//    val br = BufferedReader(inputStreamReader)
//
//    try {
//        line = br.readLine()
//        while(line != null) {
//            sb.append(line, "\n")
//            line = br.readLine()
//        }
//        println(sb)
//    } catch (e: Exception) {
//    }
//    finally {
//        br.close()
//    }
    val file = File(path)
    val inputStream: InputStream = file.inputStream()
    val text = inputStream.bufferedReader().use { it.readText() }
    println(text)

    // 개선
    val lineList = mutableListOf<String>()
    /*
        useLines
        줄 단위로 처리함. 시퀀스를 사용하고 있고 처리가 완료된 뒤 파일을 닫음.
     */
    File(path).useLines { lines -> lines.forEach { lineList.add(it) } }
    lineList.forEach{ println("> $it") }
}