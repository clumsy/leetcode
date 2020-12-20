package problems1_99

import java.util.*

object Problem169Kt {
    object BruteForceSolution {
        fun majorityElement(nums: IntArray): Int {
            val half = (nums.size + 1)/2
            var count = 0;
            for (max in nums) {
                for (num in nums) {
                    if (num == max) {
                        count++
                    }
                    if (count >= half) {
                        return max
                    }
                }
            }
            return nums[0]
        }
    }

    object HashMapSolution {
        fun majorityElement(nums: IntArray): Int {
            val counts = mutableMapOf<Int, Int>()
            var max = nums[0]
            for (num in nums) {
                val count = counts.merge(num, 1) { current, _ ->
                    current + 1
                }!!
                if (count > counts[max] ?: 0) {
                    max = num
                }
            }
            return max
        }
    }

    object RandomizationSolution {
        fun majorityElement(nums: IntArray): Int {
            val half = (nums.size + 1)/2
            val random = Random()
            while (true) {
                val candidate = nums[random.nextInt(nums.size)]
                var count = 0
                for (num in nums) {
                    if (num == candidate) {
                        count++
                    }
                }
                if (count >= half) {
                    return candidate
                }
            }
        }
    }

    object DivideAndConquerSolution {
        fun majorityElement(nums: IntArray): Int {
            return findMajorityElement(nums, 0, nums.size - 1)
        }

        private fun findMajorityElement(nums: IntArray, left: Int, right: Int):Int {
            if (left == right) {
                return nums[left]
            }
            val middle = (left + right)/2
            val leftMajority = findMajorityElement(nums, left, middle)
            val rightMajority = findMajorityElement(nums, middle + 1, right)
            if (leftMajority == rightMajority) {
                return leftMajority
            }
            var countLeft = 0
            var countRight = 0
            for (num in left..middle) {
                when (num) {
                    leftMajority -> countLeft++
                    rightMajority -> countRight++
                }
            }
            for (num in (middle + 1)..right) {
                when (num) {
                    leftMajority -> countLeft++
                    rightMajority -> countRight++
                }
            }
            if (countLeft > countLeft) {
                return leftMajority
            }
            return rightMajority
        }
    }

    object BoyerMooreVotingSolution {
        fun majorityElement(nums: IntArray): Int {
            var max = nums[0]
            var count = 0
            for (num in nums) {
                if (num == max) {
                    count++
                } else {
                    count--
                }
                if (count == 0) {
                    max = num
                    count = 1
                }
            }
            return max
        }
    }
}
