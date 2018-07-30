import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import test.agileFreaks.Task1

internal class Task1KtTest {

    @Test
    fun onEmptyArray() {
        assertEquals(0, intArrayOf().Task1())
    }

    @Test
    fun onArrayOfInt(){
        assertEquals(6, intArrayOf(1,1,2,1,2,1,1,2,1,1).Task1())
    }
}
