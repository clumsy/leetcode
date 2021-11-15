package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem117Test {
    private final Problem117 solution = new Problem117();

    @Test
    public void example1() {
        // [1,2,3,4,5,null,7]
        Problem117.Node root = solution.new Node(1);
        root.left = solution.new Node(2);
        root.right = solution.new Node(3);
        root.left.left = solution.new Node(4);
        root.left.right = solution.new Node(5);
        root.right.right = solution.new Node(7);

        Problem117.Node expected = solution.new Node(1);
        expected.left = solution.new Node(2);
        expected.right = solution.new Node(3);
        expected.left.next = expected.right;
        expected.left.left = solution.new Node(4);
        expected.left.right = solution.new Node(5);
        expected.left.left.next = expected.left.right;
        expected.right.right = solution.new Node(7);
        expected.left.right.next = expected.right.right;
 
        assert Objects.equals(solution.connect(root), expected);
    }

    @Test
    public void example2() {
        // []
        assert Objects.equals(solution.connect(null), null);
    }

    @Test
    public void example3() {
        // [1,2,3,4,5,null,7]
        Problem117.Node root = solution.new Node(1);
        root.left = solution.new Node(2);
        root.right = solution.new Node(3);
        root.left.left = solution.new Node(4);
        root.right.right = solution.new Node(5);

        Problem117.Node expected = solution.new Node(1);
        expected.left = solution.new Node(2);
        expected.right = solution.new Node(3);
        expected.left.next = expected.right;
        expected.left.left = solution.new Node(4);
        expected.right.right = solution.new Node(5);
        expected.left.left.next = expected.right.right;
 
        assert Objects.equals(solution.connect(root), expected);
    }

    @Test
    public void example4() {
        Problem117.Node root = solution.new Node(2);
        root.left = solution.new Node(1);
        root.right = solution.new Node(3);
        root.left.left = solution.new Node(0);
        root.left.right = solution.new Node(7);
        root.right.left = solution.new Node(9);
        root.right.right = solution.new Node(1);
        root.left.left.left = solution.new Node(2);
        root.left.right.left = solution.new Node(1);
        root.left.right.right = solution.new Node(0);
        root.right.left.right = solution.new Node(8);
        root.right.right.left = solution.new Node(8);
        root.right.right.right = solution.new Node(8);
        root.left.right.right.left = solution.new Node(7);

        Problem117.Node expected = solution.new Node(2);
        expected.left = solution.new Node(1);
        expected.right = solution.new Node(3);
        expected.left.next = expected.right;
        expected.left.left = solution.new Node(0);
        expected.left.right = solution.new Node(7);
        expected.left.left.next = expected.left.right;
        expected.right.left = solution.new Node(9);
        expected.right.right = solution.new Node(1);
        expected.right.left.next = expected.right.right;
        expected.left.right.next = expected.right.left;
        expected.left.left.left = solution.new Node(2);
        expected.left.right.left = solution.new Node(1);
        expected.left.left.left.next = expected.left.right.left;
        expected.left.right.right = solution.new Node(0);
        expected.right.left.right = solution.new Node(8);
        expected.left.right.right.next = expected.right.left.right;
        expected.left.right.left.next = expected.left.right.right;
        expected.right.right.left = solution.new Node(8);
        expected.right.right.right = solution.new Node(8);
        expected.right.right.left.next = expected.right.right.right;
        expected.right.left.right.next = expected.right.right.left;
        expected.left.right.right.left = solution.new Node(7);
 
        assert Objects.equals(solution.connect(root), expected);
    }

    @Test
    public void example5() {
        // [0,0,0,0,null,null,0,null,null,null,0]
        Problem117.Node root = solution.new Node(0);
        root.left = solution.new Node(0);
        root.right = solution.new Node(0);
        root.left.left = solution.new Node(0);
        root.right.right = solution.new Node(0);
        root.right.right.right = solution.new Node(0);

        Problem117.Node expected = solution.new Node(0);
        expected.left = solution.new Node(0);
        expected.right = solution.new Node(0);
        expected.left.next = expected.right;
        expected.left.left = solution.new Node(0);
        expected.right.right = solution.new Node(0);
        expected.left.left.next = expected.right.right; 
        expected.right.right.right = solution.new Node(0);
 
        assert Objects.equals(solution.connect(root), expected);
    }
}
