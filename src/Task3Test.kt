import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Task3Test {

    @Test
    //Exceptional case where index -1 is returned
    // to show that an array of length of less than
    // 2 was given as input.
    fun onEmptyArray() = assertTrue(!intArrayOf().hasDuplicates())

    @Test
    // Same bad input scenario.
    fun onSingleElementArray() = assertTrue(!intArrayOf().hasDuplicates())

    @Test
    //Usual scenario.
    fun onNoDuplicatesArrayOfInt() = assertTrue(intArrayOf(1,2,3,4,5,6,7,8,9,10).hasDuplicates())

    @Test
    //Usual scenario.
    fun onDuplicatesArrayOfInt() = assertTrue(intArrayOf(1,2,10,4,5,6,7,8,9,10).hasDuplicates())
}
