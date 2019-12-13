package com.major.ktdemo

import org.junit.Test

/**
 * Desc: TODO
 *
 * Author: meijie
 * PackageName: com.major.ktdemo
 * ProjectName: KtDemo
 * Date: 2019/12/13 15:10
 */
class Test2 {

    @Test
    fun test1() {
        method("3", "2")
    }

    fun method(vararg args: String) {
        if (args.size < 2) {
            print("except atleast 2.")
            return
        }

        val a = parseInt2(args[0])
        val b = parseInt2(args[1])

        if (a != null && b != null) {
            print(a * b)
        } else {
            print("there has null.")
        }
    }

    fun parseInt2(str: String): Int? {
        try {
            return str.toInt()
        } catch (e: NumberFormatException) {
            return null
        } catch (e: Exception) {
            return null
        }
    }

    @Test
    fun test2() {
        getStringLength("aha")
    }

    // Any 类型
    fun getStringLength(obj: Any): Int? {
        if (obj is String) {
            // 做过类型判断后 obj 被自动转换为 String 类型
            return obj.length
        }

        if (obj !is Int) {
            return -1
        }

        return null
    }

    @Test
    fun test3() {
        // 区间
        for (i in 1..4) print(i)

        println()
        for (i in 4..1) print(i) // 什么都不输出
        println()

        val i: Int = 2
        if (i in 1..10) {
            print(i)
        }

        println("---------------")
        for (i in 1..4 step 2) print(i)

        println()

        for (i in 4 downTo 1 step 2) print(i)

        println()

        for (i in 1 until 10) { // [1, 10)
            print(i)
        }
    }

    @Test
    fun test4() {
        val a = 30000
        val b: Int? = a
        val c: Int? = a

        // == 比较值， === 比较地址
        println(a == b)
        println(b == c)
        println(b === c) // a < 128 打印 true， a >= 128 打印 false
    }

    @Test
    fun test5() {
        var a = 0
        while (true) {
            a++
            // val b = a 与 val b:Int? = a 表现还不一样
            val b: Int? = a
            val c: Int? = a
            if (b !== c) {
                println("a is $a")
                break
            }
        }
    }

    @Test
    fun test6() {
        // 类型转换
        val b: Byte = 1
        val i: Int = b.toInt()
        b.toByte()
        b.toShort()
        b.toInt()
        b.toLong()
        b.toFloat()
        b.toDouble()
        b.toChar()

        val l = 1L + 3

    }

    @Test
    fun test7() {
        // 位操作符
        val a: Int = 22;
        a.shl(2) // 左移位 2 <<
        a.shr(2) // 右移位 >>
        a.ushr(2) // 无符号右移位 >>>
        a.and(2) // 与
        a.or(2) // 或
        a.xor(2) // 异或
        a.inv() // 反向

    }

    @Test
    fun test8() {
        val value = decimalDigitValue('9')
        print("value $value")
    }

    fun check(c: Char) {
        if (c == '1') {

        }
    }

    // 字符转换为 Int 数字
    fun decimalDigitValue(c: Char): Int {
        if (c !in '0'..'9') {
            throw IllegalArgumentException("Out of Range")
        }
        return c.toInt()
    }

    @Test
    fun test9() {
        // 布尔
        val b: Boolean? = null
        println("b $b")

        // 数组
        val a = arrayOf(1, 2, 3)
        println(a[0])

        val arr = Array(3, { i -> (i * 2) })

        println(arr)
        println(arr[1])
        println("arr ${arr[2]}")
        arr[2] = 22
        println("arr ${arr[2]}")
        println("arr ${arr.get(2)}")

        // ByteArray, ShortArray, IntArray

    }

    @Test
    fun test10() {


        // 字符串
        val text = """第一行
            |第二行
            |第三行
        """.trimMargin()
        // .trimMargin() 删除前置空格， | 用作边界前缀
        println(text)

        val str = "我是major"
        for(s in str)
            println(s)
    }
}


