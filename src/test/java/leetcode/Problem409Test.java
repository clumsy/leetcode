package leetcode;

import org.junit.Test;

public class Problem409Test {
    private final Problem409 solution = new Problem409();
    
    @Test
    public void example1() {
        assert solution.longestPalindrome("abccccdd") == 7;
    }
    
    @Test
    public void example2() {
        assert solution.longestPalindrome("a") == 1;
    }
    
    @Test
    public void example3() {
        assert solution.longestPalindrome("bb") == 2;
    }
    
    @Test
    public void example4() {
        assert solution.longestPalindrome("ccc") == 3;
    }
    
    @Test
    public void example5() {
        assert solution.longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth") == 983;
    }
}
