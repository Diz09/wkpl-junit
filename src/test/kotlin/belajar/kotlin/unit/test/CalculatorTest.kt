package belajar.kotlin.unit.test

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun testAddSuccess(){
        val result = calculator.add(10, 10)
        assertEquals(20, result)
    }

    @Test
    fun testAddSuccess2(){
        val result = calculator.add(4, 5)
        assertEquals(9, result)
    }
}

/*
dibuat class CalculatorTest yang berfungsi sebagai class untuk melakukan test terhadap class Calculator yang telah selesai dibuat
berikut penjelasan kode didalamnya
1. 'private val calculator = Calculator()' merupakan deklarasi variabel calculator yang berguna untuk membuat instance dari class Calculator. ini dilakukan untuk menguji metode 'add' yang berada pada class Calculator()
2. '@Test' merupakan penanda untuk metode penguji, method yang diberikan penanda ini akan diidentifikasi sebagai kerangka pengujian (JUnit)
3. 'fun testAddSuccess(){...}' merupakan metode pengujian pertama
4. 'calculator.add(10,10)' didalam metode 'testAddSuccess' akan menguji metode 'add' dalam class 'Calculator' dengan argumen 10 untuk parameter 'first' dan 10 untuk parameter 'second'
5. 'assertEquals(20, result)' merupakan fungsi untuk memeriksa apakah hasil dari penjemlahan yang dilakukan benar dan menghasilkan nilai 20
6. 'fun testAddSuccess2(){...}' merupakan metode pengujian kedua dengan isi pengujian yang dibuah menjadi 4 dan 5
 */