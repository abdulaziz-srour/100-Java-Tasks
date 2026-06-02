import java.util.*;

public class Task50 {
    /**
     * Determines if a given 9x9 Sudoku board is valid.
     * The board is considered valid if it satisfies the following rules:
     * 1. Each row contains the digits 1-9 without repetition.
     * 2. Each column contains the digits 1-9 without repetition.
     * 3. Each of the nine 3x3 sub-boxes contains the digits 1-9 without repetition.
     *
     * The method uses a  single-pass algorithm. It iterates through the
     * board and attempts to add unique string identifiers for each number's row, column,
     * and 3x3 block to a HashSet. Empty cells (represented by 0) are ignored. If any
     * insertion fails, a duplicate is instantly detected.
     *
     * @param board a 2D integer array representing the 9x9 Sudoku grid
     * @return true if the current state of the board is valid, false if any duplicates exist
     */
    boolean isSudokuValid(int[][] board) {
        if (board == null || board.length != 9 || board[0].length != 9)
            return false;

        Set<String> seen = new HashSet<>();

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board.length; col++) {
                int value = board[row][col];
                if (value > 0 && value < 10) {
                    if (!seen.add(value + "in row " + row) ||
                            !seen.add(value + "in col " + col) ||
                            !seen.add(value + "in block " + (row / 3) + "-" + (col / 3)))
                        return false;
                }
            }
        }
        return true;
    }
}
