package june_2024.fifth

import org.testng.Assert.assertEquals
import org.testng.annotations.Test
import kotlin.math.sqrt


/*
My grandfather always predicted how old people would get, and right before he passed away he revealed his secret!

In honor of my grandfather's memory we will write a function using his formula!

Take a list of ages when each of your great-grandparent died.
Multiply each number by itself.
Add them all together.
Take the square root of the result.
Divide by two.
*/

class PredictYourAge {

    fun predictAge(age1: Int, age2: Int, age3: Int, age4: Int, age5: Int, age6: Int, age7: Int, age8: Int): Int {
        val totalAge =
            (age1 + age2 + age3 + age4 + age5 + age6 + age7 + age8) * (age1 + age2 + age3 + age4 + age5 + age6 + age7 + age8)
        val sqrt = sqrt(totalAge.toDouble()).toInt()
        return sqrt.div(2)
    }
}

class PredictYourAgeTest {

    @Test
    @Throws(Exception::class)
    fun predictAge(age1: Int, age2: Int) {
        assertEquals(86, PredictYourAge().predictAge(65, 60, 75, 55, 60, 63, 64, 45))
        assertEquals(79, PredictYourAge().predictAge(32, 54, 76, 65, 34, 63, 64, 45))
    }

}