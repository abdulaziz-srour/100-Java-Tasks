public class Task51 {
    /**
     * Performs a standard recursive flood fill starting from the given coordinates.
     * The method checks if the current cell is an empty space (' ') and replaces it with an asterisk ('*').
     * It then recursively calls itself to fill all connected empty spaces in the four cardinal directions
     * (up, right, down, left).
     *
     * @param array the 2D character array representing the canvas or grid
     * @param x     the starting row index
     * @param y     the starting column index
     */
    static void floodFill(char[][] array, int x, int y){
        if(x < 0|| y < 0 || x >= array.length || y >= array[x].length)
            return;

        if(array[x][y] == ' ') {
            array[x][y] = '*';

            floodFill(array, x - 1, y);
            floodFill(array, x, y + 1);
            floodFill(array, x + 1, y);
            floodFill(array, x, y - 1);
        }
    }

    /**
     * Performs a recursive flood fill that replaces empty spaces (' ') with a repeating 2D pattern.
     * Instead of a single replacement character, it calculates the correct character from the pattern
     * using modulo arithmetic based on the current x and y coordinates.
     * It then recursively fills the four adjacent directions.
     *
     * @param array   the 2D character array representing the canvas or grid
     * @param pattern the 2D character array containing the pattern to be tiled
     * @param x       the starting row index
     * @param y       the starting column index
     */
    static void floodFillWithPattern(char[][] array, char[][] pattern,
                                     int x, int y){
        if(x < 0|| y < 0 || x >= array.length || y >= array[x].length)
            return;

        if(array[x][y] == ' ') {
            int row = x % pattern.length;
            int col = y % pattern[row].length;
            array[x][y] = pattern[row][col];

            floodFillWithPattern(array, pattern, x - 1, y);
            floodFillWithPattern(array, pattern, x, y + 1);
            floodFillWithPattern(array, pattern, x + 1, y);
            floodFillWithPattern(array, pattern, x, y - 1);
        }
    }

    private static void printArray(char[][] array){
        for (char[] row : array) {
            for (int col = 0; col < row.length; col++) {
                System.out.print(row[col]);
            }
            System.out.println();
        }
    }

    static void main() {
        char[][] firstArray = {
                "\"   # \"".toCharArray(),
                "\"    #\"".toCharArray(),
                "\"#   #\"".toCharArray(),
                "\" # # \"".toCharArray(),
                "\"  #  \"".toCharArray(),
        };
        System.out.println("First Array: ");
        System.out.println("Before: ");
        printArray(firstArray);
        floodFill(firstArray, 0, 1);
        System.out.println("After: ");
        printArray(firstArray);

        System.out.println();
        char[][] secondArray = {
                "\"   #      #\"".toCharArray(),
                "\"    #      #\"".toCharArray(),
                "\"#   #     #\"".toCharArray(),
                "\" # #     #\"".toCharArray(),
                "\"  #     #\"".toCharArray(),
        };
        System.out.println("Second Array: ");
        System.out.println("Before: ");
        printArray(secondArray);
        floodFill(secondArray, 0, 6);
        System.out.println("After: ");
        printArray(secondArray);

        System.out.println();
        char[][] thirdArray = {
                "      x".toCharArray(),
                "    #  #".toCharArray(),
                "   ###  #".toCharArray(),
                "#  ###  #".toCharArray(),
                "#   #   #".toCharArray(),
                "# #   #".toCharArray(),
                "#   #".toCharArray()
        };
        char[][] pattern = {
                ".|.".toCharArray(),
                "-*-".toCharArray(),
                ".|.".toCharArray()
        };
        System.out.println("Third Array: ");
        System.out.println("Before: ");
        System.out.println("Array:");
        printArray(thirdArray);
        System.out.println("Pattern:");
        printArray(pattern);
        floodFillWithPattern(thirdArray, pattern, 0, 0);
        System.out.println("After: ");
        printArray(thirdArray);
    }
}
