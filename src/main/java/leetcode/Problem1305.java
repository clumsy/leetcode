package leetcode;

import java.util.ArrayList;
import java.util.List;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.BINARY_TREE_MORRIS_TRAVERSAL)
@BeatsPercent(98.68)
@TimeComplexity(worst = Complexity.N_PLUS_M)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1305 {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        TreeNode parent1 = root1;
        TreeNode parent2 = root2;
        while (parent1 != null || parent2 != null) {
            if ((parent1 != null && parent1.left != null) || (parent2 != null && parent2.left != null)) {
                if (parent1 != null && parent1.left != null) {
                    parent1 = processLeftTree(parent1); // move to next node in order in tree #1
                } else {
                    parent2 = processLeftTree(parent2); // move to next node in order in tree #2
                }
            } else {
                if (parent1 == null) { // if traversal of one tree is done. continue the traversal on the other one only
                    result.add(parent2.val);
                    parent2 = parent2.right;
                } else if (parent2 == null) {
                    result.add(parent1.val);
                    parent1 = parent1.right;
                } else {
                    if (parent1.val <= parent2.val) { // only continue traversal from node with smaller value
                        result.add(parent1.val);
                        parent1 = parent1.right;
                    } else {
                        result.add(parent2.val);
                        parent2 = parent2.right;
                    }
                }
            }
        }

        return result;
    }

    private static TreeNode processLeftTree(TreeNode parent) {
        TreeNode current = parent.left;
        while (current.right != null) {
            current = current.right;
        }
        current.right = parent;
        parent = parent.left;
        current.right.left = null; // we flatten the tree and never fix it again
        return parent;
    }
}
