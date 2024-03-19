package serie1.part1
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CountPairsThatSumNTest {

    @Test
    fun test_countPairsThatSumN_in_empty_subsequence() {
        val empty = Array<Int>(0){0}
        assertEquals(0, countPairsThatSumN(empty, 0, empty.size - 1, 0))
    }

    @Test
    fun test_countPairsThatSumN_in_singleton_subsequence() {
        val singleton = arrayOf(1)
        assertEquals(0, countPairsThatSumN(singleton, 0, singleton.size - 1, 1))
    }

    @Test
    fun countPairsThatSumN_in_consecutive_subsequence() {
        val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)
        assertEquals(5, countPairsThatSumN(array, 0, array.size - 1, 12))
        assertEquals(4, countPairsThatSumN(array, 1, array.size - 1, 12))
    }

    @Test
    fun countPairsThatSumN_in_sortNonConsecutive_subsequence() {
        val array = arrayOf(1, 2, 4, 7, 8, 9, 11, 12, 15, 17)
        assertEquals(2, countPairsThatSumN(array, 0, array.size - 1, 12))
        assertEquals(1, countPairsThatSumN(array, 1, array.size - 2, 12))
    }
}