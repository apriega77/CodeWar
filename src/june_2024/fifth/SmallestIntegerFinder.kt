package june_2024.fifth

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class SmallestIntegerFinder {

    fun findSmallestInt(nums: List<Int>): Int {
        return nums.sorted().first()
    }


}

class Test {

    @Test
    fun exampleTests() {
        val sif: SmallestIntegerFinder = SmallestIntegerFinder()
        assertEquals(10, sif.findSmallestInt(listOf(15, 20, 10, 17, 22, 9001)))
    }

}