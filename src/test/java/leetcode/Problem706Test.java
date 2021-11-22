package leetcode;

import org.junit.Test;

public class Problem706Test {
    private final Problem706 solution = new Problem706();
    
    @Test
    public void example1() {
        Problem706.MyHashMap myHashMap = solution.new MyHashMap();
        myHashMap.put(1, 1);
        myHashMap.put(2, 2);
        assert myHashMap.get(1) == 1;
        assert myHashMap.get(3) == -1;
        myHashMap.put(2, 1);
        assert myHashMap.get(2) == 1;
        myHashMap.remove(2);
        assert myHashMap.get(2) == -1;
    }
}
