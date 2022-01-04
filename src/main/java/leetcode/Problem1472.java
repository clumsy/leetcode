package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.STACK)
@BeatsPercent(46.83)
public class Problem1472 {
    class BrowserHistory {
        private final Deque<String> history = new ArrayDeque<>(); 
        private Deque<String> future; 

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public BrowserHistory(String homepage) {
            doVisit(homepage);
        }
        
        private void doVisit(String url) {
            history.push(url);
            future = new ArrayDeque<>();
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT) // literally 1
        public void visit(String url) {
            doVisit(url);
        }

        @TimeComplexity(worst = Complexity.LINEAR_N) // where N = steps
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public String back(int steps) {
            while (history.size() > 1 && steps-- > 0) {
                future.push(history.pop());
            }
            return history.peek();
        }

        @TimeComplexity(worst = Complexity.LINEAR_N) // where N = steps
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public String forward(int steps) {
            while (!future.isEmpty() && steps-- > 0) {
                history.push(future.pop());
            }
            return history.peek();
        }
    }
}
