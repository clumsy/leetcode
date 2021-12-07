package leetcode;

import leetcode.Problem173.BSTIterator;
import org.junit.Test;

public class Problem173Test {
    private final Problem173 solution = new Problem173();
    
    @Test
    public void example1() {
        TreeNode tree = TreeNodes.treeOf(7,3,15,null,null,9,20);
        BSTIterator iterator = solution.new BSTIterator(tree);
        assert iterator.next() == 3;
        assert iterator.next() == 7;
        assert iterator.hasNext();
        assert iterator.next() == 9;
        assert iterator.hasNext();
        assert iterator.next() == 15;
        assert iterator.hasNext();
        assert iterator.next() == 20;
        assert !iterator.hasNext();
    }
}
