import java.util.Random;

public class Task46 {
    /**
     * Initializes a Match-3 (Jewels) game board with random jewel types.
     * The algorithm ensures that no pre-existing matches (3 or more of the same type
     * horizontally or vertically) exist upon generation. It uses rejection sampling
     * to reroll invalid jewels on the fly.
     *
     * @param rows        the number of rows on the board
     * @param columns     the number of columns on the board
     * @param typesAmount the total number of unique jewel types available
     * @return a 2D integer array representing the populated game board
     * @throws IllegalArgumentException if typesAmount is less than 3, which would cause an infinite loop
     */
    static int[][] initJewelsBoard(int rows, int columns, int typesAmount){
        if(typesAmount < 3)
            throw new IllegalArgumentException("Match-3 boards require at least 3 jewel types.");

        int[][] array = new int[columns][rows];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                while(array[i][y] == 0){
                    int randomNumber = r.nextInt(1,typesAmount + 1);
                    if(y > 1)
                        if(array[i][y - 1] == randomNumber && array[i][y - 2] == randomNumber)
                            continue;

                    if(i > 1)
                        if(array[i - 1][y] == randomNumber && array[i - 2][y] == randomNumber)
                            continue;

                    array[i][y] = randomNumber;
                }
            }
        }
        return array;
    }

    public static void main() {
        int[][] board = initJewelsBoard(10, 10, 4);
        for (int[] array: board){
            for(int element: array){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
