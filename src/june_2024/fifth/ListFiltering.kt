package june_2024.fifth

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

/*
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.

*/

class ListFiltering {
    fun filterList(l: List<Any>): List<Int> {
     return   l.filterIsInstance<Int>()
    }
}

class ListFilteringTest {
    @Test
    fun basicTests() {
        assertEquals(listOf(1, 2), ListFiltering().filterList(listOf(1, 2, 'a', 'b')), "For input [1, 2, 'a', 'b']")
        assertEquals(
            listOf(1, 0, 15),
            ListFiltering().filterList(listOf(1, 'a', 'b', 0, 15)),
            "For input [1, 'a', 'b', 0, 15]"
        )
        assertEquals(
            listOf(1, 2, 123),
            ListFiltering().filterList(listOf(1, 2, "aasf", '1', "123", 123)),
            "For input [1, 2, 'aasf', '1', '123', 123]"
        )
    }
}
