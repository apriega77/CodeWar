package june_2024.fifth

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class StringToNumber {
    fun stringToNumber(str: String): Int {
        return str.toInt()
    }
}

class StringToNumberTest {
    @Test
    fun sampleTests() {
        assertEquals(1234, StringToNumber().stringToNumber("1234"))
        assertEquals(605, StringToNumber().stringToNumber("605"))
        assertEquals(1405, StringToNumber().stringToNumber("1405"))
        assertEquals(-7, StringToNumber().stringToNumber("-7"))
    }
}