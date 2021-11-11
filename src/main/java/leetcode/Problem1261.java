package leetcode;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BIT_MANIPULATION)
@BeatsPercent(99.77)
@TimeComplexity(worst = Complexity.LOGARITHMIC_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1261 {
    class FindElements {
        private final TreeNode root;

        public FindElements(TreeNode root) {
            this.root = root;
        }

        public boolean find(int target) {
            target++;
            TreeNode current = root;
            int mask = Integer.highestOneBit(target);
            while (mask > 1 && current != null) {
                mask >>= 1; // ignoring highest 1 bit
                current = (target & mask) == mask ? current.right : current.left;
            }
            return current != null;
        }
    }
}
