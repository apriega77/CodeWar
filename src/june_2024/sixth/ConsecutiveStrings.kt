package june_2024.sixth

import org.testng.Assert.assertEquals
import org.testng.annotations.Test


class ConsecutiveStrings {
    fun longestConsec(strarr: Array<String>, k: Int): String {
        if (strarr.isEmpty() || k > strarr.size || k <= 0) return ""
        val list = ArrayList<String>()
        for (i in 0..strarr.size - k) {
            list.add(strarr.slice(i..<i + k).joinToString(""))
        }
        return list.maxBy { it.length }
    }

    fun longestConsec2(strarr: Array<String>, k: Int): String {
        val n = strarr.size
        return if (n == 0 || k > n || k <= 0) ""
        else strarr.asSequence()
            .windowed(k)
            .map { it.joinToString("") }
            .maxBy { it.length } ?: ""
    }
}

class LongestConsecMainTest {
    //.........................
    @Test
    fun test() {
        println("longestConsec Fixed Tests")
        testing(
            ConsecutiveStrings().longestConsec(
                arrayOf<String>(
                    "zone",
                    "abigail",
                    "theta",
                    "form",
                    "libe",
                    "zas",
                    "theta",
                    "abigail"
                ), 2
            ), "abigailtheta"
        )
        testing(
            ConsecutiveStrings().longestConsec(
                arrayOf<String>(
                    "ejjjjmmtthh",
                    "zxxuueeg",
                    "aanlljrrrxx",
                    "dqqqaaabbb",
                    "oocccffuucccjjjkkkjyyyeehh"
                ), 1
            ), "oocccffuucccjjjkkkjyyyeehh"
        )

    }

    companion object {
        private fun testing(actual: String, expected: String) {
            assertEquals(expected, actual)
        }
    }
}