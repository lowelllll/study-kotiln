package chap08.section2

import java.util.*

fun main() {
    // sorting
    val arr = arrayOf(8, 4, 3, 2, 5, 9, 1)

    val sortedNums = arr.sortedArray()
    println("ASC: ${Arrays.toString(sortedNums)}")

    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DESC: ${Arrays.toString(sortedNumsDesc)}")

    arr.sort()
    println("ORI: ${Arrays.toString(arr)}")
    arr.sortDescending()
    println("ORI: ${Arrays.toString(arr)}")

    // to list
    val listSorted: List<Int> = arr.sorted()
    val listDesc: List<Int> = arr.sortedDescending()

    println("LST: ${listSorted}")
    println("LST: ${listDesc}")

    // key로 정렬
    val items = arrayOf<String>("Dog", "Cat", "Lion", "Po")
    items.sortBy { item -> item.length }
    println(Arrays.toString(items))
}