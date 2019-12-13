package com.major.ktdemo

import org.junit.Test

/**
 * Desc: TODO
 *
 * Author: meijie
 * PackageName: com.major.ktdemo
 * ProjectName: KtDemo
 * Date: 2019/12/13 14:57
 */
class Test {

    @Test
    fun test0() {
        println("hello")

        val std = Std("yun", 28)
        val std2 = Std("yun")

        println("name: $std")
        println("name: ${std}")

    }

    @Test
    fun test1() {
        vars(1, 2, 3, 4)
    }

    // 可变参数
    fun vars(vararg args: Int) {
        for (arg in args) {
            print(arg)
        }
    }

    @Test
    fun test2() {
        // lambda
        val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
        println(sumLambda(1, 2))
    }

    @Test
    fun test3() {
        // var 定义变量，val 定义常量
        var a: Int = 2
        print(a)
        print("a is $a")
    }

    @Test
    fun test4() {
        // Null 检查机制
        // 类型后面加 ? 表示可为空
        var age: String? = "23"
//        var age: String? = null
        println("len ${age?.length}")

        // 不做处理，返回 null
        val ages1 = age?.toInt()
        // age 为 null 则返回 -1
        val ages2 = age?.toInt() ?: -1

        // 抛出空指针异常
        val ages = age!!.toInt()
    }

}

class Std(name: String, age: Int = 3)

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum2(a: Int, b: Int) = a + b

public fun sum3(a: Int, b: Int): Int = a + b
