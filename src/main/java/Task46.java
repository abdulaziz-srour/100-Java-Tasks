import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task46 {
    /**
     * Generates a random Match-3 game board without any pre-existing matches.
     * The algorithm fills the board row by row and ensures that no 3-in-a-row
     * sequences occur horizontally, vertically, or in either diagonal direction.
     *
     * @param columns     the number of columns (width) of the board
     * @param row         the number of rows (height) of the board
     * @param typesAmount the number of available unique jewel types
     * @return a 2D integer array representing the valid game board
     * @throws IllegalArgumentException if typesAmount is less than 5
     */
    static int[][] initJewelsBoard(int columns, int row, int typesAmount){
        if(typesAmount < 3)
            throw new IllegalArgumentException("Match-3 boards require at least 3 jewel types.");

        int[][] array = new int[row][columns];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                while(array[i][y] == 0){
                    int randomNumber = r.nextInt(1,typesAmount + 1);

                    // 1. Horizontal check
                    if(y > 1)
                        if(array[i][y - 1] == randomNumber && array[i][y - 2] == randomNumber)
                            continue;


                    if(i > 1) {
                        // 2. Vertical check
                        if (array[i - 1][y] == randomNumber && array[i - 2][y] == randomNumber)
                            continue;

                        // 3. Diagonal check looking top-left (\)
                        if(y > 1){
                            if(array[i - 1][y - 1] == randomNumber && array[i - 2][y - 2] == randomNumber)
                                continue;
                        }

                        // 4. Diagonal check looking top-right (/)
                        if(y < array[i].length - 2){
                            if(array[i - 1][y + 1] == randomNumber && array[i - 2][y + 2] == randomNumber)
                                continue;
                        }
                    }

                    array[i][y] = randomNumber;
                }
            }
        }
        return array;
    }

    /**
     * Validates a given Match-3 game board for any illegal 3-in-a-row matches.
     * The method scans the board and checks for horizontal, vertical, and both
     * diagonal matches. If any matches are found, a detailed error message
     * containing the exact coordinates and match type is added to the result list.
     *
     * @param array the 2D integer array representing the game board to be checked
     * @return a List of String messages detailing any found invalid matches, or an empty list if the board is perfectly valid
     */
    public static List<String> checkBoardValidity(int[][] array){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                if(i > 1){
                    // Vertical match
                    if(array[i][y] == array[i - 1][y] && array[i - 1][y] == array[i - 2][y])
                        list.add("Invalid at x=" + i + " y=" + y + " tests: hor=false, ver=true, dia=false");

                    // Diagonal match towards top-right (/)
                    if(y < array[i].length - 2){
                        if(array[i][y] == array[i - 1][y + 1] && array[i - 1][y + 1] == array[i - 2][y + 2])
                            list.add("Invalid at x=" + i + " y=" + y + " tests: hor=false, ver=false, dia=true");
                    }

                    // Diagonal match towards top-left (\)
                    if(y > 1){
                        if(array[i][y] == array[i - 1][y - 1] && array[i - 1][y - 1] == array[i - 2][y - 2])
                            list.add("Invalid at x=" + i + " y=" + y + " tests: hor=false, ver=false, dia=true");
                    }
                }

                // Horizontal match
                if(y > 1)
                    if(array[i][y] == array[i][y - 1] && array[i][y - 1] == array[i][y - 2])
                        list.add("Invalid at x=" + i + " y=" + y + " tests: hor=true, ver=false, dia=false");
            }
        }
        return list;
    }

    public static void main() {
        int[][] board = initJewelsBoard(10, 10, 4);
        for (int[] array: board){
            for(int element: array){
                System.out.print(element + " ");
            }
            System.out.println();
        }

        System.out.println();

        int[][] values = {
                {2, 3, 3, 4, 4, 3, 2},
                {1, 3, 3, 1, 3, 4, 4},
                {4, 1, 4, 3, 3, 1, 3},
                {2, 2, 1, 1, 2, 3, 2},
                {3, 2, 4, 4, 3, 3, 4}
        };

        List<String> list = checkBoardValidity(values);
        for(String s : list)
            System.out.println(s);
    }
}
