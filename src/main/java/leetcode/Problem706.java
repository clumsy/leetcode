package leetcode;

@Difficulty(Level.EASY)
@Algorithms(Algorithm.MAP)
@BeatsPercent(70.02)
public class Problem706 {
    public class MyHashMap {
        private final int[] vals = new int[(int) 1e6 + 1];

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public MyHashMap() {

        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void put(int key, int value) {
            vals[key] = value + 1;
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public int get(int key) {
            return vals[key] - 1;
        }

        @TimeComplexity(worst = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void remove(int key) {
            vals[key] = 0;
        }
    }
}
