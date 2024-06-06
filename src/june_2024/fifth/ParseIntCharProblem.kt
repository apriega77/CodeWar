package june_2024.fifth

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class ParseIntCharProblem {
    fun getAge(yearsOld: String): Int {
        return yearsOld.first().digitToInt()
    }
}

class TestAge {
    @Test
    fun basicTests() {

        assertEquals(4, ParseIntCharProblem().getAge("4 years old"));
        assertEquals(5, ParseIntCharProblem().getAge("5 years old"));
        assertEquals(7, ParseIntCharProblem().getAge("7 years old"));

    }

}