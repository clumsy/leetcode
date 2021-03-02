package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

@Beats100Percent
public class Problem225 {
    class MyStack {
        private Queue<Integer> head = new ArrayDeque<>();
        private Queue<Integer> rest = new ArrayDeque<>();
    
        /** Initialize your data structure here. */
        public MyStack() {
            
        }
        
        /** Push element x onto stack. */
        public void push(int x) {
            while (!head.isEmpty()) {
                rest.offer(head.remove());
            }
            head.offer(x);
        }
        
        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int popped = head.remove();
            while (rest.size() > 1) {
                head.offer(rest.remove());
            }
            Queue<Integer> tmp = rest;
            rest = head;
            head = tmp;
            return popped;
        }
        
        /** Get the top element. */
        public int top() {
            return head.peek();
        }
        
        /** Returns whether the stack is empty. */
        public boolean empty() {
            return head.isEmpty();
        }
    }
}
