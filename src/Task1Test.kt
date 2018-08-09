import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Task1Test {

    @Test
    fun isEvenOnEvenNumber(){
        assertTrue(2.isEven())
    }

    @Test
    fun isEvenOnOddNumber(){
        assertFalse(1.isEven())
    }

    @Test
    fun sumOfEvenOnEmptyArray() {
        assertEquals(0, intArrayOf().sumOfEven())
    }

    @Test
    fun sumOfEvenOnArrayOfInt(){
        assertEquals(6, intArrayOf(1,1,2,1,2,1,1,2,1,1).sumOfEven())
    }
}
