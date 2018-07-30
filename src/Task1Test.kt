import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import test.agileFreaks.sumOfEven

internal class Task1Test {

    @Test
    fun onEmptyArray() {
        assertEquals(0, intArrayOf().sumOfEven())
    }

    @Test
    fun onArrayOfInt(){
        assertEquals(6, intArrayOf(1,1,2,1,2,1,1,2,1,1).sumOfEven())
    }
}
