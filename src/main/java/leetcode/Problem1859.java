package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.SIMULATION)
@BeatsPercent(84.63)
@TimeComplexity(worst = Complexity.N_TO_K) // where K is the max length of a word
@SpaceComplexity(worst = Complexity.N_TO_K) // where K is the max length of a word
public class Problem1859 {
    public String sortSentence(String s) {
        String[] chunks = s.split(" ");
        String[] words = new String[chunks.length];
        for (String word : chunks) {
            words[word.charAt(word.length() - 1) - '1'] = word.substring(0, word.length() - 1);
        }
        return String.join(" ", words);
    }
}
