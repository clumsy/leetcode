package leetcode;

import org.junit.Test;

import java.util.Objects;

public class Problem297Test {
    private final Problem297 solution = new Problem297();
    
    @Test
    public void example1() {
        TreeNode root = TreeNodes.treeOf(1,2,3,null,null,4,5);
        Problem297.Codec codec = solution.new Codec();
        assert Objects.equals(codec.deserialize(codec.serialize(root)), root);
    }
    
    @Test
    public void example2() {
        TreeNode root = TreeNodes.treeOf();
        Problem297.Codec codec = solution.new Codec();
        assert Objects.equals(codec.deserialize(codec.serialize(root)), root);
    }
    
    @Test
    public void example3() {
        TreeNode root = TreeNodes.treeOf(1);
        Problem297.Codec codec = solution.new Codec();
        assert Objects.equals(codec.deserialize(codec.serialize(root)), root);
    }
    
    @Test
    public void example4() {
        TreeNode root = TreeNodes.treeOf(1,2);
        Problem297.Codec codec = solution.new Codec();
        assert Objects.equals(codec.deserialize(codec.serialize(root)), root);
    }
}
