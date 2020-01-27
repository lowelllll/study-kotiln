package chap07.section2

import java.lang.reflect.Member

interface Score {
    fun getScore(): Int
}

enum class MemberType(var prio: String): Score {
    NORMAL("Thrid") {
        override fun getScore(): Int = 100
    },
    SILVER("Second") {
        override fun getScore(): Int {
            return 500
        }
    },
    GOLD("First") {
        override fun getScore(): Int {
           return 1500
        }
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)

    for (grade in MemberType.values()) {
        println("gread.name: ${grade.name}, prio: ${grade.prio}")
    }
}
