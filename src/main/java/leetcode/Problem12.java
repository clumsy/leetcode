package leetcode;

public class Problem12 {
    public static class Alternative extends Problem12 {
        private enum Roman {
            M(1000),
            CM(900),
            D(500),
            CD(400),
            C(100),
            XC(90),
            L(50),
            XL(40),
            X(10),
            IX(9),
            V(5),
            IV(4),
            I(1);

            private final int value;

            Roman(int value) {
                this.value = value;
            }
        }

        @Override
        public String intToRoman(int num) {
            StringBuilder result = new StringBuilder();
            for (Roman number : Roman.values()) {
                int factor = num/number.value;
                if (factor > 0) {
                    while (factor-- > 0) {
                        result.append(number.name());
                    }
                    num %= number.value;
                }
            }
            return result.toString();
        }
    }

    public static class Alternative2 extends Problem12 {

        @Override
        public String intToRoman(int num) {
            if (num >= 1000) {
                return repeat("M", num/1000) + intToRoman(num%1000);
            }
            if (num >= 900) {
                return "CM" + intToRoman(num - 900);
            }
            if (num >= 500) {
                return "D" + repeat("C", (num - 500)/100) + intToRoman(num%100);
            }
            if (num >= 400) {
                return "CD" + intToRoman(num - 400);
            }
            if (num >= 100) {
                return repeat("C", num/100) + intToRoman(num%100);
            }
            if (num >= 90) {
                return "XC" + intToRoman(num - 90);
            }
            if (num >= 50) {
                return "L" + repeat("X", (num - 50)/10) + intToRoman(num%10);
            }
            if (num >= 40) {
                return "XL" + intToRoman(num - 40);
            }
            if (num >= 10) {
                return repeat("X", num/10) + intToRoman(num%10);
            }
            if (num == 9) {
                return "IX";
            }
            if (num >= 5) {
                return "V" + repeat("I", num - 5);
            }
            if (num == 4) {
                return "IV";
            }
            return repeat("I", num);
        }

        private static String repeat(final String s, int times) {
            if (times == 1) {
                return s;
            }
            StringBuilder string = new StringBuilder();
            while (times-- > 0) {
                string.append(s);
            }
            return string.toString();
        }
    }

    private static String[] ROMANS = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static int[] FACTORS = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ROMANS.length; i++) {
            int factor = num/FACTORS[i];
            if (factor > 0) {
                while (factor-- > 0) {
                    result.append(ROMANS[i]);
                }
                num %= FACTORS[i];
            }
        }
        return result.toString();
    }
}
