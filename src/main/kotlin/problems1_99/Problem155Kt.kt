package problems1_99

object Problem155Kt {
    class SingleStackSolution {
        class MinStack {
            class Node(val value: Int, val min:Int, var next: Node?)

            /** initialize your data structure here. */
            private var top: Node? = null

            fun push(x: Int) {
                top = Node(x, x.coerceAtMost(top?.min ?: x), top)
            }

            fun pop() {
                top = top?.next
            }

            fun top(): Int {
                return top!!.value
            }

            fun getMin(): Int {
                return top!!.min
            }
        }
    }

    class MinVariableSolution {
        class MinStack {
            class Node(val value: Int, var next: Node?)

            /** initialize your data structure here. */
            private var top: Node? = null
            private var min: Int = Int.MAX_VALUE

            fun push(x: Int) {
                if (x <= min) {
                    top = Node(min, top)
                    min = x
                }
                top = Node(x, top)
            }

            fun pop() {
                val pop = top
                top = top?.next
                if (pop?.value == min) {
                    min = top!!.value
                    top = top?.next
                }
            }

            fun top(): Int {
                return top!!.value
            }

            fun getMin(): Int {
                return min
            }
        }
    }
}
