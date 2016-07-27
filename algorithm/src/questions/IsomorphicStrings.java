package questions;

import java.util.HashMap;

/**
 * Created by Paul on 2016/7/27.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) return false;
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < sChars.length; i++) {
            if (map.containsKey(tChars[i])) {
                if (sChars[i] != map.get(tChars[i])) return false;
            } else {
                if (!map.containsValue(sChars[i])) {
                    return false;
                }
                map.put(tChars[i], sChars[i]);
            }
        }
        return true;
    }

}
