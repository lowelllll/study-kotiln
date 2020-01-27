package chap07.section2

interface Switcher {
    fun on(): String
}

class Smartphone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}Gb" // private 멤버도 접근 가능
    }

    fun powerOn(): String {
        class Led(val color: String) { // local class powerOn에서만 유효함.
            fun blink(): String = "Blinking $color on $model"
        }

        val powerStatus = Led("Red")
        val powerSwitch = object: Switcher { // 익명 클래스 
            override fun on(): String {
                return powerStatus.blink()
            }
        }

        return powerSwitch.on() // 익명 객체 메서드 사용
    }
}

fun main() {
    val mySdCard = Smartphone("IPhone X").ExternalStorage(32)
    println(mySdCard.size)
}