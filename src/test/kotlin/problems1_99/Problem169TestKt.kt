package problems1_99

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class Problem169TestKt {

    @Test
    fun `(Brute-Force) Finds simple majority`() {
        val nums = intArrayOf(3, 2, 3)
        assertThat(3, `is`(Problem169Kt.BruteForceSolution.majorityElement(nums)))
    }

    @Test
    fun `(Brute-Force) Finds complex majority`() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        assertThat(2, `is`(Problem169Kt.BruteForceSolution.majorityElement(nums)))
    }

    @Test
    fun `(HashMap) Finds simple majority`() {
        val nums = intArrayOf(3, 2, 3)
        assertThat(3, `is`(Problem169Kt.HashMapSolution.majorityElement(nums)))
    }

    @Test
    fun `(HashMap) Finds complex majority`() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        assertThat(2, `is`(Problem169Kt.HashMapSolution.majorityElement(nums)))
    }

    @Test
    fun `(Randomization) Finds simple majority`() {
        val nums = intArrayOf(3, 2, 3)
        assertThat(3, `is`(Problem169Kt.RandomizationSolution.majorityElement(nums)))
    }

    @Test
    fun `(Randomization) Finds complex majority`() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        assertThat(2, `is`(Problem169Kt.RandomizationSolution.majorityElement(nums)))
    }

    @Test
    fun `(Divide & Conquer) Finds simple majority`() {
        val nums = intArrayOf(3, 2, 3)
        assertThat(3, `is`(Problem169Kt.DivideAndConquerSolution.majorityElement(nums)))
    }

    @Test
    fun `(Divide & Conquer) Finds complex majority`() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        assertThat(2, `is`(Problem169Kt.DivideAndConquerSolution.majorityElement(nums)))
    }

    @Test
    fun `(Boyer-Moore Voting) Finds simple majority`() {
        val nums = intArrayOf(3, 2, 3)
        assertThat(3, `is`(Problem169Kt.BoyerMooreVotingSolution.majorityElement(nums)))
    }

    @Test
    fun `(Boyer-Moore Voting) Finds complex majority`() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        assertThat(2, `is`(Problem169Kt.BoyerMooreVotingSolution.majorityElement(nums)))
    }
}
