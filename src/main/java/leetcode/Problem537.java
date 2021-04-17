package leetcode;

@BeatsPercent(83.23)
@TimeComplexity(Complexity.CONSTANT)
@SpaceComplexity(Complexity.CONSTANT)
public class Problem537 {
    static class Complex {
        public static Complex parse(String s) {
            int separator = s.indexOf('+');
            Complex number = new Complex();
            number.re = Integer.parseInt(s.substring(0, separator));
            number.im = Integer.parseInt(s.substring(separator + 1, s.length() - 1));
            return number;
        }

        int re;
        int im;

        public Complex multiply(Complex other) {
            Complex product = new Complex();
            product.re = this.re*other.re - this.im*other.im;
            product.im = this.re*other.im + this.im*other.re;
            return product;
        }

        public String toString() {
            return re + "+" + im + "i";
        }
    }

    public String complexNumberMultiply(String a, String b) {
        return Complex.parse(a).multiply(Complex.parse(b)).toString();
    }
}
