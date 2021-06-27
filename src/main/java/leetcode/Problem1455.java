package leetcode;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.LINEAR_N)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int start = -1;
        int index = 0;
        do {
            index++;
            if (sentence.indexOf(searchWord, start + 1) == start + 1) {
                return index;
            }
            start = sentence.indexOf(" ", start + 1);
        } while (start != -1);
        return -1;
    }
}
