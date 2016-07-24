package questions;

/**
 * Created by Paul on 2016/7/24.
 */
public class PowerOfFour {
    public boolean isPowerOfFour(int num) {
        if (num < 1) return false;
        int filter = 0b01010101010101010101010101010101;
        if (((num -1) & num) == 0) {
            return (num & filter) == num;
        }
        return false;
    }

}
