package questions;

public class IntegerBreak {
    public int integerBreak(int n) {
        if (n < 3) return 1;
        if (n == 3 ) return 2;

        int remained = n % 3;
        if (remained == 1) {
            return 4 * (int) Math.pow(3, n/3 - 1);
        }

        if (remained == 2) {
            return 2 * (int) Math.pow(3, n/3);
        }

        if (remained == 0) {
            return (int) Math.pow(3, n/3);
        }
        return 0;
    }
}
