package june_2024.fifth

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

/*Create a function that takes a Roman numeral as its argument and returns its value as a numeric decimal integer.
You don't need to validate the form of the Roman numeral.

    Modern Roman numerals are written by expressing each decimal digit of the number to be encoded separately,
starting with the leftmost digit and skipping any 0s. So 1990 is rendered "MCMXC" (1000 = M, 900 = CM, 90 = XC) and 2008
is rendered "MMVIII" (2000 = MM, 8 = VIII). The Roman numeral for 1666, "MDCLXVI", uses each letter in descending order.*/


class RomanNumeralsDecoder {

    fun decode(str: String): Int {

        val romanMap = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )
        var result = 0
        var prevValue = 0
        for (i in str.length - 1 downTo 0) {
            val value = romanMap[str[i]] ?: 0
            if (value < prevValue) {
                result -= value
            } else {
                result += value
            }
            prevValue = value
        }

        return result
    }

}

class TestDecode {
    @Test
    fun basic() {
        assertEquals(0, RomanNumeralsDecoder().decode(""))
        assertEquals(1, RomanNumeralsDecoder().decode("I"))
        assertEquals(21, RomanNumeralsDecoder().decode("XXI"))
        assertEquals(2008, RomanNumeralsDecoder().decode("MMVIII"))
        assertEquals(1666, RomanNumeralsDecoder().decode("MDCLXVI"))
    }

}