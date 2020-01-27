package chap07.coffeeMaker

class MyDripCoffeeModule: CoffeeModule {
    companion object {
        val electricHeater: ElectricHeater by lazy { // 지연 초기화
            ElectricHeater()
        }
    }

    private val _thermosiphon: Thermosiphon by lazy { // 객체에 접근할 때 생성됨.
        Thermosiphon(electricHeater)
    }

    override fun getThermosiphon(): Thermosiphon = _thermosiphon

}