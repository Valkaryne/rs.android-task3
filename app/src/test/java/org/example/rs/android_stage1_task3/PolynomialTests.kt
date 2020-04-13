package org.example.rs.android_stage1_task3

import org.example.rs.android_stage1_task3.subtask1.PolynomialConverter
import org.junit.Assert.assertEquals
import org.junit.Test

class PolynomialTests {

    private var converter: PolynomialConverter = PolynomialConverter()

    @Test
    fun testConvertToString1() {
        val result = converter.convertToStringFrom(arrayOf(2, -1, 78))
        assertEquals(result, "2x^2 - x + 78")
    }

    @Test
    fun testConvertToString2() {
        val result = converter.convertToStringFrom(arrayOf(2, 8, 0, 78))
        assertEquals(result, "2x^3 + 8x^2 + 78")
    }

    @Test
    fun testConvertToString3() {
        val result = converter.convertToStringFrom(arrayOf(2, -6, 45, 5, 32, 0, 3, 5))
        assertEquals(result, "2x^7 - 6x^6 + 45x^5 + 5x^4 + 32x^3 + 3x + 5")
    }

    @Test
    fun testConvertToStringEmptyInputArray() {
        val result = converter.convertToStringFrom(arrayOf())
        assertEquals(result, null)
    }
}