package questions;

/**
 * Created by Paul on 2016/7/24.
 */
public class BullsAndCows {
    public String getHint(String secret, String guess) {
        int[] map = new int[10];
        char[] secretChar = secret.toCharArray();
        for (int i = 0; i <secretChar.length; i++) {
            int index = secretChar[i] - '0';
            map[index]++;
        }

        int bull =0 ;
        int cow = 0;

        char[] guessChar = guess.toCharArray();
        for (int i = 0; i < secretChar.length;i++) {
            int index = guessChar[i] - '0';
            if (secretChar[i] == guessChar[i]) {
                map[index]--;
                bull++;
            }
        }

        for (int i = 0; i < secretChar.length;i++) {
            int index = guessChar[i] - '0';
            if (secretChar[i] != guessChar[i]) {
                if (map[index] > 0) {
                    cow++;
                    map[index]--;
                }
            }
        }
        return bull + "A" + cow + "B";
    }

}
