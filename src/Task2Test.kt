import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Task2Test {

    @Test
    fun onEmptyArray() {
        val (max1, max2) = intArrayOf().firstTwoLargest()

        assertEquals(Int.MIN_VALUE, max1)
        assertEquals(Int.MIN_VALUE, max2)
    }

    @Test
    fun onSingleElementArray() {
        val (max1, max2) = intArrayOf(1).firstTwoLargest()

        assertEquals(1, max1)
        assertEquals(Int.MIN_VALUE, max2)
    }

    @Test
    fun onArrayOfInt() {
        val (max1, max2) = intArrayOf(1, 2, 10, 3, 4, 11, 5, 6, 7, 8, 9).firstTwoLargest()

        assertEquals(11, max1)
        assertEquals(10, max2)
    }

    @Test
    fun onArrayOfIntSecondMaxAfterFirstMax() {
        var (max1, max2) = intArrayOf(1, 2, 3, 10, 5, 6, 7, 8).firstTwoLargest()
        assertEquals(10, max1)
        assertEquals(8, max2)
    }
}
