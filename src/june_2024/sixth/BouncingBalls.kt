package june_2024.sixth

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

/*
A child is playing with a ball on the nth floor of a tall building. The height of this floor above ground level, h, is known.

He drops the ball out of the window. The ball bounces (for example), to two-thirds of its height (a bounce of 0.66).

His mother looks out of a window 1.5 meters from the ground.

How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing)?

Three conditions must be met for a valid experiment:
Float parameter "h" in meters must be greater than 0
Float parameter "bounce" must be greater than 0 and less than 1
Float parameter "window" must be less than h.
If all three conditions above are fulfilled, return a positive integer, otherwise return -1.

Note:
The ball can only be seen if the height of the rebounding ball is strictly greater than the window parameter.

*/

class BouncingBalls {
    fun bouncingBall(h: Double, bounce: Double, window: Double): Int {
        var currentHeight: Double = h
        var bouncingBall = 0

        while (currentHeight > window) {
            currentHeight = h * bounce
            bouncingBall++
        }
        return bouncingBall
    }
}

class BouncingBallTest {
    @Test
    fun test1() {
        assertEquals(3, BouncingBalls().bouncingBall(3.0, 0.66, 1.5))
    }

    @Test
    fun test2() {
        assertEquals(15, BouncingBalls().bouncingBall(30.0, 0.66, 1.5))
    }

}