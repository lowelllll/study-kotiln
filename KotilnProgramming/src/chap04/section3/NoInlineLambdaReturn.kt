package chap04.section3

fun main() {
    refFunc2()
}

fun inlineLambda2(a: Int, b: Int, out: (Int, Int) -> Unit) {
    out(a, b)
}

fun refFunc2() {
    println("start of refFunc")

    inlineLambda(13, 3) lit@ { a, b ->
        val result = a + b
        if (result > 10) return@lit // 라벨 정의 lit부분에서 return됨
        println("result: $result")
    }

//    inlineLambda(13, 3) { a, b ->
//        val result = a + b
//        if (result > 10) return@inlineLambda // 라벨 정의 lit부분에서 return됨
//        println("result: $result")
//    }

//    inlineLambda(13, 3, fun (a, b) { 익명함수
//        val result = a + b
//        if (result > 10) return
//        println("result: $result")
//    })

    println("end of refFunc")
}