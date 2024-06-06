package june_2024.fifth

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class VowelCount {
    fun getCount(str: String): Int {
        return str.count {
            it == 'a' || it == 'e' || it == 'i' || it == 'o'
        }
    }

    fun getCount2(str : String) = str.count { it in "aeiou" }

}

class VowelCountTest {
    @Test
    fun testFixed() {
        assertEquals(5, VowelCount().getCount("abracadabra"))
        assertEquals(1, VowelCount().getCount("test"))
        assertEquals(3, VowelCount().getCount("example"))
    }
}