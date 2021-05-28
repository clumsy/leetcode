package leetcode;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Problem116Test {
    private final Problem116 solution = new Problem116();
    
    @Test
    public void example1() {
        Problem116.Node root = solution.new Node(1);
        root.left = solution.new Node(2);
        root.right = solution.new Node(3);
        root.left.left = solution.new Node(4);
        root.left.right = solution.new Node(5);
        root.right.left = solution.new Node(6);
        root.right.right = solution.new Node(7);
        
        Problem116.Node expected = solution.new Node(1);
        expected.left = solution.new Node(2);
        expected.right = solution.new Node(3);
        expected.left.next = expected.right;
        expected.left.left = solution.new Node(4);
        expected.left.right = solution.new Node(5);
        expected.left.left.next = expected.left.right;
        expected.right.left = solution.new Node(6);
        expected.right.right = solution.new Node(7);
        expected.right.left.next = expected.right.right;
        expected.left.right.next = expected.right.left;
 
        assertThat(solution.connect(root), is(expected));
    }
}
