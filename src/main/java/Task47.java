public class Task47 {
    static boolean eraseChains(int[][] board){
        /**
         * Scans the game board for chains of three identical jewels in horizontal,
         * vertical, and diagonal directions.
         * The method uses a two-pass approach: it first maps all valid chains using a
         * boolean mask to safely handle intersecting matches (like L-shapes or T-shapes)
         * without modifying the board directly. In the second pass, all marked
         * jewels are erased by setting their value to 0.
         *
         * @param board the 2D integer array representing the current game board
         * @return true if at least one chain was found and erased; false if no matches occurred
         */
        boolean[][] toErase = new boolean[board.length][board[0].length];
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[row].length; col++){

                // Horizontal match
                if(col > 1){
                    if(board[row][col] == board[row][col - 1] && board[row][col - 1] == board[row][col - 2]){
                        toErase[row][col] = true;
                        toErase[row][col - 1] = true;
                        toErase[row][col - 2] = true;
                    }
                }

                if(row > 1){
                    // Vertical match
                    if(board[row][col] == board[row - 1][col] && board[row - 1][col] == board[row - 2][col]){
                        toErase[row][col] = true;
                        toErase[row - 1][col] = true;
                        toErase[row - 2][col] = true;
                    }

                    // Diagonal match towards top-left (\)
                    if(col > 1){
                        if(board[row][col] == board[row - 1][col - 1] && board[row - 1][col - 1] == board[row - 2][col - 2]){
                            toErase[row][col] = true;
                            toErase[row - 1][col - 1] = true;
                            toErase[row - 2][col - 2] = true;
                        }
                    }

                    // Diagonal match towards top-right (/)
                    if(col < board[row].length - 2){
                        if(board[row][col] == board[row - 1][col + 1] && board[row - 1][col + 1] == board[row - 2][col + 2]){
                            toErase[row][col] = true;
                            toErase[row - 1][col + 1] = true;
                            toErase[row - 2][col + 2] = true;
                        }
                    }
                }
            }
        }

        boolean erased = false;
        for (int row = 0; row < toErase.length; row++) {
            for (int col = 0; col < toErase[row].length; col++) {
                if(toErase[row][col]){
                    board[row][col] = 0;
                    erased = true;
                }
            }
        }
        return erased;
    }

    private static void printBoard(int[][] board){
        for (int[] row: board){
            for(int element: row){
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    static void main() {
        int[][] firstBoard = {
                {1, 2, 3, 3, 3, 4},
                {1, 3, 2, 4, 2, 4},
                {1, 2, 4, 2, 4, 4},
                {1, 2, 3, 5, 5, 5},
                {1, 2, 1, 3, 4, 4}
        };
        System.out.println("First Board:\nBefore");
        printBoard(firstBoard);
        System.out.println("\nAfter");
        System.out.println("Erased?: " + eraseChains(firstBoard));
        printBoard(firstBoard);

        int[][] secondBoard = {
                {1, 1, 1, 2},
                {1, 1, 3, 4},
                {1, 2, 1, 3}
        };

        System.out.println("\nSecond Board:\nBefore");
        printBoard(secondBoard);
        System.out.println("\nAfter");
        System.out.println("Erased?: " + eraseChains(secondBoard));
        printBoard(secondBoard);
    }
}