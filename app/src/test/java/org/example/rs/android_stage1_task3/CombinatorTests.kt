package org.example.rs.android_stage1_task3

import org.example.rs.android_stage1_task3.subtask2.Combinator
import org.junit.Assert.assertEquals
import org.junit.Test

class CombinatorTests {

    private val combinator = Combinator()

    @Test
    fun testCheckChoose1() {
        val result = combinator.checkChooseFromArray(arrayOf(6, 4))
        assertEquals(result, 2)
    }

    @Test
    fun testCheckChoose2() {
        val result = combinator.checkChooseFromArray(arrayOf(4, 4))
        assertEquals(result, 1)
    }

    @Test
    fun testCheckChoose3() {
        val result = combinator.checkChooseFromArray(arrayOf(4, 2))
        assertEquals(result, null)
    }

    @Test
    fun testCheckChoose4() {
        val result = combinator.checkChooseFromArray(arrayOf(35, 7))
        assertEquals(result, 3)
    }

    @Test
    fun testCheckChoose5() {
        val result = combinator.checkChooseFromArray(arrayOf(36, 7))
        assertEquals(result, null)
    }

    @Test
    fun testCheckChoose6() {
        val result = combinator.checkChooseFromArray(arrayOf(184756, 20))
        assertEquals(result, 10)
    }
}