package chap07.section1

open class Animal(val name: String)

class Dog(name: String, override var category: String, override var species: String = "dog"): Animal(name), Pet {
    override fun feeding() {
       println("Feed the dog a bone")
    }
}

class Master {
    fun playWithPet(pet: Pet) {
        println("Enjoy with my ${pet.species}")

    }

}

fun main() {
    val master = Master()

    val dog = Dog("Toto", "Small")
    val cat = Cat("Coco", "Bigfat")

    master.playWithPet(dog)
    master.playWithPet(cat)
}