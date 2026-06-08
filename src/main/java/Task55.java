public class Task55 {
    /**
     * Initializes a 2D boolean grid representing a minefield, where each cell
     * has a specified probability of containing a bomb.
     *
     * @param row         the number of rows in the minefield
     * @param col         the number of columns in the minefield
     * @param probability the chance (between 0.0 and 1.0) of a bomb being placed in any given cell
     * @return a 2D boolean array where true represents a bomb and false represents an empty space
     */
    boolean[][] placeBombsRandomly(int row, int col, double probability){
        boolean[][] array = new boolean[row][col];
        for(boolean[] r: array){
            for (int i = 0; i < r.length; i++) {
                r[i] = Math.random() < probability;
            }
        }
        return array;
    }

    /**
     * Calculates the number of adjacent bombs for every empty cell in the minefield.
     * It checks all eight possible surrounding directions (horizontal, vertical, and diagonal)
     * while safely handling the edges of the board.
     *
     * @param bombsArray the 2D boolean array representing the locations of the bombs
     * @return a 2D integer array where -1 indicates a bomb, and any other number (0-8)
     * represents the count of bombs in the directly surrounding cells
     */
    int[][] calcBombCount(boolean[][] bombsArray){
        int[][] countArray = new int[bombsArray.length][bombsArray[0].length];
        for (int i = 0; i < bombsArray.length; i++) {
            for (int j = 0; j < bombsArray[i].length; j++) {
                if(bombsArray[i][j]){
                    countArray[i][j] = -1;
                }
                else {
                    int count = 0;
                    if(i > 0) {
                        if (bombsArray[i - 1][j])
                            count++;
                        if(j > 0){
                            if (bombsArray[i - 1][j - 1])
                                count++;
                        }
                        if(j < bombsArray[i].length - 1)
                            if(bombsArray[i - 1][j + 1])
                                count++;
                    }
                    if(i < bombsArray.length - 1){
                        if (bombsArray[i + 1][j])
                            count++;
                        if(j > 0){
                            if (bombsArray[i + 1][j - 1])
                                count++;
                        }
                        if(j < bombsArray[i].length - 1)
                            if(bombsArray[i + 1][j + 1])
                                count++;
                    }

                    if(j > 0)
                        if(bombsArray[i][j - 1])
                            count++;

                    if(j < bombsArray[i].length - 1)
                        if(bombsArray[i][j + 1])
                            count++;

                    countArray[i][j] = count;
                }
            }
        }
        return countArray;
    }

    private void printBoard(boolean[][] bombsArray, char bombChar, int[][] countArray){
        System.out.println("Game field with (" + bombChar + ") for Bomb and (.) for Empty field");
        for(boolean[] r: bombsArray){
            for (boolean b : r) {
                if (b)
                    System.out.print(bombChar + " ");
                else
                    System.out.print(". ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Shows the Bomb (" + bombChar + ") or the number of bombs surrounding the field");
        for (int[] r : countArray) {
            for (int i : r) {
                if (i == -1)
                    System.out.print(bombChar + " ");
                else
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    void main() {
        boolean[][] bombsArray = placeBombsRandomly(5, 5, 0.5);
        int[][] countArray = calcBombCount(bombsArray);
        printBoard(bombsArray, 'B', countArray);
    }
}
