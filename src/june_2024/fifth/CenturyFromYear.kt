package june_2024.fifth

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

//Introduction
//The first century spans from the year 1 up to and including the year 100, the second century - from the year 101 up to and including the year 200, etc.
//
//Task
//Given a year, return the century it is in.

class CenturyFromYear {
    fun century(number: Int): Int {
        val result = number / 100
        val addOne = if (number % 100 == 0) 0 else 1
        return result.plus(addOne)
    }

    fun century2(number: Int) = (number +99) / 100

}


class CenturyFromYearTest {

    @Test
    fun testFixed() {
        assertEquals(18, CenturyFromYear().century(1705));
        assertEquals(19, CenturyFromYear().century(1900));
        assertEquals(17, CenturyFromYear().century(1601));
        assertEquals(20, CenturyFromYear().century(2000));
        assertEquals(1, CenturyFromYear().century(89));
    }
}