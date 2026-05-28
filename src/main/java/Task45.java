public class Task45 {
    /**
     * Rotates an N x N 2D generic array (matrix) 90 degrees clockwise in-place.
     * 1. It transposes the matrix by swapping elements across the main diagonal.
     * 2. It flips the matrix horizontally by reversing the elements in each row.
     * Note: This algorithm requires a strictly square (N x N) matrix to function correctly.
     *
     * @param array the square 2D array to be rotated
     * @param <T>   the generic type of the array elements
     */
    static <T> void rotateInplace(T[][] array){
        if(array == null || array.length == 0)
            return;

        printArray(array);
        System.out.println(" ".repeat(array.length * 3 / 2) + "↓");

        for (int i = 0; i < array.length; i++) {
            for (int y = i + 1; y < array[i].length; y++) {
                T temp = array[i][y];
                array[i][y] = array[y][i];
                array[y][i] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int y = 0, j = array[i].length - 1; y < array[i].length / 2; y++, j--) {
                T temp = array[i][y];
                array[i][y] = array[i][j];
                array[i][j] = temp;
            }
        }

        printArray(array);
    }

    private static <T> void printArray(T[][] array){
        for (T[] a: array){
            for (T item: a){
                System.out.print(item + "  ");
            }
            System.out.println();
        }
    }

    public static void main() {
        String[][] array = new String[][] {
                {"1", "2", "3", "4", "5", "6"},
                {"J", "K", "L", "M", "N", "7"},
                {"I", "V", "W", "X", "O", "8"},
                {"H", "U", "Z", "Y", "P", "9"},
                {"G", "T", "S", "R", "Q", "0"},
                {"F", "E", "D", "C", "B", "A"}
        };
        rotateInplace(array);
    }
}
