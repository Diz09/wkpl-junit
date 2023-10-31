package belajar.kotlin.unit.test

import org.junit.jupiter.api.Test

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun testAddSuccess(){
        calculator.add(10, 10)
    }

    @Test
    fun testAddSuccess2(){
        calculator.add(10, 10)
    }
}