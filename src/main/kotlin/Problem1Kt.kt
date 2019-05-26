import java.util.HashMap

class Problem1Kt {
    companion object {
        fun twoSum(nums: IntArray, target: Int): IntArray {
            val size = nums.size
            val ints = HashMap<Int, Int>(size, 1f)
            for (i in 0 until size) {
                ints[nums[i]] = i
            }
            for (i in 0 until size) {
                val j = ints[target - nums[i]]
                if (j != null && i != j) {
                    return intArrayOf(i, j)
                }
            }
            return IntArray(0)
        }
    }
}