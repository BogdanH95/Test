import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Task3Test {

    @Test
    fun onEmptyArray() = assertFalse(hasDuplicates(intArrayOf()))

    @Test
    fun onSingleElementArray() = assertTrue(!hasDuplicates(intArrayOf(1)))

    @Test
    fun onNoDuplicatesArrayOfInt() = assertFalse(hasDuplicates(intArrayOf(1,2,3,4,5,6,7,8,9,10)))

    @Test
    fun onDuplicatesArrayOfInt() = assertTrue(hasDuplicates(intArrayOf(1,2,10,4,5,6,7,8,9,10)))
}
