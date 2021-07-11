package leetcode;

@BeatsPercent(100)
@TimeComplexity(worst = Complexity.CONSTANT)
@SpaceComplexity(worst = Complexity.CONSTANT)
public class Problem1716 {
    public int totalMoney(int n) {
        int money = 0;
        for (int i = 0; i < 7; i++) {
            int weeks = (n - 1 - i)/7;
            if (n - i > 0) {
                weeks++;
            }
            int today = 1 + i;
            money += (today + (today + weeks - 1))*weeks/2;
        }
        return money;
    }
}
