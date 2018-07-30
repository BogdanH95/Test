import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Task3Test {

    @Test
    //Exceptional case where index -1 is returned
    // to show that an array of length of less than
    // 2 was given as input.
    fun onEmptyArray() = assertTrue(!hasDuplicates(intArrayOf()))

    @Test
    // Same bad input scenario.
    fun onSingleElementArray() = assertTrue(!hasDuplicates(intArrayOf(1)))

    @Test
    //Usual scenario without duplicates.
    fun onNoDuplicatesArrayOfInt() = assertTrue(hasDuplicates(intArrayOf(1,2,3,4,5,6,7,8,9,10)))

    @Test
    //Usual scenario with 10 as a duplicate.
    fun onDuplicatesArrayOfInt() = assertTrue(hasDuplicates(intArrayOf(1,2,10,4,5,6,7,8,9,10)))
}
