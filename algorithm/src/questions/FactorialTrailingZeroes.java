package questions;

import org.junit.Test;

/**
 * Created by Paul on 2016/7/23.
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int counter = 0;
        while (n/5 > 0) {
            counter += n / 5;
            n = n/5;
        }
        return counter;
    }

    @Test
    public void test() {
        FactorialTrailingZeroes factorialTrailingZeroes = new FactorialTrailingZeroes();
        trailingZeroes(10);
    }
}
