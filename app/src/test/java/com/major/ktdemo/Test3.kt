package com.major.ktdemo

import org.junit.Test

/**
 * Desc: TODO
 *
 * Author: meijie
 * PackageName: com.major.ktdemo
 * ProjectName: KtDemo
 * Date: 2019/12/13 18:14
 */

class Test3 {

    @Test
    fun test1() {
        val a = 3
        val b = 5

        val max = max(a, b)

        println("max $max")

        println("max ${max2(a, b)}")
    }

    fun max(a: Int, b: Int): Int {
        var max: Int
        if (a > b)
            max = a
        else
            max = b

        return max
    }

    fun max2(a: Int, b: Int): Int {
        var max = if (a > b) a else b
        println(max)
        return max
    }

    fun max3(a: Int, b: Int): Int {
        // 简化版
        return if (a > b) a else b
    }

    @Test
    fun test2() {
        val x = 2
        when (x) {
            1 -> println("x == 1")
            2 -> println("x == 2")
            3, 4 -> println("x == 3 or 4")
            else -> println("nor.. either ..")
        }


        when (x) {
            in 1..10 -> println("x is in the range")
//            in validNumbers -> println("x is valid")
            !in 10..20 -> println("x is outside the range")
            else -> println("none of the above")
        }


        var str = "wo"

        when (str) {
            "wo" -> {
                println("a")
            }
            "end" -> println("ccc")

        }


        // https://www.runoob.com/kotlin/kotlin-condition-control.html

    }

    @Test
    fun test3() {

    }

    @Test
    fun test4() {

    }

    @Test
    fun test5() {

    }

    @Test
    fun test6() {

    }

    @Test
    fun test7() {

    }

    @Test
    fun test8() {

    }
}