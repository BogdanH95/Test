import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Task2Test {

    @Test
    //Exceptional case where index -1 is returned
    // to show that an array of length of less than
    // 2 was given as input.
    fun onEmptyArray() {
        val (max1, max2) = intArrayOf().firstTwoLargest()

        assertEquals(Int.MIN_VALUE, max1)
        assertEquals(Int.MIN_VALUE, max2)
    }

    @Test
    // Same bad input scenario.
    fun onSingleElementArray() {
        val (max1, max2) = intArrayOf(1).firstTwoLargest()

        assertEquals(1, max1)
        assertEquals(Int.MIN_VALUE, max2)
    }

    @Test
    //Usual scenario.
    fun onArrayOfInt() {
        val (max1, max2) = intArrayOf(1, 2, 10, 3, 4, 11, 5, 6, 7, 8, 9).firstTwoLargest()

        assertEquals(11, max1)
        assertEquals(10, max2)
    }

    @Test
    //Test case where the second max is after the first max
    fun onArrayOfIntSecondMaxAfterFirstMax() {
        var (max1, max2) = intArrayOf(1, 2, 3, 10, 5, 6, 7, 8).firstTwoLargest()
        assertEquals(10, max1)
        assertEquals(8, max2)
    }
}
