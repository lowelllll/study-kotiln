package chap10.section1

import java.io.File
import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("/Users/yejin/output.txt")).use {  // 자동으로 close()함수 호출
        it.println("hello")
    }

    File("/Users/yejin/output.txt").bufferedReader().use {
        println(it.readText())
    }
}