package problems1_99

import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class Problem155TestKt {

    @Test
    fun `(SingleStack) Returns minimum`() {
        val minStack = Problem155Kt.SingleStackSolution.MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        assertThat(minStack.getMin(), `is`(-3))
        minStack.pop()
        assertThat(minStack.top(), `is`(0))
        assertThat(minStack.getMin(), `is`(-2))
    }

    @Test
    fun `(SingleStack) Another minimum`() {
        val minStack = Problem155Kt.SingleStackSolution.MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-1)
        assertThat(minStack.getMin(), `is`(-2))
        assertThat(minStack.top(), `is`(-1))
        minStack.pop()
        assertThat(minStack.getMin(), `is`(-2))
    }

    @Test
    fun `(MinVariable) Returns minimum`() {
        val minStack = Problem155Kt.MinVariableSolution.MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-3)
        assertThat(minStack.getMin(), `is`(-3))
        minStack.pop()
        assertThat(minStack.top(), `is`(0))
        assertThat(minStack.getMin(), `is`(-2))
    }

    @Test
    fun `(MinVariable) Another minimum`() {
        val minStack = Problem155Kt.MinVariableSolution.MinStack()
        minStack.push(-2)
        minStack.push(0)
        minStack.push(-1)
        assertThat(minStack.getMin(), `is`(-2))
        assertThat(minStack.top(), `is`(-1))
        minStack.pop()
        assertThat(minStack.getMin(), `is`(-2))
    }

    @Test
    fun `(MinVariable) Special minimum`() {
        val minStack = Problem155Kt.MinVariableSolution.MinStack()
        minStack.push(0)
        minStack.push(1)
        minStack.push(0)
        assertThat(minStack.getMin(), `is`(0))
        minStack.pop()
        assertThat(minStack.getMin(), `is`(0))
    }

    @Test
    fun `(MinVariable) Tricky minimum`() {
        val minStack = Problem155Kt.MinVariableSolution.MinStack()
        minStack.push(2)
        minStack.push(0)
        minStack.push(3)
        minStack.push(0)
        assertThat(minStack.getMin(), `is`(0))
        minStack.pop()
        minStack.pop()
        minStack.pop()
        assertThat(minStack.getMin(), `is`(2))
    }
}
