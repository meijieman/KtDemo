package com.major.ktdemo

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)

        println("啊哈")


        Greeter("World!").greet()

// https://www.runoob.com/kotlin/kotlin-setup.html

    }


    class Greeter(val name: String){
        fun greet(){
            println("hello, $name")
        }
    }


}
