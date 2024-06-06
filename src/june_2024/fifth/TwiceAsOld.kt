package june_2024.fifth

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class TwiceAsOld {
    fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
        val yearsOld = (dadYearsOld - (sonYearsOld * 2))
        return if (yearsOld < 0) yearsOld * -1 else yearsOld
    }
}

class TestExample {
    @Test
    fun testFixed() {
        assertEquals(22, TwiceAsOld().twiceAsOld(36, 7))
        assertEquals(5, TwiceAsOld().twiceAsOld(55, 30))
        assertEquals(0, TwiceAsOld().twiceAsOld(42, 21))
        assertEquals(20, TwiceAsOld().twiceAsOld(22, 1))
        assertEquals(29, TwiceAsOld().twiceAsOld(29, 0))
    }
}
