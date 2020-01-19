package chap03.section3

fun main() {
   oneParam { a -> "Hello Kotiln $a" }
    oneParam { "Hello Kotiln $it" } // 한개일 때 생략 가능

    moreParam { a, b -> "Hello Kotiln! $a, $b" } // 생략 할 수 없음. 
}

fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}