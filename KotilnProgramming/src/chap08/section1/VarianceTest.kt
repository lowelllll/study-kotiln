package chap08.section1

// 사용 지점 변성 (user-site variance)
class Box2<T>(var item: T)

// Type projection..
fun <T> printObjByCovariance(box: Box2<out Animal>) { // Animal이거나 Animal의 하위 자료형
    val obj: Animal = box.item
    println(obj)
}

fun <T> printObjByContravariance(box: Box2<in Animal>) {
    box.item = Animal(10)
    println(box.item)
}

fun main() {
    val animal: Box2<Animal> = Box2(Animal(10))
    val cat: Box2<Cat> = Box2(Cat(20))

    printObjByCovariance<Box2<Animal>>(animal)
    printObjByCovariance<Box2<Cat>>(cat)

    printObjByContravariance<Box2<Animal>>(animal)
    printObjByContravariance<Box2<Any>>(Box2(Any()))
//    printObjByContravariance<Box2<Cat>>(cat) Animal이거나 Animal의 상위 자료형이여야함
}