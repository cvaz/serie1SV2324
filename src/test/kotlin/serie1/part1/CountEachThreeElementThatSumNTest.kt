package serie1.part1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountEachThreeElementThatSumNTest {
    @Test
    fun test_countEachThreeElementThatSumTo_in_empty_subsequence() {
        val empty = Array(0) { 0 }
        assertEquals(0, countEachThreeElementsThatSumN(empty, 0, empty.size - 1, 0))
    }

    @Test
    fun test_countEachThreeElementThatSumTo_in_singleton_subsequence() {
        val singleton = arrayOf(1)
        assertEquals(0, countEachThreeElementsThatSumN(singleton, 0, singleton.size - 1, 1))
    }

    @Test
    fun test_countEachThreeElementThatSumTo_in_unsortedConsecutive_subsequence() {
        val array1 = arrayOf(5, 12, 3, 4, 9, 2, 1, 8, 7, 10, 6, 11)
        val array2 = arrayOf(5, 12, 3, 4, 9, 2, 1, 8, 7, 10, 6, 11)
        assertEquals(7, countEachThreeElementsThatSumN(array1, 0, array1.size - 1, 12))
        assertEquals(5, countEachThreeElementsThatSumN(array2, 1, array2.size - 2, 12))
    }

    @Test
    fun test_countEachThreeElementThatSumTo_in_sortConsecutive_subsequence() {
        val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
        assertEquals(7, countEachThreeElementsThatSumN(array, 0, array.size - 1, 12))
        assertEquals(3, countEachThreeElementsThatSumN(array, 1, array.size - 2, 12))
    }

    @Test
    fun test_countEachThreeElementThatSumTo_in_unsortNonConsecutive_subsequence() {
        val array1 = arrayOf(9, 17, 4, 7, 1, 15, 11, 12, 2, 8)
        val array2 = arrayOf(9, 17, 4, 7, 1, 15, 11, 12, 2, 8)
        assertEquals(2, countEachThreeElementsThatSumN(array1, 0, array1.size - 1, 12))
        assertEquals(1, countEachThreeElementsThatSumN(array2, 1, array2.size - 2, 12))
    }

    @Test
    fun test_countEachThreeElementThatSumTo_in_sortNonConsecutive_subsequence() {
        val array = arrayOf(1, 2, 4, 7, 8, 9, 11, 12, 15, 17)
        assertEquals(2, countEachThreeElementsThatSumN(array, 0, array.size - 1, 12))
        assertEquals(0, countEachThreeElementsThatSumN(array, 1, array.size - 2, 12))
    }
}