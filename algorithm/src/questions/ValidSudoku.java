package questions;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Paul on 2016/7/23.
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (!isValid(board[i])) return false;
        }
        for (int i = 0; i < board.length; i++) {
            boolean[] set = new boolean[9];
            for (int j = 0; j < 9; j++) {
                int num = board[j][i];
                if (num == '.') continue;
                num -= '1';
                if (set[num])  {
                    return false;
                }else {
                    set[num] = true;
                }
            }
        }

        for (int i = 0; i< board.length; i=i+3) {
            for (int j = 0; j < board.length; j = j+3) {
                if (!isValidSquare(board,i,j)) return false;
            }
        }

        return true;
    }
    public boolean isValid(char[] row) {
        boolean[] set = new boolean[9];
        for (int i = 0; i < row.length; i++) {
            int num = row[i];
            if (num == '.') continue;
            num -= '1';
            if (set[num]) {
                return false;
            } else {
                set[num] = true;
            }
        }
        return true;
    }

    public boolean isValidSquare(char[][] board, int startX, int startY) {
        boolean[] set = new boolean[9];
        for (int i = startX; i < startX + 3; i++) {
            for (int j = startY; j < startY + 3; j++) {
                int num = board[i][j];
                if (num == '.') continue;
                num -= '1';
                if (set[num]) {
                    return false;
                }else {
                    set[num] = true;
                }
            }
        }
        return true;
    }
    @Test
    public void test() {
        String[] strings = {"....5..1.",".4.3.....",".....3..1","8......2.","..2.7....",".15......",".....2...",".2.9.....","..4......"};
        char[][] test = new char[9][9];
        for (int i = 0; i < strings.length; i++) {
            test[i] = strings[i].toCharArray();
        }

        ValidSudoku validSudoku = new ValidSudoku();
        boolean isValid = validSudoku.isValidSudoku(test);
        assertFalse(isValid);
    }
}
