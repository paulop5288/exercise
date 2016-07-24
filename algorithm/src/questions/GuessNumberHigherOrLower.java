package questions;

/**
 * Created by Paul on 2016/7/24.
 */
public class GuessNumberHigherOrLower {
    public int guessNumber(int n) {
        return guessBetween(1, n);
    }

    public int guessBetween(int a, int b) {
        for (;;) {
            if (b - a < 2) {
                if (guess(a) == 0) return a;
                if (guess(b) == 0) return b;
            }
            int num = (a - b)/2 + b ;
            int guess = guess(num);
            if (guess == 1) {
                a = num;
                continue;
            }
            if (guess == -1) {
                b = num;
                continue;
            }
            return num;
        }
    }

    public int guess(int n) {
        return 0;
    }
}
